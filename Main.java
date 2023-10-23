import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
       new Main();
    }

    public Main(){
        Ui ui = new Ui();
        ApplicantProcessor p = new ApplicantProcessor();
        boolean next = true;
        ArrayList<Camper> campers = new ArrayList<>();
        while(next){
            Applicant a = ui.getApplicant();
            Camper c = p.processApplicant(a);
            // part 2: put in a conditional that will print a more user-friendly response 
            System.out.println(c.getType());
            if(c!=null)
                campers.add(c);
            String s = ui.inputString("Do you want to process another applicant?");
            if(Character.toLowerCase(s.charAt(0)) == 'y'){
                next = true;
            } else {
                next = false;
            }
        }

        System.out.println("Name\t\tAge\tType");
        for(Camper camper:campers){
            System.out.println(camper.getFirstName()+" " + camper.getLastName() + "\t" + camper.getAge() + "\t" + camper.getType());
        }
    }
}
