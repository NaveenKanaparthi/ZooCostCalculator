package edu.nwmissouri.zoo01group;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Sreebharath Mallampati
 */
@Controller
public class ZooCostCalculatorController {

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param id // the id provided in the URL
     * @param model //the model that holds information from controller to view
     * @return View
     */
     
   // @GetMapping(path = "/")
   //public String index(
   //         @RequestParam(name = "id", required = false, defaultValue = "0") String id,
   //         Model model) {
   //     model.addAttribute("id", id);
   //     return "index";
   // }
    
    @GetMapping(path = "/")
    public String about() {
        return "about";
    }
}

