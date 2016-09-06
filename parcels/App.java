import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Console myConsole = System.console();




    System.out.println("Please enter the weight: ");
    int userWeight = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter the height: ");
    int userHeight = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter the width: ");
    int userWidth = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter the length: ");
    int userLength = Integer.parseInt(myConsole.readLine());

    Parcel newParcel = new Parcel(userWeight,userHeight,userWidth,userLength);

    System.out.println("The volume of your package is: " + newParcel.Volume());


    System.out.println("How fast do you need your package shipped: Tomorrow, 3 days or 1 week");
    String shippingSpeed = myConsole.readLine();

    System.out.println("Are you shipping: National or International");
    String shippingDistance = myConsole.readLine();


    System.out.println("Your cost will be:" + newParcel.costToShip(shippingSpeed, shippingDistance));

    System.out.println("Would");
    String shippingDistance = myConsole.readLine();

  }

}
