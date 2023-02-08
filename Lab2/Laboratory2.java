import java.util.Scanner;

public class Laboratory2{
    
  public static void main(String[] args) {

    Scanner myapples = new Scanner(System.in);

    System.out.print("Enter the number of apples: ");

    int apples = myapples.nextInt();

    if(apples>=10){
        System.out.println("No way, that's too much");

    }else if(apples>=6){
            System.out.println("Okay, sure");

    }else{
        System.out.println("No, ask for more");
    }
  }
}