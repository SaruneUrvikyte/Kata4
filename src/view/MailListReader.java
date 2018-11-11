package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import model.Mail;

/**
 * @author Sarune Urvikyte
 */

public class MailListReader {
    
    public List<Mail> read(String fileName){
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            List<Mail> mailList = new LinkedList<>();
            String sCurrentLine;
            Mail mail;
            
            while ((sCurrentLine = br.readLine()) != null){
                if(sCurrentLine.contains("@")){
                    mail = new Mail(sCurrentLine);
                    if(!mail.equals(null)){
                        mailList.add(mail);
                    }
                }
            }
            
            return mailList;
            
        }catch (IOException e) {
            return null;
        }
    }
}
