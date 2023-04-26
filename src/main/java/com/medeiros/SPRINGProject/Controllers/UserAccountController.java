package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.UserAccRepository;
import com.medeiros.SPRINGProject.Models.User_Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/userAccount")
public class UserAccountController {
    @Autowired
    UserAccRepository UserAccRepo;
    @GetMapping("/createUser01")
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
            return "Sucesso";
        }


    }
    @GetMapping("/findUser")
    public User_Credentials findUserById(@RequestParam(name = "id") String ID){
        int intID = Integer.parseInt(ID);
        return UserAccRepo.findById(intID);
    }
    @GetMapping("/deleteUser")
    public String deleteUserById(@RequestParam(name="id") String ID){
        int intID = Integer.parseInt(ID);
        UserAccRepo.deleteById(intID);
        return "Conta Delatada";
    }
}
