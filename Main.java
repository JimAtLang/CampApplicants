import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
       new Main();
    }

    public Main(){
        Ui ui = new Ui();
        ApplicantProcessor p = new ApplicantProcessor();
        boolean next = true;
        ArrayList<Camper> campers = new ArrayList<>(); // creates a variable length list
        while(next){
            Applicant a = ui.getApplicant();
            Camper camper = p.processApplicant(a);
            if (camper!=null){
                campers.add(camper); // adds the camper to the list
            }
            // part 2: put in a conditional that will print a more user-friendly response 
            System.out.println(camper.getFirstName()+" " + camper.getLastName() + " " + camper.getAge());
            String s = ui.inputString("Do you want to process another applicant?");
            if(Character.toLowerCase(s.charAt(0)) == 'y'){
                next = true;
            } else {
                next = false;
            }
        }
    }
}
