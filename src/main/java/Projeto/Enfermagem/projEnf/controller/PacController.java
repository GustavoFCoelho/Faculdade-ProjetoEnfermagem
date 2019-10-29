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
    public ModelAndView save(@Valid Paciente pac, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("layout", "conteudo", "/pac/cadastro");
        }
        pacService.savePac(pac);
        return new ModelAndView("redirect:/pac");
    }

    @GetMapping("/prontuario")
    public ModelAndView prontuário(ModelMap map){
        map.addAttribute("pacientes", pacService.callPacs());
        map.addAttribute("conteudo","/pac/prontuario");
        map.addAttribute("paciente", new Paciente());
        return new ModelAndView("layout", map);
    }

    @GetMapping("/callPront")
    public ModelAndView callPront(Paciente pac, ModelMap map){
        map.addAttribute("pacpront", pacService.findByID(pac.getPacid()));
        map.addAttribute("pacientes", pacService.callPacs());
        map.addAttribute("conteudo","/pac/prontuario");
        map.addAttribute("paciente", new Paciente());
        return new ModelAndView("layout", map);
    }
}
