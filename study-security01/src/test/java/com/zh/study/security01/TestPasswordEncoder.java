package com.zh.study.security01;

import com.zh.study.security01.util.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TestPasswordEncoder {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode1 = passwordEncoder.encode("abcd1234");
        System.out.println(encode1);
        String encode2 = passwordEncoder.encode("abcd1234");
        System.out.println(encode2);
        System.out.println(passwordEncoder.matches("abcd1234", encode1));
        System.out.println(passwordEncoder.matches("abcd1234", encode2));

        //String token = JwtTokenUtil.generateJwtToken();
        //Claims claims = JwtTokenUtil.getClaimsFromToken("Bearer " + token);
       // System.out.println(claims.toString());
    }
}
