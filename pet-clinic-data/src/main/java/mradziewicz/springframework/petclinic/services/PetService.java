package mradziewicz.springframework.petclinic.services;

import mradziewicz.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService {
    PetService findById(Long id);
    Set<PetService> findAll();
    PetService save(PetService petService);
}
