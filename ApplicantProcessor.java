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
        if(applicant.getAge() >= 4 && applicant.getAge() <= 8){
            return "Sparrow";
        }
        if(applicant.getAge() >= 9 && applicant.getAge() <= 13){
            return "Robin";
        }
        if(applicant.getAge() >= 14 && applicant.getAge() <= 18){
            return "Eagle";
        }
       return null;
    }
}
