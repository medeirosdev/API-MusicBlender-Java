package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.LogModel;
import com.medeiros.SPRINGProject.Models.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    LogRepository Log;

    @GetMapping(path="/all")
    public Iterable<LogModel> showAllLog(){
        return Log.findAll();
    }
}
