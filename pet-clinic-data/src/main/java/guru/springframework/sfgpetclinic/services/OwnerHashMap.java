package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OwnerHashMap implements OwnerServ{

    private Map<Long, Owner> owners = new HashMap<>();
    private List<Owner> listOwner = new ArrayList<>();



    @Override
    public Owner save(Owner owner) {
        owners.put(owner.getId(), owner);
        listOwner.add(owner);
        return owner;
    }


    @Override
    public Owner getOwnerById(Long id) {
        return owners.get(id);
    }

    @Override
    public List<Owner> findAllOwners() {
        return listOwner;
    }

    @Override
    public Owner deleteById(Long id) {
        Owner owner = owners.get(id);
        owners.remove(id,owner);
        return owner;
    }
}
