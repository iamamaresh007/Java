import java.time.*;

class Main {
    public static void main(String[] args) {
       
       LocalDate today = LocalDate.now();
       LocalDate birthday = LocalDate.of(1997, Month.MAY, 20);
       
       Period p = Period.between(birthday, today);
       System.out.println("You are " + p.getYears() +" years "+ p.getMonths() +" months and " + p.getDays() +" days "+ " old.");
    }
}
