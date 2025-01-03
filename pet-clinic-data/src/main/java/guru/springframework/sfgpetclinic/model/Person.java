package guru.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by patrickskelley on Aug, 2018
 */
public class Person extends BaseEntity{


    private String firstName;
    private String lastName;

    public Person(Long id,String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

