package com.ske.snakebaddesign.models;

import android.support.v7.app.AppCompatActivity;

import com.ske.snakebaddesign.R;
import com.ske.snakebaddesign.guis.BoardView;

/**
 * Created by Zen on 3/15/16.
 */
public class Board extends AppCompatActivity{

    private int size;
    private BoardView boardView;
    private Game game;

    public Board(){
        boardView = (BoardView)findViewById(R.id.board_view);
    }

    public void getMessage(){

    }

    public int getSize(){
        return size;
    }

    public void movePieceUIUpdate(int type , int position){
        if(type == 1){
            boardView.setP1Position(position);
        }
        else if(type == 2){
            boardView.setP2Position(position);
        }
    }

    public Board getBoard(){
        return this;
    }

}
