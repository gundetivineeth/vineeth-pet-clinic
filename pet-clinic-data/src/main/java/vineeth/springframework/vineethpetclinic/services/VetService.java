package vineeth.springframework.vineethpetclinic.services;

import vineeth.springframework.vineethpetclinic.Models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
