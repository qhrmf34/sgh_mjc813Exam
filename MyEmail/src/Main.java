import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Properties prop;
    static Session session;
    static MimeMessage message;
    public static void main(String[] args) throws Exception {
        generateAndSendEmail();
        System.out.println("\n\n ===> Your Java Program has just sent an Email sucessfully. Check your email..");
    }
    public static void generateAndSendEmail() throws Exception{
        final String user="qhrmf34@naver.com";
        final String password="2LXJC7VL58MB";
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.naver.com");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.naver.com");
        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        try {
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("lsungbok102@naver.com"));
            message.setSubject("Test");
            message.setText("This is a test message");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }   catch (AddressException e){
            e.printStackTrace();
        }   catch (MessagingException e){
            e.printStackTrace();
        }

    }
}