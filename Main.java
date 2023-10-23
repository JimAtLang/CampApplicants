public class Main {
    public static void main(String[] args){
       new Main();
    }

    public Main(){
        Ui ui = new Ui();
        ApplicantProcessor p = new ApplicantProcessor();
        boolean next = true;
        while(next){
            Applicant a = ui.getApplicant();
            Camper camper = p.processApplicant(a);
            // part 2: put in a conditional that will print a more user-friendly response 
            System.out.println(camper);
            String s = ui.inputString("Do you want to process another applicant?");
            if(Character.toLowerCase(s.charAt(0)) == 'y'){
                next = true;
            } else {
                next = false;
            }
        }
    }
}
