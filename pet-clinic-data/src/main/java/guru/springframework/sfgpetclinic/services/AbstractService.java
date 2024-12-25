package guru.springframework.sfgpetclinic.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractService<T,ID> implements CrudOperations<T,ID>{

    protected Map<ID,T> map = new HashMap<>();


    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
