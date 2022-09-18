package com.example.SpringSecurity.login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class AppUser implements UserDetails { // Essa interface é utilizada pelo spring security, para definir os detalhes do usuário que for estar fazendo login
    @Id
    @SequenceGenerator(name="user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome, username, email, password;
    @Enumerated(EnumType.STRING) // Especificando o tipo do enum, que no caso é de String.
    private AppUserRoles appUserRoles;

    public AppUser(String nome, String username, String email, String password, AppUserRoles appUserRoles) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
        this.appUserRoles = appUserRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(appUserRoles.name());
        return Collections.singleton(grantedAuthority);
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
}
