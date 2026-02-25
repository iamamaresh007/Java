import java.time.*;

class Main {
    public static void main(String[] args) {
      int yyyy = 2000;
      
      Year year = Year.of(yyyy);
      
      Boolean leap = year.isLeap();
      
      System.out.println("Is " + yyyy + " a leap year : " + leap);
    }
}
