package guru.springframework.sfgpetclinic.model;

/**
 * Created by patrickskelley on Aug, 2018
 */
public class PetType extends BaseEntity{

    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
