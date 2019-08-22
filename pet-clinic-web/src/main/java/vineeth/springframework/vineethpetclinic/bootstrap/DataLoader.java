package vineeth.springframework.vineethpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vineeth.springframework.vineethpetclinic.Models.Owner;
import vineeth.springframework.vineethpetclinic.Models.Vet;
import vineeth.springframework.vineethpetclinic.services.Map.OwnerServiceMap;
import vineeth.springframework.vineethpetclinic.services.Map.VetServiceMap;
import vineeth.springframework.vineethpetclinic.services.OwnerService;
import vineeth.springframework.vineethpetclinic.services.PetService;
import vineeth.springframework.vineethpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    DataLoader(OwnerService ownerService,VetService vetService)
    {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }
    @Override
    public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("vineeth");
    owner1.setLastName("reddy");
    ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("jyotsna");
        owner2.setLastName("reddy");
        ownerService.save(owner2);
System.out.println("owner added");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("dog");
        vet1.setLastName("tommy");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("cat");
        vet2.setLastName("pussy");
        vetService.save(vet2);
        System.out.println("vet added");
    }
}
