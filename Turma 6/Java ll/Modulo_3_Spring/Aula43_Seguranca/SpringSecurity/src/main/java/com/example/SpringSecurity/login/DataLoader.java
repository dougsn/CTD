package com.example.SpringSecurity.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String password = passwordEncoder.encode("password");
        String password2 = passwordEncoder.encode("password2");

        userRepository.save(new AppUser("Charly", "charly", "charly@dh.com",password,AppUserRoles.ROLE_USER));
        userRepository.save(new AppUser("Charly2", "charly2", "charly2@dh.com",password2,AppUserRoles.ROLE_ADMIN));


    }
}
