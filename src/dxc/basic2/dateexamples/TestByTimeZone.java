package dxc.basic2.dateexamples;

 
import java.text.*;
import java.util.*;

public class TestByTimeZone
{
    public List<String> names;

    public static void main(String [] args)
        throws Exception // Just for simplicity!
    {
        String fromDateString = "Wed Jul 08 17:08:48 GMT 2009";
        DateFormat formatter = new SimpleDateFormat
            ("EEE MMM dd HH:mm:ss zzz yyyy");
        
        
        Date fromDate = (Date)formatter.parse(fromDateString);
        
        TimeZone central = TimeZone.getTimeZone("America/Chicago");
        formatter.setTimeZone(central);
        
        System.out.println(formatter.format(fromDate));
        
        TimeZone central1 = TimeZone.getTimeZone("Indian/Maldives");
        formatter.setTimeZone(central1);
        
        
        System.out.println(formatter.format(fromDate));
        
        
    }
}