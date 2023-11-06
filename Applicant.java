public class Applicant extends Person{
    private boolean processed;
    public boolean isProcessed() {
        return processed;
    }
    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
    public Applicant(String firstName, String lastName, int age, boolean processed){
        super(firstName, lastName, age);
        this.processed = processed;
    }
    

}
