package models;

public class Users {
    private int id;
    private String FirstName;
    private String LastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Users() { }
    public Users(int id, String FirstName, String LastName) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    @Override
    public String toString() {
        return "["+id+"] - "+FirstName+" - "+LastName;
    }
}
