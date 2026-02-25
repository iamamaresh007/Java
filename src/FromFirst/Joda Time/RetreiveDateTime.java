import java.time.*;

class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        
        System.out.println("Retrived date is " + dd + "-" + mm + "-" + yy);
        
        LocalTime time = LocalTime.now();
        int hh = time.getHour();
        int min = time.getMinute();
        int ss = time.getSecond();
        int nn = time.getNano();
        
        System.out.println("Retrived time is " + hh + "-" + min + "-" + ss + "-" + nn);
    }
}
