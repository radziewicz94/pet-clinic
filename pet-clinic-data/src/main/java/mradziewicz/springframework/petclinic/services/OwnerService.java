package mradziewicz.springframework.petclinic.services;

import mradziewicz.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OwnerService{
    Owner findById(Long id);
    Owner findByLastName(String fistName);
    Set<Owner> findAll();
    Owner save(Owner owner);
}
