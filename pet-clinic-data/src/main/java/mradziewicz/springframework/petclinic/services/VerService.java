package mradziewicz.springframework.petclinic.services;

import mradziewicz.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VerService {
    Vet findById(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);

}
