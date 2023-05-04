package com.medeiros.SPRINGProject.Controllers;

import com.medeiros.SPRINGProject.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/forum")
public class ForumController {

    @Autowired
    LogRepository Log;
    @Autowired
    ForumIndexRepository ForumIndexRepo;
    @Autowired
    ForumChatRepository ChatRepository;

    @PostMapping(path="/create/{userId}")
    @ResponseBody
    public String createForumIndex(@RequestParam(name="nameForum") String nameForum,
                                   @RequestParam(name="forumDescription") String forumDescription,
                                   @PathVariable int userId){
        ForumIndexModel newForum = new ForumIndexModel(nameForum , userId ,forumDescription , userId);
        ForumIndexRepo.save(newForum);
        return "Forum criado";
    }

    @PostMapping(path="/message/{forumId}/{userId}")
    public String newMessage(@RequestParam(name="message") String message,
                             @PathVariable int userId,
                            @PathVariable int forumId ){
        ForumChatModel messageForum = new ForumChatModel(message, userId , forumId);
        ChatRepository.save(messageForum);
        return message;
    }

    @GetMapping(path="/showMessages/")
    public Iterable<ForumChatModel> showMessages(){
        return ChatRepository.findAll();
    }




}
