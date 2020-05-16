package Projeto.Enfermagem.projEnf.endpoint.controller;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Agenda;
import Projeto.Enfermagem.projEnf.models.converter.dto.AgendaDTOConverter;
import Projeto.Enfermagem.projEnf.models.converter.dto.PessoaDTOConverter;
import Projeto.Enfermagem.projEnf.models.dto.AgendaDTO;
import Projeto.Enfermagem.projEnf.resource.service.AgendaService;
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
@RequiredArgsConstructor
@RequestMapping("/")
public class AgendaController {
    private final AgendaService agendaService;
    private final AgendaDTOConverter converter;
    private final PessoaDTOConverter pessoaDTOConverter;
    private final PessoaService pessoaService;

    @GetMapping
    public ModelAndView home(ModelMap map){
        map.addAttribute("conteudo", "/age/agenda");
        map.addAttribute("agenda", agendaService.buscarPendentes());
        return new ModelAndView("layout", map);
    }

    @GetMapping("age")
    public ModelAndView index(ModelMap modelMap){
        modelMap.addAttribute("conteudo","/age/cadastro");
        modelMap.addAttribute("agenda", new AgendaDTO());
        modelMap.addAttribute("idosos", pessoaDTOConverter.toDTOList(pessoaService.getAllIdososPessoas()));
        return new ModelAndView("layout", modelMap);
    }

    @PostMapping("age/save")
    public ModelAndView save(@Valid AgendaDTO agenda, BindingResult result, ModelMap map){
        if(result.hasErrors()){
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("conteudo","/age/cadastro");
            map.addAttribute("idosos", pessoaService.getAllIdososPessoas());
            map.addAttribute("agenda", agenda);
            return new ModelAndView("layout",map);
        }

        agendaService.save(converter.toModel(agenda));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }

    @GetMapping("age/alteraagenda/{id}")
    public ModelAndView altera(@PathVariable Long id, ModelMap map){
        map.addAttribute("conteudo","/age/cadastro");
        map.addAttribute("agenda", converter.toDTO(agendaService.buscar(id)));
        map.addAttribute("idosos", pessoaService.getAllIdososPessoas());
        return new ModelAndView("/layout", map);
    }
}
