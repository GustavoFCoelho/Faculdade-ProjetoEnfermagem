package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.Agenda;
import Projeto.Enfermagem.projEnf.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class AgendaController {
    @Autowired
    private AgendaService agendaService;

    @GetMapping
    public ModelAndView home(ModelMap map){
        map.addAttribute("conteudo", "/age/agenda");
        map.addAttribute("agenda", agendaService.chamaAgenda());
        return new ModelAndView("layout", map);
    }

    @GetMapping("age")
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("conteudo","/age/cadastro");
        modelMap.addAttribute("agenda", new Agenda());
        modelMap.addAttribute("pacientes", agendaService.getPacService().callPacs());
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("age/save")
    public ModelAndView save(@Valid Agenda agenda, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            map.addAttribute("conteudo","/age/cadastro");
            map.addAttribute("pacientes", agendaService.getPacService().callPacs());
            return new ModelAndView("layout",map);
        }

        agendaService.save(agenda);
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }

    @GetMapping("age/alteraagenda/{id}")
    public ModelAndView altera(@PathVariable int id, ModelMap map){
        map.addAttribute("conteudo","/age/cadastro");
        map.addAttribute("agenda", agendaService.findbyid(id));
        map.addAttribute("pacientes", agendaService.getPacService().callPacs());
        return new ModelAndView("/layout", map);
    }
}
