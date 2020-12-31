import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = in.nextInt();

        System.out.println("Enter y1: ");
        int y1 = in.nextInt();

        System.out.println("Enter x2: ");
        int x2 = in.nextInt();

        System.out.println("Enter y2: ");
        int y2 = in.nextInt();

        System.out.print("Start: (" +x1+","+y1+")");
        System.out.println("\tTarget: (" +x2+","+y2+")");

        Bresenham br = new Bresenham(x1,y1,x2,y2);

    }
}
