package pl.wszib.pizzamarket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.wszib.pizzamarket.services.OpinionService;
import pl.wszib.pizzamarket.web.models.OpinionModel;

import java.util.List;

@Controller
public class OpinionController {

    private final OpinionService opinionService;

    public OpinionController(OpinionService opinionService) {
        this.opinionService = opinionService;
    }

    @GetMapping("/opinion")
    public String getOpinion(Model model){
        List<OpinionModel> opinions = opinionService.findAll();
        model.addAttribute("opinions",opinions);
        model.addAttribute("opinion",new OpinionModel());
        return "opinion";
    }

    @PostMapping("opinion")
    public String saveOpinion(@ModelAttribute ("opinion") OpinionModel opinionModel){
        opinionService.saveOpinion(opinionModel);
    return "redirect:/opinion";
    }

}
