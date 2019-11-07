package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.AgendaMedicamentos;
import Projeto.Enfermagem.projEnf.service.AgemedService;
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
@RequestMapping("/agemed")
public class AgemedController {
    @Autowired
    private AgemedService agemedService;

    @GetMapping
    public ModelAndView index(ModelMap map){
        map.addAttribute("conteudo", "agemed/cadastro");
        map.addAttribute("agendaMedicamentos", new AgendaMedicamentos());
        map.addAttribute("pacientes", agemedService.getPacService().callPacs());
        map.addAttribute("medicamentos", agemedService.getMedicamentoService().callMeds());
        return new ModelAndView("layout", map);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid AgendaMedicamentos agendaMedicamentos, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            map.addAttribute("conteudo", "agemed/cadastro");
            map.addAttribute("pacientes", agemedService.getPacService().callPacs());
            map.addAttribute("medicamentos", agemedService.getMedicamentoService().callMeds());
            return new ModelAndView("layout",map);
        }

        agemedService.save(agendaMedicamentos);
        return new ModelAndView("redirect:/agemed");
    }
    @GetMapping("/agenda")
    public ModelAndView agenda(ModelMap map) {
        map.addAttribute("conteudo", "/agemed/agenda");
        map.addAttribute("agenda", agemedService.returnMed());
        return new ModelAndView("layout", map);
    }

    @GetMapping("alteraagenda/{id}")
    public ModelAndView altera(@PathVariable int id, ModelMap map){
        map.addAttribute("conteudo","/agemed/cadastro");
        map.addAttribute("agendaMedicamentos", agemedService.findbyid(id));
        map.addAttribute("pacientes", agemedService.getPacService().callPacs());
        map.addAttribute("medicamentos", agemedService.getMedicamentoService().callMeds());
        return new ModelAndView("/layout", map);
    }
}
