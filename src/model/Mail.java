package model;

/**
 * @author Sarune Urvikyte
 */

public class Mail {
    
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        
        String domain = null;
        int index = mail.indexOf('@');
        
        if(index >= 0){
            domain = mail.substring(index+1);
            return domain;
        }
        
        return null;
    }
}
