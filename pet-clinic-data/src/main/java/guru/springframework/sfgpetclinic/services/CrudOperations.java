package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudOperations <T,ID>{
    T findById(ID id);

    Set<T> findAll();

    T save(ID id, T object);

    void deleteById(ID id);

    void delete(T object);
}
