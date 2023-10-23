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
        String type;
        int age = applicant.getAge();
        if(age >= 4 && age <=8)
        {
            type = "Sparrow";
        } else if (age >= 9 && age <=13) {
           type = "Robin";
        } else if (age >= 13 && age <=18) {
           type = "Eagle";
        } else {
            return null;
        }
        return new Camper(applicant.getFirstName(), applicant.getLastName(), applicant.getAge(), type);

    }
}
