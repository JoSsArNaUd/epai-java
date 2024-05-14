package ch.epai.ict.m404.activity6;

public class Author {
    private String lastname;
    private String firstname;

    public Author() {
        this("");
    }

    public Author(String lastname) {
        this(lastname, "");
    }

    public Author(String lastname, String firstname) {
        setLastname(lastname);
        setFirstname(firstname);
    }

    public void setLastname(String lastname) {
        if (lastname != null) {
            this.lastname = lastname;
        } else if (lastname == null) {
            this.lastname = "";
        }
    }

    public void setFirstname(String firstname) {
        if (firstname != null) {
            this.firstname = firstname;
        } else if (firstname == null){
            this.firstname = "";
        }
    }

    public String getLastname() {
        return this.lastname;
    }
    public String getfirstName() {
        return this.firstname;
    }
}
