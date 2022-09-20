package com.example.SpringSecurityAula.login;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private IUserRepository userRepository;

    public DataLoader(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Criamos para encriptografar a senha e não ter a possibilidade da senha ser visualizada no banco de dados.
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String password = bCryptPasswordEncoder.encode("password");
        String password2 = bCryptPasswordEncoder.encode("password2");

        // Criamos dois usuarios, para testar as regras criadas, um como USER e outro como ADMIN
        userRepository.save(new AppUser("Jose","jose","jose@gmail.com",password,AppUserRoles.ROLE_USER));
        userRepository.save(new AppUser("Maria","maria","maria@gmail.com",password2,AppUserRoles.ROLE_ADMIN));






    }
}
