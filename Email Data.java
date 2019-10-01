package constant;

public class EmailData
{
    public enum Set
    {
      CONTENT_CONTROL_FILTERING(

                "senderemail@email.com",
                "password",
                "Subject",
                "Body message",
                "recipientemail@gmail.com");


        private final String from;
        private final String password;
        private final String subject;
        private final String message;
        private final String to;

        Set(String from,String password, String subject,String message,String to)
        {
            this.from = from;
            this.password = password;
            this.subject = subject;
            this.message = message;
            this.to = to;
        }  
    
    
       public String getFrom() {
            return from;
        }

        public String getPassword() {
            return password;
        }

        public String getSubject()
        {
            return subject;
        }

        public String getMessage() {
            return message;
        }

        public String getTo() {
            return to;
        }    
    }
}
