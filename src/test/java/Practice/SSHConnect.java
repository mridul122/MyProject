package Practice;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;
import com.jcraft.jsch.ChannelExec;

import java.io.InputStream;

public class SSHConnect {

    public static void main(String[] args) throws Exception {
        JSch jsch = new JSch();
        java.util.Properties config = new java.util.Properties();
        //config.put("StrictHostKeyChecking", "no");

        String user = "mridul.das";
        String host = "bastion01.awscmg-dev.dwpcloud.uk";
        int port = 6622;

        Session session = jsch.getSession(user, host, port);
        session.setPassword("date@123");
        jsch.addIdentity("/Users/mridul.das/id_rsa");
        session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
        session.setConfig(config);
        session.connect();


        Channel channel=session.openChannel("exec");
        ((ChannelExec)channel).setCommand("ls -ltr");
        channel.setInputStream(null);
        ((ChannelExec)channel).setErrStream(System.err);


        InputStream in=channel.getInputStream();
        channel.connect();
        byte[] tmp=new byte[1024];
        while(true){
            while(in.available()>0){
                int i=in.read(tmp, 0, 1024);
                if(i<0)break;
                System.out.print(new String(tmp, 0, i));
            }
            if(channel.isClosed()){
                System.out.println("exit-status: "+channel.getExitStatus());
                break;
            }
            try{Thread.sleep(1000);}catch(Exception ee){}
        }
        channel.disconnect();
        session.disconnect();
        System.out.println("DONE");
    }


    }

