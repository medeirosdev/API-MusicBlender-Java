package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.MusicModel;
import com.medeiros.SPRINGProject.Models.MusicRepository;
import com.medeiros.SPRINGProject.algorithm.algorithmBlender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    MusicRepository musicRepo;
    algorithmBlender ab = new algorithmBlender();
    @GetMapping("/feed")
    public  Iterable<MusicModel> showMusics(){
        Iterable<MusicModel> listMusic = musicRepo.findAll();
        return (Iterable<MusicModel>) ab.algorithmCalc(listMusic);
    }
    //aa
    @GetMapping("/like/{musicID}/{userID}")
    public MusicModel likeTheMusic(@PathVariable int musicID ,
                                   @PathVariable int userID){
        MusicModel music = musicRepo.findById(musicID);
        int numberLikes = music.getNumberOfLikes();
        music.setNumberOfLikes(numberLikes + 1);
        musicRepo.save(music);
        return music;



    }


}
