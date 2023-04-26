package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.UserModel;
import com.medeiros.SPRINGProject.Models.UserModelRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserModelRepository UMR;

    @GetMapping("/hello")
    public String HelloUser(){
        return "Hello";
    }
    UserModel user01 = new UserModel(34 , "Ale" , 13 , "492-621-34-45");
    @RequestMapping(method = RequestMethod.GET , path = "/create")
    public UserModel createRandomUser(){
        UMR.save(user01);
        return user01;
    }

    @DeleteMapping(path="/delete")
    public String DeleteUser(){
        UMR.deleteById(user01.getID());
        return  "Usuario " + user01.getID() + "Deletado";
    }
}
