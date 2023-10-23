public class ApplicantProcessor {
    /**
     * 
     * @param applicant
     * @return String
     * for applicants age 4-8 return "Sparrow"
     * for applicants age 9-13 return "Robin"
     * for applicants age 14-18 return "Eagle"
     * for all other ages return null;
     */
    public String processApplicant(Applicant applicant){
        // part 1: put in conditionals that will return the correct string as shown above
        int age = applicant.getAge();
        if(age >=4 && age <=8){
            return "Sparrow";
        } 
        if(age >= 9 && age <= 13){
            return "Robin";
        }
         if(age >= 14  age <= 18){
            return "Eagle";
        }
       
        return null;
    }
}
