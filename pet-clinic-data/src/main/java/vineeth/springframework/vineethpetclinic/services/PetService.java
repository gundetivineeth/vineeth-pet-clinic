package vineeth.springframework.vineethpetclinic.services;

import vineeth.springframework.vineethpetclinic.Models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
