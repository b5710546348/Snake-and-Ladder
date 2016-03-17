package com.ske.snakebaddesign.models;

/**
 * Created by Zen on 3/15/16.
 */
public class Die {

    private  int currentFace;

    public Die(){
        currentFace = 0;
    }

    public int getCurrentFace(){
        return currentFace;
    }

    public void RandomFace(){
        int new_face = (int)Math.floor(Math.random()*6);
        currentFace = new_face;
    }



}
