public class emp {
    public static void main(String[] arg){
    	Scanner sc = new Scanner(System.in);
        int total;

        System.out.println("Enter wage per hour: ");
        int full = sc.nextInt();
        System.out.println("Enter total hour of work: ");
        int wage = sc.nextInt();

        total = full * wage;
        System.out.println("Total wage is: "+total);
	}

}
