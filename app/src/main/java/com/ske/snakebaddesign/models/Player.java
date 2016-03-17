package com.ske.snakebaddesign.models;

/**
 * Created by Zen on 3/15/16.
 */
public class Player {

    private String name;

    private Piece piece;


    public Player(String temp_name){
        name = temp_name;

        piece = new Piece();
    }

    public String getName(){
        return name;
    }

    public Piece getPiece(){
        return piece;
    }



}
