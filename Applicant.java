public class Applicant extends Person {
    private boolean isProcessed;
    
    public boolean isProcessed() {
        return isProcessed;
    }


    public void setProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }


    public Applicant(String firstName, String lastName, int age){
        super(firstName, lastName, age);
        this.isProcessed = false;
    }

}
