package vineeth.springframework.vineethpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vineeth.springframework.vineethpetclinic.Models.Owner;
import vineeth.springframework.vineethpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;
    OwnerController(OwnerService ownerService)
    {
        this.ownerService = ownerService;
    }
    @RequestMapping({"","/","index","index.html"})
    public String ListOwners(Model model)
    {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }


}
