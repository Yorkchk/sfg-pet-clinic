package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
public class OwnerHashMap extends AbstractService<Owner, Long> implements OwnerServ{


    @Override
    public Owner findByLastName(String lastName) {
        for(Owner owner : findAll()){
            if(owner.getLastName().equals(lastName)){
                return owner;
            }
        }
        return null;
    }
}
