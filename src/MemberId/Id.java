package MemberId;

public class Id {

    private String first_name;
    private String last_name;

    public Id() {
        this.first_name = "Anonymous";
        this.last_name = "";
    }

    public Id(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() ;
    }
}
