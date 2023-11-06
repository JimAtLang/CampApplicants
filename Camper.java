public class Camper extends Person {
    private String type;
    public Camper(String firstName, String lastName, int age, String type) {
       super(firstName, lastName, age);
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
