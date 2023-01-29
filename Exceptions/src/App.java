public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    //Try-catch block can handle exceptions but will not handle errors
    //Errors usually hardware issues or limitations
    try {
      //Anything inside of this try block will be caught by our catch block
      int x = 100 / 0;
    } catch (ArithmeticException exc) {
      System.out.println(
        "You have divided by zero! Changing the behavior to divide by 1 instead"
      );
      int x = 100 / 1;
    } catch (Exception e) { //Catching an Exception class will catch everything
      //TODO: handle exception
      System.out.println("Caught an exception");
    }
  }
}
