package Projeto.Enfermagem.projEnf.controller;

import Projeto.Enfermagem.projEnf.model.AgendaMedicamentos;
import Projeto.Enfermagem.projEnf.service.AgemedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/agemed")
public class AgemedController {
    @Autowired
    private AgemedService agemedService;

    @GetMapping
    public ModelAndView index(ModelMap map){
        map.addAttribute("conteudo", "agemed/cadastro");
        map.addAttribute("agemed", new AgendaMedicamentos());
        map.addAttribute("pacientes", agemedService.getPacService().callPacs());
        map.addAttribute("medicamentos", agemedService.getMedicamentoService().callMeds());
        return new ModelAndView("layout", map);
    }

    @PostMapping("/save")
    public ModelAndView save(AgendaMedicamentos medicamentos, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("layout","conteudo", "agemed/cadastro");
        }

        agemedService.save(medicamentos);
        return new ModelAndView("redirect:/agemed");
    }
}
