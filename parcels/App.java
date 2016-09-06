import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    Console myConsole = System.console();

    List<Parcel> packageList = new ArrayList<Parcel>();
    //Parcel newParcel = new Parcel(userWeight,userHeight,userWidth,userLength);

    boolean programRunning = true;

    while(programRunning){
      System.out.println("Please select one of the following Options: ");
      System.out.println("1. List existing packages");
      System.out.println("2. Add a new packages");
      System.out.println("3. Display shipping cost for a package");
      System.out.println("4. Display volume of a package");
      System.out.println("5. Add giftwrapping to a package");
      System.out.println("6. Exit program");

      int userInput = Integer.parseInt(myConsole.readLine());

      switch (userInput) {
        // List existing packages
        case 1:
        if(packageList.size() == 0)
          System.out.println("No Packages have been entered");
        else
          for (int i = 0; i < packageList.size(); i++) {
            System.out.println("Package: " + i + " Weight: " + packageList.get(i).mWeight + " Cost: " + packageList.get(i).costToShip());
          }
          break;

        // Add a new packages
        case 2:
          System.out.println("Please enter the weight: ");
          int userWeight = Integer.parseInt(myConsole.readLine());
          System.out.println("Please enter the height: ");
          int userHeight = Integer.parseInt(myConsole.readLine());
          System.out.println("Please enter the width: ");
          int userWidth = Integer.parseInt(myConsole.readLine());
          System.out.println("Please enter the length: ");
          int userLength = Integer.parseInt(myConsole.readLine());
          System.out.println("How fast do you need your package shipped: Tomorrow, 3 days or 1 week");
          String shippingSpeed = myConsole.readLine();

          System.out.println("Are you shipping: National or International");
          String shippingDistance = myConsole.readLine();

          packageList.add(new Parcel(userWeight,userHeight,userWidth,userLength, shippingSpeed, shippingDistance ));

          break;

        // Display shipping cost for a package
        case 3:
        if(packageList.size() == 0){
          System.out.println("Please add a package first.");
        }
        else {
          System.out.println("Please enter the package number: ");
          int i = Integer.parseInt(myConsole.readLine());
          if (i>=packageList.size()  || i < 0)
            System.out.println("Not a valid package number");
          else
            System.out.println("Shipping Cost Is: " + packageList.get(i).costToShip());
        }

          break;

        // Display volume of a package
        case 4:
        if(packageList.size() == 0){
          System.out.println("Please add a package first.");
        }
        else {
          System.out.println("Please enter the package number: ");
          int j = Integer.parseInt(myConsole.readLine());
          if (j>=packageList.size()  || j < 0)
            System.out.println("Not a valid package number");
          else
          System.out.println("The volume of your package is: " + packageList.get(j).Volume());
        }
          break;

        // Add giftwrapping to a package
        case 5:
        if(packageList.size() == 0){
          System.out.println("Please add a package first.");
        }
        else {
          System.out.println("Would you like to add gift wrapping to your package? Yes or No");
          String giftWrapInput = myConsole.readLine();
          if (giftWrapInput.equals("Yes")) {
            System.out.println("Please enter the package number: ");
            int h = Integer.parseInt(myConsole.readLine());
            if (h >= packageList.size() || h < 0)
              System.out.println("Not a valid package number");
            else
              System.out.println("Your gift wrapping will cost: " + packageList.get(h).CalcGiftWrap());
          }
        }
        break;

        case 6:
          programRunning = false;

      }
    }
  }
}
