package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.*;
import com.medeiros.SPRINGProject.algorithm.algorithmBlender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    MusicRepository musicRepo;
    @Autowired
    LogRepository Log;

    LogModel Date = new LogModel();
    @Autowired
    CommentsRepository CommentsRepo;
    algorithmBlender ab = new algorithmBlender();
    @GetMapping("/feed")
    public  Map<String, Integer> showMusics(){
        Iterable<MusicModel> listMusic = musicRepo.findAll();
        //return (Iterable<MusicModel>) ab.algorithmCalc(listMusic);

        return ab.algorithmCalc(listMusic);
    }
    //aa

    @PostMapping(path="/like/{id}")
    public String LikeMusicById(@PathVariable int id) {
        MusicModel musicToUpdate = musicRepo.findById(id);
        int numberLikes = musicToUpdate.getNumberOfLikes();
        musicToUpdate.setNumberOfLikes(numberLikes + 1);
        musicRepo.save(musicToUpdate);
        LogModel logData = new LogModel("app/like/{id}" , "App" , Date.getTimeNow() );
        Log.save(logData);
        return "Música Alterada!";
    }

    @PostMapping(path="/comment/{id}")
    public String CommentMusicById(@PathVariable int id) {
        MusicModel musicToUpdate = musicRepo.findById(id);
        int numberComments = musicToUpdate.getNumberOfComents();
        musicToUpdate.setNumberOfComents(numberComments + 1);
        musicRepo.save(musicToUpdate);
        LogModel logData = new LogModel("app/comment/{id}" , "App" , Date.getTimeNow() );
        Log.save(logData);
        return "Música Alterada!";
    }
    //Cria um comentário na Música de IdMúsic = id
    @PostMapping(path="/createComment/{id}")
    public String createComment(@PathVariable int id,
                                @RequestParam(name="Comment")String Comment){
        CommentsModel comment = new CommentsModel(Comment , id );
        CommentsRepo.save(comment);
        LogModel logData = new LogModel("app/createComment/{id}" , "App" , Date.getTimeNow() );
        Log.save(logData);
        return Comment;
    }

    @GetMapping(path="/getComments/{MusicId}")
    public String getCommentsByMusicId(@PathVariable int MusicId){

        return "a";
    }


}
