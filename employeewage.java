package learned;

import java.util.Scanner;

public class monthly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total, month;

        //Input data
        System.out.println("Enter wage per hour: ");
        int w = sc.nextInt();
        System.out.println("Enter total hour of work: ");
        int h = sc.nextInt();
        System.out.println("Enter number of working days: ");
        int m = sc.nextInt();

        //calculate the wage
        total = w * h;
        month = total * m;
        System.out.println("Total wage is: "+month);
    }
}
