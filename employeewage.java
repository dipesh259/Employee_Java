package learned;

public class Swcla {
    public static void main(String[] args) {
        final int p = 1;
        final int f = 2;
        final int w = 20;
        int emptype = (int) (Math.random()*100)%3;
        int work = 0;
        switch (emptype){
            case f:
                System.out.println("Employee is Present ");
                work = 8;
                break;
            case p:
                System.out.println("Employee is present Part time");
                work = 4;
                break;
            default:
                System.out.println("Employee is absent");
        }
        int wag = work * w;
        System.out.println("Employee Daily wage is " + wag);
    }
}
