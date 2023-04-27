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

    @GetMapping(path="/create/{id}")
    public String createMusic(@RequestParam(name="MusicDescription") String MusicDescription,
                       @RequestParam(name="MusicName") String MusicName,
                       @RequestParam(name="Music") String Music, @PathVariable int id
                       ){
        MusicModel newMusic = new MusicModel(id , MusicName , Music , MusicDescription );
        MusicRepo.save(newMusic);
        return "Operação Feita";
    }


}
