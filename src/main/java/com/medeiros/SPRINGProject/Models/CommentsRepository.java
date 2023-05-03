package com.medeiros.SPRINGProject.Models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends CrudRepository<CommentsModel ,Integer> {

    //@Query("SELECT m FROM Comments m WHERE m.MusicID = :MusicID")
    //CommentsModel findByMusicId(int MusicID);
}
