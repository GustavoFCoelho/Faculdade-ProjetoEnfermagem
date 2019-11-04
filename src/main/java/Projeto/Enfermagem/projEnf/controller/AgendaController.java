package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Agenda;
import Projeto.Enfermagem.projEnf.service.AgendaService;
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
@RequestMapping("/")
public class AgendaController {
    @Autowired
    private AgendaService agendaService;

    @GetMapping("age")
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("conteudo","/age/cadastro");
        modelMap.addAttribute("agenda", new Agenda());
        modelMap.addAttribute("pacientes", agendaService.getPacService().callPacs());
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("age/save")
    public ModelAndView save(@Valid Agenda agenda, BindingResult result, ModelMap modelMap){
        if(result.hasErrors()){
            modelMap.addAttribute("conteudo","/age/cadastro");
            modelMap.addAttribute("pacientes", agendaService.getPacService().callPacs());
            return new ModelAndView("layout",modelMap);
        }

        agendaService.save(agenda);
        return new ModelAndView("redirect:/age");
    }
}
