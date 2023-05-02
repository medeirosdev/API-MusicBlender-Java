package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.LogModel;
import com.medeiros.SPRINGProject.Models.LogRepository;
import com.medeiros.SPRINGProject.Models.UserAccRepository;
import com.medeiros.SPRINGProject.Models.User_Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserAccountController {
    @Autowired
    UserAccRepository UserAccRepo;

    @Autowired
    LogRepository Log;
    LogModel Date = new LogModel();
    @GetMapping("/create")
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

            LogModel logData = new LogModel("createUser01" , "User" , Date.getTimeNow() );
            Log.save(logData);
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
    @GetMapping("/updateUser")
    public String updateUserById(@RequestParam(name="id")String id,
                                 @RequestParam(name="email")String email,
                                 @RequestParam(name="password")String password,
                                 @RequestParam(name="username")String username)
    {
        int intID = Integer.parseInt(id);
        User_Credentials userExist = UserAccRepo.findById(intID);
        if(userExist != null){
            userExist.setEmail(email);
            userExist.setPassword(password);
            userExist.setUsername(username);
            UserAccRepo.save(userExist);
            return "Usuário Salvo";
        }else{
            return "User não encontrado";
        }

    }





}
