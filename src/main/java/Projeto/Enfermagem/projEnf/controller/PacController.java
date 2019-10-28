package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Paciente;
import Projeto.Enfermagem.projEnf.model.Religiao;
import Projeto.Enfermagem.projEnf.service.PacService;
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
@RequestMapping("pac")
public class PacController {
    @Autowired
    PacService pacService;

    @GetMapping
    public ModelAndView index(ModelMap model){
        model.addAttribute("paciente", new Paciente());
        model.addAttribute("rels", pacService.callRegis());
        model.addAttribute("conteudo", "/pac/cadastro");
        return new ModelAndView("layout", model);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Paciente paciente, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("layout", "conteudo", "/pac/cadastro");
        }
        pacService.savePac(paciente);
        return new ModelAndView("redirect:/pac");
    }
}
