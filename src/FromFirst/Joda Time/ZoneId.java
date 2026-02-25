import java.time.*;

class Main {
    public static void main(String[] args) {
       
       ZoneId zone = ZoneId.systemDefault();
       System.out.println("System default is: " + zone);
       
       LocalDateTime ldt = LocalDateTime.now();
       System.out.println("Today is: " + ldt);
       
       ZoneId la = ZoneId.of("America/Los_Angeles"); // Asia/Kolkata
       
       ZonedDateTime zdt = ZonedDateTime.now(la);
       System.out.println("Time in los angeles is: " + zdt);
       
    }
}
