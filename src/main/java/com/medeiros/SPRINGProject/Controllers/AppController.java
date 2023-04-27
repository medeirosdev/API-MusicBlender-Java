package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.MusicModel;
import com.medeiros.SPRINGProject.Models.MusicRepository;

public class AppController {

    MusicRepository musicRepo;

    public Iterable<MusicModel> showMusics(){
        return musicRepo.findAll();
    }
}
