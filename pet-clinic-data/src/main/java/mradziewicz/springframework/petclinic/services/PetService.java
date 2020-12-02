package mradziewicz.springframework.petclinic.services;

import mradziewicz.springframework.petclinic.model.Owner;
import mradziewicz.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetService extends CrudService<Pet,Long> {

}
