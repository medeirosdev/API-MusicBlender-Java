package com.medeiros.SPRINGProject.algorithm;

import com.medeiros.SPRINGProject.Models.MusicModel;
import com.medeiros.SPRINGProject.utils.hashMapFunctions;

import java.util.HashMap;
import java.util.Map;

public class algorithmBlender extends algorithmData {
    algorithmData AD = new algorithmData();



    public Map<String, Integer> algorithmCalc(Iterable<MusicModel> listMusics){
        HashMap<String, Integer> HashAlgorithm = new HashMap<>();
        //informacoes.put("informacao1", "valor1");
        for(MusicModel itemMusic : listMusics){
            int nlikes = itemMusic.getNumberOfLikes();
            int ncoments = itemMusic.getNumberOfComents();

            int likesPoints = AD.rithmPointsByLike(nlikes);
            int comentsPoints = AD.rithmPointsByComents(ncoments);

            int rithmPoints = likesPoints + comentsPoints;

            String musicName = itemMusic.getMusicName();

            HashAlgorithm.put(musicName , rithmPoints );

        }
        return hashMapFunctions.ordenarHashMapPorValor(HashAlgorithm);


    }


}
