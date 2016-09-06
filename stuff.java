import java.util.List;
import java.util.ArrayList;
import java.io.Console;

public class stuff{
 public static void main(String[] args) {

  //  printStuff("Hello World", 10);
  //  List<Object> theList = putList(2, 4, "Test", "Test2");
  //  for (int i = 0; i < theList.size(); i++) {
  //    System.out.println(theList.get(i));
  //  }

//Console myConsole = System.console();
  //  System.out.println("Please enter a number: ");
  //  String inputNumber = myConsole.readline();
  //  Integer prime = Integer.parseInt(inputNumber);

  if(primeNumber(4))
    System.out.println("Is Prime!");
  else
    System.out.println("Not Prime!");


 }

  public static void printStuff(String theString, int theInt) {

    for(int i=0; i<theInt; ++i)
      System.out.println(theString);

  }

  public static Integer[] putArray(int objOne, int objTwo, int objThree){
    Integer[] theArray = {objOne, objTwo, objThree};
    return theArray;
  }

  public static List<Object> putList(int intOne, int intTwo, String stringOne, String stringTwo){
    List<Object> objectList = new ArrayList<Object>();

    objectList.add(intOne);
    objectList.add(intTwo);
    objectList.add(stringOne);
    objectList.add(stringTwo);

    return objectList;
  }

  public static boolean primeNumber(int primeNumber){

    for (int i = 2; i < primeNumber ; i++) {
      if (primeNumber % i == 0) {
        return false;
      }
    }
    return true;

  }
}
