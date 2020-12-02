package mradziewicz.springframework.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    protected HashMap<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    void deleteById(ID id){
        map.remove(id);
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(ID id, T object){
        return map.put(id, object);
    }
    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
