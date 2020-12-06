package mradziewicz.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owner","/owners"})
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String owenrList(){
        return "/owner/index.html";
    }
}
