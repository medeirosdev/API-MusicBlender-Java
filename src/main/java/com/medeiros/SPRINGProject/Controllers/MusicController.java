package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.MusicModel;
import com.medeiros.SPRINGProject.Models.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicRepository MusicRepo;

    @GetMapping(path="/create/{Userid}")
    public String createMusic(@RequestParam(name="MusicDescription") String MusicDescription,
                       @RequestParam(name="MusicName") String MusicName,
                       @RequestParam(name="Music") String Music, @PathVariable int Userid
                       ){
        MusicModel newMusic = new MusicModel(Userid , MusicName , Music , MusicDescription );
        MusicRepo.save(newMusic);
        return "Operação Feita";
    }

    @DeleteMapping(path="/delete/{id}")
    public String deleteMusic(@PathVariable int id){
            MusicRepo.deleteById(id);
            return "Deletado";

    }


    @GetMapping(path="/findMusicBy/{id}")
    public MusicModel findMusicBy(@PathVariable int id){
        return MusicRepo.findById(id);
    }



    @PostMapping(path="/update/{id}")
    public String updateMusicById(@PathVariable int id ,
                                  @RequestParam(name="MusicName") String MusicName,
                                  @RequestParam(name="MusicDescription") String MusicDescription,
                                  @RequestParam(name="Music") String Music
                                  ){
        MusicModel musicToUpdate = MusicRepo.findById(id);
        musicToUpdate.setMusic(Music);
        musicToUpdate.setMusicDescription(MusicDescription);
        musicToUpdate.setMusicName(MusicName);
        MusicRepo.save(musicToUpdate);
        return "Música Alterada!";
    }


}
