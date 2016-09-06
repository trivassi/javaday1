import java.io.Console;

public class PracticeTracker {
  public static void main(String[] args) {

    int numHours = 0;
    numHours += askHowMuchCoding("yesterday");
    numHours += askHowMuchCoding("two days ago");
    numHours += askHowMuchCoding("today");

    System.out.println("You coded " + numHours + " hours over the last 3 days.");
    if (numHours > 15) {
      System.out.println("Great job! You're on track to becoming a Java pro in no time!");
    } else {
      System.out.println("You should practice more");

    }

  }

  public static int askHowMuchCoding(String day) {
    Console myConsole = System.console();
    System.out.println("How many hours did you code " + day + "?");
    String numHours = myConsole.readLine();
    Integer parsedHours = Integer.parseInt(numHours);
    return parsedHours;
  }
}
