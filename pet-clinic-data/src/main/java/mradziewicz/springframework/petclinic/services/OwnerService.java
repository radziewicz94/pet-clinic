package mradziewicz.springframework.petclinic.services;

import mradziewicz.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String fistName);
}
