package Practice;

import com.jcraft.jsch.*;

import java.io.BufferedReader;
import java.io.InputStream;
import com.jcraft.jsch.ChannelSftp.LsEntrySelector;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;
import java.util.Vector;
import com.jcraft.jsch.ChannelSftp.LsEntry;

public class SSH {
    //    String host = "10.30.18.60";
//    String user = "testuser";
//    String password = "date@123";
    static String command = "cd /opt;ls -ltr";


    public static void main(String[] args) throws Exception {
        String host = "10.82.231.178";
        String user = "mridul.das";
        String password = "testuser@123";
        String command1 = "ls -ltr";


            java.util.Properties config = new java.util.Properties();

            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();

            jsch.addIdentity("/Users/mridul.das/id_rsa");
//            jsch.setConfig("StrictHostKeyChecking", "no");
            Session session = jsch.getSession(user, host, 22);
//            session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");


//            Channel channel = session.openChannel("exec");

            Channel channel = session.openChannel("sftp");


//            ((ChannelExec) channel).setCommand("whoami;ls -ltr");


//
//            channel.setInputStream(null);
//            ((ChannelExec) channel).setErrStream(System.err);
//
//
//
            InputStream in = channel.getInputStream();
            channel.connect();

            ChannelSftp channelSftp = (ChannelSftp) channel;

            channelSftp.cd("/opt");
            Vector filelist = channelSftp.ls("/opt");


//

//        channelSftp.ls("/batchSIT",selector);
        for(int i=0; i<filelist.size();i++){
//            System.out.println(filelist.get(i).toString());

            if(filelist.get(i).toString().endsWith("s"))
            {
                System.out.println(filelist.get(i).toString());
            }
        }


//            byte[] tmp = new byte[1024];
//            while (true) {
//                while (in.available() > 0) {
//                    int i = in.read(tmp, 0, 1024);
//                    if (i < 0) break;
//                    System.out.print(new String(tmp, 0, i));
//                }
//                if (channel.isClosed()) {
//                    System.out.println("exit-status: " + channel.getExitStatus());
//                    break;
//                }
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception ee) {
//                }
//            }
            channel.disconnect();
            session.disconnect();
            System.out.println("DONE");

//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }

            }
        }


