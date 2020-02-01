import java.util.Scanner;
public class circle_cal {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Radius");
        double x = input.nextDouble();
        System.out.println(2*Math.PI*x + " is the circumfrence");
        System.out.println(Math.PI*x*x + " is the area");

    }
}
