
package Ver2;

import java.util.Date;


public abstract class Person implements IPerson {
    protected String id;
    protected String fullname;
    protected Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String fullname, Date dateOfBirth) {
        this.id = id;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public abstract void displayInfo();
    
}
