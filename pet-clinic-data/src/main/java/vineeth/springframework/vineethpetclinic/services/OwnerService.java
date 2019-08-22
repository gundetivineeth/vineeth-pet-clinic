package vineeth.springframework.vineethpetclinic.services;

import vineeth.springframework.vineethpetclinic.Models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);


}
