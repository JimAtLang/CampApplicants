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
<<<<<<< HEAD

        int age = applicant.getAge();
        if(age >=4 && age <=8){
            return "sparrow";
        }

        if(age >=9 && age <=13){
            return "robin";
        }

        if(age >=14 && age <=18){
            return "eagle";
        }

        if(age >4 && age <18){
            return null;
        }
        
=======
        int age = applicant.getAge();
        if(age >=4 && age <=8){
            return "Sparrow";
        } 
        if(age >= 9 && age <= 13){
            return "Robin";
        }
         if(age >= 14 && age <= 18){
            return "Eagle";
        }
       
>>>>>>> 16e864fbfb08f7628b21e149ba4881f4b5681ac4
        return null;
        
    }
     
}
