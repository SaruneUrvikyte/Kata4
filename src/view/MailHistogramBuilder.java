package view;

import java.util.List;
import model.Histogram;
import model.Mail;

/**
 * @author Sarune Urvikyte
 */

public class MailHistogramBuilder {
    
    public Histogram <String> build(List<Mail> mailList){
        
        Histogram<String> histogram = new Histogram<String>();
        String domain;
        
        for (Mail mail : mailList) {
            domain = mail.getDomain();
            if(!domain.equals(null)){
                histogram.increment(domain);
            }
        }
        
        return histogram;
    }
}
