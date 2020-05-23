package Projeto.Enfermagem.projEnf.endpoint.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class LoginController {

    @GetMapping
    public ModelAndView index(ModelMap map){
        map.addAttribute("errologin");
        return new ModelAndView("login-page", map);
    }

    @GetMapping("/login-erro")
    public ModelAndView failedLogin(ModelMap map){
        map.addAttribute("errologin", "Usuário/Senha incorretos, por favor tente novamente");
        return new ModelAndView("login-page", map);
    }
}
