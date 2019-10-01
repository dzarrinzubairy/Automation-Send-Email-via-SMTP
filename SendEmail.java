import constant.EmailData.Set;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class SendEmail
{
    public static void sendEmail(Set emailData) throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(emailData.getFrom(),emailData.getPassword()));
        email.setSSLOnConnect(true);
        email.setFrom(emailData.getFrom());
        email.setSubject(emailData.getSubject());
        email.setMsg(emailData.getMessage());
        email.addTo(emailData.getTo());
        email.send();
    }
}