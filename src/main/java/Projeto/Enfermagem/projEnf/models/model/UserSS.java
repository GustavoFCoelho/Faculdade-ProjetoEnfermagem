package Projeto.Enfermagem.projEnf.models.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class UserSS implements UserDetails {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String login;
    private String senha;
    private Collection<? extends GrantedAuthority> authorities;

    public UserSS() {

    }

    public UserSS(Integer id, String login, String senha, String perfil) {
        super();
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.authorities = Collections.singleton(new SimpleGrantedAuthority("ADMIN"));
    }

    public Integer getId() {
        return id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public boolean hasRole(String perfil) {
        return getAuthorities().contains(new SimpleGrantedAuthority("ADMIN"));
    }
}
