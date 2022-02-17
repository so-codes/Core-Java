package practicals;

import java.util.Scanner;

public class pr16 {

    public static void main(String[] args) {
        Society s = new Society();
        s.inputdata();
        s.allocate_flat();
        s.showdata();
    }

    public static class Society {
        String society_name;
        int house_no;
        int no_of_members;
        int income;
        String flat;

        public void inputdata() {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("\nEnter the society name: ");
                this.society_name = sc.nextLine();
                System.out.print("Enter the house no: ");
                this.house_no = sc.nextInt();
                System.out.print("Enter the no of members: ");
                this.no_of_members = sc.nextInt();
                System.out.print("Enter the income: ");
                this.income = sc.nextInt();
            }
        }

        public void allocate_flat() {
            if (this.income >= 25000) {
                this.flat = "A Type";
            } else if (this.income >= 20000 && this.income < 25000) {
                this.flat = "B Type";
            } else if (this.income < 15000) {
                this.flat = "C Type";
            }
        }

        public void showdata() {
            System.out.println("\nSociety name: " + this.society_name);
            System.out.println("House no: " + this.house_no);
            System.out.println("No of members: " + this.no_of_members);
            System.out.println("Income: " + this.income);
            System.out.println("Flat: " + this.flat);
            System.out.println();
        }
    }

}
