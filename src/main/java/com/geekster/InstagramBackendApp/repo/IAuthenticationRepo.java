package com.geekster.InstagramBackendApp.repo;

import com.geekster.InstagramBackendApp.model.AuthenticationToken;
import com.geekster.InstagramBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
