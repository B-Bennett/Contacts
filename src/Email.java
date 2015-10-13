/**
 * Created by BennettIronYard on 10/8/15.
 */
public class Email {
    public String subject;
    public String body;
    public String destination;
    public int timeStamp;

    public Email(){
        System.out.println("Creating email...");
        subject = "No Subject";
        body = "";
        destination = "";
        timeStamp = 0;
    }
    public Email(String subject, String body, String destination, int timeStamp){
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.timeStamp = timeStamp;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setBody(String body){
        this.body = body;
    }
    public String setBody(){
        return body;
    }

    public static boolean isValidSubject(String subject){

        return subject.length() !=0;
    }

}
