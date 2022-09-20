package com.example.SpringSecurityAula.login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class AppUser implements UserDetails {  // O UserDetais é utilziada para definir exatamente os detalhes do usuário que está logando no sistema.

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;
    private String nome, username, password, email;
    @Enumerated(EnumType.STRING) // indica que o ENUM é do tem um valor STRING
    private AppUserRoles appUserRoles;

    public AppUser(String nome, String username, String password, String email, AppUserRoles appUserRoles) {
        this.nome = nome;
        this.username = username;
        this.password = password;
        this.email = email;
        this.appUserRoles = appUserRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {// Utiliza esse método para pegar algumas regras do nosso usuário que não vemos. Elas são passadas por processamento da aplicação.
        // Para pegar as regras advindas do nosso appuserROles e assim qque eu verifico pelo nome
        SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(appUserRoles.name());

        return Collections.singleton(grantedAuthority);
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
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
