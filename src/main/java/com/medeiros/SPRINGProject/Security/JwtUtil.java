package com.medeiros.SPRINGProject.Security;

import com.medeiros.SPRINGProject.Models.User_Credentials;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    @Value("${auth.jwt.secret}")
    private String jwtSecret;

    @Value("${auth.jwt-expiration-milliseg}")
    private Long jwtExpirationMilliseg;;

    public String newToken(Authentication authentication){

        Date dataExpiracao = new Date(  new Date().getTime() + jwtExpirationMilliseg   );
        User_Credentials user = (User_Credentials)authentication.getPrincipal();
        try{
            Key secretKey = Keys.hmacShaKeyFor(jwtSecret.getBytes(StandardCharsets.UTF_8));

            return Jwts.builder()
                    .setSubject(user.getUsername())
                    .setIssuedAt(new Date())
                    .setExpiration(dataExpiracao)
                    .signWith(secretKey)
                    .compact();

        }catch( Exception e ){
            System.out.println(e);
        }
        return null;
    }

    private Claims getClaims(String token){
        try{
            Key secretKey = Keys.hmacShaKeyFor(jwtSecret.getBytes(StandardCharsets.UTF_8));

            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(secretKey)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims;
        }catch( Exception e ){
            System.out.println(e);
        }

        return null;
    }

    public String getUserName(String token){
        Claims claims = getClaims(token);

        if(claims != null){return claims.getSubject();
        }else{
            return null;
        }



    }

    public boolean isValidToken(String token) {
        Claims claims = getClaims(token);

        String email;
        if (claims != null) {
            email = claims.getSubject();
        } else {
            return false;
        }
        Date dataExpiracao = claims.getExpiration();
        Date agora = new Date(System.currentTimeMillis());

        return email != null && agora.before(dataExpiracao);

    }





}



