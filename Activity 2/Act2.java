public class Act2 {
  public static void main(String[] args) {
      int number = 0;
    if (number == 0) {
        System.out.println("Enter the number you showed: " + number);
        System.out.println("Zero");
    } else if (number > 0) {
        int square = number * number;
        System.out.println("Enter the number you showed: " + number);
        System.out.println("Square = " + square);
    } else {
    int cube = number * number * number;
        System.out.println("Enter the number you showed: " + number);
        System.out.println("Cube = " + cube);
    }
}
}