package main;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

/**
 * @author Sarune Urvikyte
 */

public class Kata4 {

    private static final String fileName = "src\\email.txt";
    private static List <Mail> mailList;
    private static Histogram <String> histogram;
    private static HistogramDisplay histoDisplay;
    
    public static void main(String[] args) {
        MailListReader mLR = new MailListReader();
        MailHistogramBuilder mHB = new MailHistogramBuilder();
        mailList = mLR.read(fileName);
        histogram = mHB.build(mailList);
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
