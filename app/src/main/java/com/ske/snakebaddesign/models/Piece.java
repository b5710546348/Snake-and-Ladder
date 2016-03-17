package com.ske.snakebaddesign.models;

/**
 * Created by Zen on 3/15/16.
 */
public class Piece {

    private int position;


    public Piece(){

        position = 0;
    }

    public int getPosition(){
        return position;
    }

    public void updatePosition(int newPosition){
        position = newPosition;
    }



}
