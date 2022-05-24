package sn.simplon.gestionfabrique.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.simplon.gestionfabrique.entities.Apprenant;
import sn.simplon.gestionfabrique.services.ApprenantService;

import java.util.List;

@Controller @AllArgsConstructor
public class ApprenantController {
    @Autowired
    private ApprenantService apprenantService;
    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/listApprenants")
    public String getAll(Model model){
        List<Apprenant> listApprenants = apprenantService.getAll();
       model.addAttribute("listApprenants", listApprenants);
        return "listApprenants";
    }

}
