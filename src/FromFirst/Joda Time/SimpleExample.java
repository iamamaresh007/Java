import java.time.*;

class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        
        System.out.println("Local Date now is " + localDate);
        System.out.println("Local Time now is " + localTime);
        System.out.println("Local Date Time now is " + ldt);

    }
}
