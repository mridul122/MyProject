package Practice.serialization;

public class Payload {


    //public String  name;
    public Credentials credentials;

    public Payload(Credentials credentials)
    {
        //this.name=name;
        this.credentials=credentials;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
    //}


}
