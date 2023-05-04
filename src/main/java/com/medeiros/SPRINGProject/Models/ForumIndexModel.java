package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Entity
@Table(name="ForumIndex")
public class ForumIndexModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String ForumName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForumName() {
        return ForumName;
    }

    public void setForumName(String forumName) {
        ForumName = forumName;
    }

    public int getForumID() {
        return ForumID;
    }

    public void setForumID(int forumID) {
        ForumID = forumID;
    }

    public String getForumDescription() {
        return ForumDescription;
    }

    public void setForumDescription(String forumDescription) {
        ForumDescription = forumDescription;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ForumID;

    private String ForumDescription;

    private int userId;
    public ForumIndexModel(){

    }
    public ForumIndexModel(String forumName, int forumID, String forumDescription, int userId) {
        ForumName = forumName;
        ForumID = forumID;
        ForumDescription = forumDescription;
        this.userId = userId;
    }
}
