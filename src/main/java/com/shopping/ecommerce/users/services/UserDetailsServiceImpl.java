package com.shopping.ecommerce.users.services;

import com.shopping.ecommerce.users.models.User;
import com.shopping.ecommerce.users.repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserAuthRepository userAuthRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userAuthRepository.findByusername(username).orElseThrow(() -> new UsernameNotFoundException("Username doesn't exists"));
        return UserDetailsImpl.build(user);
    }
}
