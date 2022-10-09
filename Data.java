package src.test;
import java.time.*;
import java.util.Date;

public class Data {

    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();




   public String day(){
       String day1 = String.valueOf(Integer.parseInt(Integer.toString(localDate.getDayOfMonth())));
       if (localDate.getDayOfMonth() <=10) {
           String B = Integer.toString(0);
           return B + day1;
       }

       return day1;
   }
public String month(){
    return String.valueOf(Integer.parseInt(Integer.toString(localDate.getMonthValue())));
}
    public String year() {
        return String.valueOf(Integer.parseInt(Integer.toString(localDate.getYear())));
    }
}

