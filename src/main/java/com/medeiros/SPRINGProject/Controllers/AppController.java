package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.MusicModel;
import com.medeiros.SPRINGProject.Models.MusicRepository;
import com.medeiros.SPRINGProject.algorithm.algorithmBlender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    MusicRepository musicRepo;
    algorithmBlender ab = new algorithmBlender();
    @GetMapping("/feed")
    public  Map<String, Integer> showMusics(){
        Iterable<MusicModel> listMusic = musicRepo.findAll();
        //return (Iterable<MusicModel>) ab.algorithmCalc(listMusic);

        return ab.algorithmCalc(listMusic);
    }
    //aa

    @PostMapping(path="/like/{id}")
    public String updateMusicById(@PathVariable int id) {
        MusicModel musicToUpdate = musicRepo.findById(id);
        int numberLikes = musicToUpdate.getNumberOfLikes();
        musicToUpdate.setNumberOfLikes(numberLikes + 1);
        musicRepo.save(musicToUpdate);
        return "Música Alterada!";
    }


}
