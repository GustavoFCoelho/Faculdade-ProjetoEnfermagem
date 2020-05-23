package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.database.entity.User;
import Projeto.Enfermagem.projEnf.datastore.database.repository.UserRepository;
import Projeto.Enfermagem.projEnf.models.model.UserSS;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Array;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {
    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
        User usuario = repository.findByLogin(user).orElseThrow(() -> new UsernameNotFoundException("Username " + user + " not found"));
        if (usuario == null) {
            throw new UsernameNotFoundException(user);
        }
        return new UserSS(usuario.getId().intValue(), usuario.getLogin(), usuario.getSenha(), usuario.getRole());
    }
}
