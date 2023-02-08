import java.util.Scanner;

public class Laboratory1{
    
  public static void main(String[] args) {

    Scanner mygrade = new Scanner(System.in);

    System.out.println("Enter Your Grade: ");

    int grd = mygrade.nextInt();

    if(grd>=90){
        System.out.println("You got an A!");

        }else if(grd>=80){
            System.out.println("You got an B!");

        }else if(grd>=70){
            System.out.println("You got an C!");

        }else if(grd>=60){
            System.out.println("You got an D!");

    }else{
        System.out.println("You got an F!");
    }
  }
}