package col.com.broc95.web;


import col.com.broc95.domain.Spacecraft;

import col.com.broc95.servicio.SpacecraftService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ControladorInicio {
    
    public enum NaveT {
        tripulada, No_tripulada, lanzadera
    }

  
    @Autowired
    private SpacecraftService spacecraftService;
    
    
    
    @GetMapping("/")
    public String inicio(Model model) {
  
        return "index";
    }


    @GetMapping("/intro")
    public String spacecraft(Model model) {
        var naves = spacecraftService.listSpacecraft();
        model.addAttribute("naves", naves);
        return "intro";
    }
    

    
//  add spacecraft
    
    /**
     * @param mod
     * @param nave
     * @return
     */
    @GetMapping("/add2")
    public String spacecraft2(Model mod, Spacecraft nave) {
        
        mod.addAttribute("naveT",NaveT.values());

        return "spacecraft";
    }

    


    @PostMapping("/save2")
    public String saveS2(Spacecraft nave) {
        
        spacecraftService.guardar(nave);;
        return "redirect:/";
    }
    

    
   
}
