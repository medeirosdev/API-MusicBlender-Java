package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class LogModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int logId;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    private String comando;

    private String classe;

    private LocalDateTime data;

    public LogModel(String comando, String classe, LocalDateTime data){
        this.comando =comando;
        this.classe =classe;
        this.data =data;
    }

    public LocalDateTime getTimeNow(){
        return LocalDateTime.now();
    }

    public LogModel(){

    }

}


