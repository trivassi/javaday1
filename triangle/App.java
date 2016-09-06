import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Console myConsole = System.console();

    System.out.println("Please enter the length of the first side: ");
    Integer side1 = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter the length of the second side: ");
    Integer side2 = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter the length of the third side: ");
    Integer side3 = Integer.parseInt(myConsole.readLine());

    Triangle newTri = new Triangle(side1,side2,side3);

    System.out.println(newTri.TriangleType());

  }

}
