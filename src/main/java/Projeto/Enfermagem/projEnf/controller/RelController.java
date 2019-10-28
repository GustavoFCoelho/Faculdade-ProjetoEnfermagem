package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Religiao;
import Projeto.Enfermagem.projEnf.service.RelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("rel")
public class RelController {

    @Autowired
    public RelService reService;

    @GetMapping
    public ModelAndView index(ModelMap model){
        model.addAttribute("religiao", new Religiao());
        model.addAttribute("conteudo", "/rel/cadastro");
        return new ModelAndView("layout", model);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Religiao reDTO, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("layout", "conteudo", "/rel/cadastro");
        }
        reService.saverel(reDTO);
        return new ModelAndView("redirect:/rel");
    }
}
