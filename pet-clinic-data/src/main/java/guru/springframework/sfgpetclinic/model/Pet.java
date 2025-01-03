package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by patrickskelley on Aug, 2018
 */
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public Pet(Long id, PetType petType, Owner owner, LocalDate birthDate) {
        super(id);
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
