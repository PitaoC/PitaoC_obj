import java.lang.Math;

public class Act1{
    static int Fnumber = 1;
    static int Snumber = 2;
    static int Tnumber = 3;
    public static void main(String[] args){
    
    System.out.println("Enter the first number: "+Fnumber);
    System.out.println("Enter the second number: "+Snumber);
    System.out.println("Enter the third number: "+Tnumber);

    if ((Fnumber>=Snumber)&&(Snumber>=Tnumber)){
        System.out.println("The largest number is "+Fnumber);
        System.out.println("The largest number is "+Snumber);
    }else{
        System.out.println("The largest number is "+Tnumber);
    }

    }
}