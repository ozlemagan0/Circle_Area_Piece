import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double angle, r, area;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the radius:");
        r=input.nextDouble();

        System.out.print("Enter the angle:");
        angle=input.nextDouble();

        area=(Math.PI*r*r*angle)/360;
        System.out.println("The circle area:"+area);
    }
}
