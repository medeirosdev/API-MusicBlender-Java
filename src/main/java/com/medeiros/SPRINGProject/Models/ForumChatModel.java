package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.*;

@Entity
@Table(name="ForumChat")
public class ForumChatModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ForumChatModel(String message, int userId, int forumId) {
        this.message = message;
        this.userId = userId;
        this.forumId = forumId;
    }
    public ForumChatModel(){

    }

    private String message;

    private int userId;

    public int getForumId() {
        return forumId;
    }

    public void setForumId(int forumId) {
        this.forumId = forumId;
    }

    private int forumId;

}
