package vineeth.springframework.vineethpetclinic.services;

import vineeth.springframework.vineethpetclinic.Models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
