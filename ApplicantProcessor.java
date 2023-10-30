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
    public Camper processApplicant(Applicant applicant){
        applicant.setProcessed(true);
        if(applicant.getAge() >= 4 && applicant.getAge() <= 8){
            return new Camper(applicant.getFirstName(), applicant.getLastName(), applicant.getAge(), "Sparrow");
        }
        if(applicant.getAge() >= 9 && applicant.getAge() <= 13){
           return new Camper(applicant.getFirstName(), applicant.getLastName(), applicant.getAge(), "Robin");
        }
        if(applicant.getAge() >= 14 && applicant.getAge() <= 18){
           return new Camper(applicant.getFirstName(), applicant.getLastName(), applicant.getAge(), "Eagle");
        }
       return null;
    }
}
