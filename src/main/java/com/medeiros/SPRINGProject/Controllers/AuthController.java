package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.*;
import com.medeiros.SPRINGProject.Security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
@RequestMapping(path="/auth")
public class AuthController {
    JwtUtil JwtToken;
    @Autowired
    UserAccRepository UserAccRepo;
    @Autowired
    UserInfoRepository UserInfoRepo;
    @Autowired
    LogRepository Log;
    LogModel Date = new LogModel();


    @PostMapping(path = "/register")
    public String createAuser(
            @RequestParam(name = "email") String email,
            @RequestParam(name = "password") String password,
            @RequestParam(name = "confirmpassword") String confirmPassword,
            @RequestParam(name = "username") String username) {

        if (!Objects.equals(password, confirmPassword)) {
            return "Senhas não batem!";
        } else {
            User_Credentials userCred = new User_Credentials(email, password, username);
            UserAccRepo.save(userCred);

            LogModel logData = new LogModel("createUser01", "User", Date.getTimeNow());
            Log.save(logData);
            return "Sucesso";
        }

    }


    @GetMapping(path = "/login")
    public String loginUser(@RequestParam(name = "email") String email,
                              @RequestParam(name = "password") String password) {
        User_Credentials user = UserAccRepo.findUserByEmail(email);
        if(user != null){
            if(Objects.equals(user.getPassword(), password)){

                return "Logado";
            }else{
                return "Senha incorreta";
            }
        }else{
            return "Email não encontrado!";
        }

    }
    }

