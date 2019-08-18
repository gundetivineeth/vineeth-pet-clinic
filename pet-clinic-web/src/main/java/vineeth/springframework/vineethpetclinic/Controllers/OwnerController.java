package vineeth.springframework.vineethpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"owners","/","owners/index","owners/index.html"})
    public String ownerPage()
    {
        return "owners/index";
    }


}
