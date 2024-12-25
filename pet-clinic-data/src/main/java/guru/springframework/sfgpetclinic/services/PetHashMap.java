package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetHashMap extends AbstractService<Pet, Long> implements PetServ{
}
