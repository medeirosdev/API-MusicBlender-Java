package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name="Comments")
public class CommentsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int MusicID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMusicID() {
        return MusicID;
    }

    public void setMusicID(int musicID) {
        MusicID = musicID;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public int getNumberOfLikes() {
        return NumberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        NumberOfLikes = numberOfLikes;
    }

    public int getNumberOfComments() {
        return NumberOfComments;
    }

    public void setNumberOfComments(int numberOfComents) {
        NumberOfComments = numberOfComents;
    }

    public int getNumberOfLoves() {
        return NumberOfLoves;
    }

    public void setNumberOfLoves(int numberOfLoves) {
        NumberOfLoves = numberOfLoves;
    }

    private String Comment;

    private int NumberOfLikes;

    private int NumberOfComments;

    private int NumberOfLoves;

    public CommentsModel(String Comment, int MusicID ){
        this.Comment = Comment;
        this.MusicID = MusicID;
    }

    public CommentsModel(){

    }




}
