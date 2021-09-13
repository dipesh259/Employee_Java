package learned;

import java.util.Scanner;

public class partime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;

        //Input data
        System.out.println("Enter wage per hour: ");
        int w = sc.nextInt();
        System.out.println("Enter total hour of part-time work: ");
        int h = sc.nextInt();

        p = w * h;
        System.out.println("Part-time wage is: "+p);
    }
}
