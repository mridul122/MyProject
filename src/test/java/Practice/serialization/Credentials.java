package Practice.serialization;

public class Credentials {

    public String uid;
    public String pwd;


    public Credentials(String uid,String pwd)
    {
        this.uid=uid;
        this.pwd=pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
