package Projeto.Enfermagem.projEnf.endpoint.controller;

import Projeto.Enfermagem.projEnf.models.converter.dto.IdosoDTOConverter;
import Projeto.Enfermagem.projEnf.models.converter.dto.PessoaDTOConverter;
import Projeto.Enfermagem.projEnf.models.converter.dto.UserDTOConverter;
import Projeto.Enfermagem.projEnf.models.dto.IdosoDTO;
import Projeto.Enfermagem.projEnf.models.dto.PessoaDTO;
import Projeto.Enfermagem.projEnf.models.dto.ReligiaoDTO;
import Projeto.Enfermagem.projEnf.models.dto.UserDTO;
import Projeto.Enfermagem.projEnf.resource.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("pessoa")
@RequiredArgsConstructor
public class PessoaController {
    private final PessoaService pessoaService;
    private final PessoaDTOConverter converter;
    private final IdosoDTOConverter idosoConverter;
    private final UserDTOConverter userDTOConverter;
    @GetMapping
    public ModelAndView index(ModelMap model) {
        model.addAttribute("pessoa", new PessoaDTO());
        model.addAttribute("conteudo", "/pessoa/cadastro");
        model.addAttribute("ErroLista");
        return new ModelAndView("layout", model);
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid PessoaDTO pessoa, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("conteudo", "/pessoa/cadastro");
            map.addAttribute("pessoa", pessoa);
            return new ModelAndView("layout", map);
        }
        pessoa = converter.toDTO(pessoaService.savePessoa(converter.toModel(pessoa)));
        if (pessoa.getTipopessoa().equals("CUIDADOR")) {
            UserDTO userDTO = UserDTO.builder()
                    .pessoaId(pessoa.getId())
                    .build();

            map.addAttribute("user", userDTO);
        } else {
            IdosoDTO idosoDTO = IdosoDTO.builder()
                    .pessoaId(pessoa.getId())
                    .build();
            map.addAttribute("idoso", idosoDTO);
            map.addAttribute("rel", pessoaService.chamarReligoes());
        }
        map.addAttribute("conteudo", pessoa.getTipopessoa().equals("CUIDADOR") ? "/pessoa/cadastro-cuidador" : "/pessoa/cadastro-idoso");
        return new ModelAndView("layout", map);
    }

    @PostMapping("/cadastro/user")
    public ModelAndView cadastroUsuario(@Valid UserDTO userDTO, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("conteudo", "/pessoa/cadastro-cuidador");
            map.addAttribute("user", userDTO);
            return new ModelAndView("layout", map);
        }
        pessoaService.saveUser(userDTOConverter.toModel(userDTO));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }

    @PostMapping("/cadastro/idoso")
    public ModelAndView cadastroIdoso(@Valid IdosoDTO idosoDTO, ReligiaoDTO religiaoDTO, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            result.getFieldErrors().stream().forEach(fieldError -> errorList.add(fieldError.getDefaultMessage()));
            map.addAttribute("ErroLista", errorList);
            map.addAttribute("conteudo", "/pessoa/cadastro-idoso");
            map.addAttribute("idoso", idosoDTO);
            return new ModelAndView("layout", map);
        }
        pessoaService.saveIdoso(idosoConverter.toModel(idosoDTO));
        map.addAttribute("message", "Cadastrado com sucesso");
        map.addAttribute("conteudo", "genericpage");
        return new ModelAndView("layout", map);
    }
}
