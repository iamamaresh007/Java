import java.time.*;

class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime date1 = LocalDateTime.of(1997, Month.MAY, 20, 9, 15);
        
        System.out.println("Today: " + date);
        System.out.println("Past: " + date1);
        
        System.out.println("6 months plus for today: " + date.plusMonths(6));
        System.out.println("6 months minus for today: " + date.minusMonths(6));
        
        DayOfWeek dw = date.getDayOfWeek();
        System.out.println("Get day of the week: " + dw);
        
        String s = dw.name();
        System.out.println("Day of week name: " + s);
        
        int n = dw.getValue();
        System.out.println("Get day of week value: " + n);
        
    }
}
