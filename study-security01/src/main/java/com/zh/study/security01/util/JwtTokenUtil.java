package com.zh.study.security01.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTokenUtil {
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";
    private static final String SECRET = "mall-admin-secret";

    public static void main(String[] args) {
        //String jwtToken = generateJwtToken();
        //System.out.println(jwtToken);
        //System.out.println(getClaimsFromToken(token));
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        System.out.println(jwtTokenUtil.generateJwtToken());
    }

    public String generateJwtToken() {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, "admin");
        claims.put(CLAIM_KEY_CREATED, new Date());

        return  Jwts.builder().
                setClaims(claims).
                setExpiration(new Date(System.currentTimeMillis() + 604800 * 1000))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }

    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey("mall-admin-secret")
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {

        }
        return claims;
    }

    public String getUserNameFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        if (claims != null) {
            return claims.getSubject();
        }
        return null;
    }

}
