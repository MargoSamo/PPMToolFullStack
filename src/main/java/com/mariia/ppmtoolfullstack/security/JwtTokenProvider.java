package com.mariia.ppmtoolfullstack.security;

import com.mariia.ppmtoolfullstack.domain.User;
import org.springframework.security.core.Authentication;

import java.util.Date;

import static com.mariia.ppmtoolfullstack.security.SecurityConstants.EXPIRATION_TIME;

public class JwtTokenProvider {

    //Generate the token
    public String generateToken(Authentication authentication){
        User user = (User)authentication.getPrincipal();
        Date now = new Date(System.currentTimeMillis());

        Date expiryDate = new Date(now.getTime()+EXPIRATION_TIME);

        String userId = Long.toString(user.getId());

        return Jwts.builder()
    }

    //Validate the token

    //get user Id from token
}
