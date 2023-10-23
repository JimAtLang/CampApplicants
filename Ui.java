import java.util.Scanner;

public class Ui {
    Scanner sc;
    public Ui() {
        sc = new Scanner(System.in);
    }
    public String inputString(String msg){
        System.out.print(msg);
        return sc.nextLine();
    }

    public int inputInt(String msg){
        System.out.print(msg);
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    public Applicant getApplicant(){
        String first = inputString("what's the applicant's first name?");
        String last = inputString("What's the applicant's last name?");
        int age = inputInt("What is the applicant's age?");
        return new Applicant(first, last, age);
    }
}
