package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerServ {
    Owner save(Owner owner);

    Owner getOwnerById(Long id);

    List<Owner> findAllOwners();

    Owner deleteById(Long id);
}
