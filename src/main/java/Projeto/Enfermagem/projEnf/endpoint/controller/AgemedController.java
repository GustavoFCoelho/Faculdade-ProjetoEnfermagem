package Projeto.Enfermagem.projEnf.endpoint.controller;

import Projeto.Enfermagem.projEnf.datastore.database.entity.AgendaMedicamentos;
import Projeto.Enfermagem.projEnf.models.converter.dto.AgendaMedicamentoDTOConverter;
import Projeto.Enfermagem.projEnf.models.dto.AgendaMedicamentosDTO;
import Projeto.Enfermagem.projEnf.resource.service.AgemedService;
import Projeto.Enfermagem.projEnf.resource.service.MedicamentoService;
import Projeto.Enfermagem.projEnf.resource.service.PessoaService;
import lombok.RequiredArgsConstructor;
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
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/agemed")
@RequiredArgsConstructor
public class AgemedController {
    private final AgemedService agemedService;
    private final PessoaService service;
    private final MedicamentoService medicamentoService;
    private final AgendaMedicamentoDTOConverter converter;

    @GetMapping
    public ModelAndView index(ModelMap map){
        map.addAttribute("conteudo", "agemed/cadastro");
        map.addAttribute("agendaMedicamentos", new AgendaMedicamentosDTO());
        map.addAttribute("idosos", service.getAllIdososPessoas());
        map.addAttribute("medicamentos", medicamentoService.getAll());
        return new ModelAndView("layout", map);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid AgendaMedicamentosDTO agendaMedicamentos, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("conteudo", "agemed/cadastro");
            map.addAttribute("agendaMedicamentos", new AgendaMedicamentosDTO());
            map.addAttribute("idosos", service.getAllIdososPessoas());
            map.addAttribute("medicamentos", medicamentoService.getAll());
            return new ModelAndView("layout",map);
        }

        agemedService.save(converter.toModel(agendaMedicamentos));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }

    @GetMapping("/agenda")
    public ModelAndView agenda(ModelMap map) {
        map.addAttribute("conteudo", "/agemed/agenda");
        map.addAttribute("agenda", agemedService.buscarLista());
        return new ModelAndView("layout", map);
    }
//
//    @GetMapping("alteraagenda/{id}")
//    public ModelAndView altera(@PathVariable int id, ModelMap map){
//        map.addAttribute("conteudo","/agemed/cadastro");
//        map.addAttribute("agendaMedicamentos", agemedService.findbyid(id));
//        map.addAttribute("pacientes", agemedService.getPessoaService().callPacs());
//        map.addAttribute("medicamentos", agemedService.getMedicamentoService().callMeds());
//        return new ModelAndView("/layout", map);
//    }
}
