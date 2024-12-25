package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerServ extends CrudOperations<Owner, Long>{
    Owner findByLastName(String lastName);
}
