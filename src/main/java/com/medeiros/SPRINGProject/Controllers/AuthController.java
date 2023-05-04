package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(path="/auth")
public class AuthController {

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
        //User_Credentials user = UserAccRepo.findByEmail(email);
        //if (UserAccRepo.existsById(user.getId())) {
           // if (Objects.equals(user.getPassword(), password)) {
             //   return "User Logado";
           // } else {
            //    return "Senha errada";
           // }
       // } else {
         //   return "Email Não encontrado!";
        return "error";
        }


    }

