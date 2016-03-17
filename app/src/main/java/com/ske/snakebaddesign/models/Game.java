package com.ske.snakebaddesign.models;

import android.support.v7.app.AppCompatActivity;

import com.ske.snakebaddesign.R;
import com.ske.snakebaddesign.guis.BoardView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zen on 3/15/16.
 */
public class Game extends AppCompatActivity{

    private static Game instance;
    private Board board;
    private List<Player> players;
    private static int turn ;
    private Die die;
    private   BoardView  boardView;

    private Game(){
        turn = 0;
        board = new Board();
        players = new ArrayList<Player>();
        boardView = (BoardView)findViewById(R.id.board_view);
        die = new Die();
    }

    public static Game getInstance(){
        if(instance == null){
            instance = new Game();
        }
        return instance;
    }

    public void createPlayer(int number){
        for(int i = 0; i < number ; i++){
            players.add(new Player("Anonymous No." + (i+1)));
        }
    }

    public void onStart(){
        //create 2 players
        createPlayer(2);

        resetGame();
        GameProcess();
    }

    public void tossDice(){
        die.RandomFace();

    }




    public void GameProcess(){

        if(!checkEnd()) {
            for (Player player : players) {
                if (turn % 2 == 0) {
                    tossDice();
                    movePiece(players.get(0),1);

                } else {
                    tossDice();
                    movePiece(players.get(1),2);
                }
            }
            turn++;
        }

        else{
            resetGame();
        }
    }

    public void resetGame(){
        turn = 0;
        for(Player player : players){
            player.getPiece().updatePosition(0);
        }
    }

    public boolean checkEnd(){
        for(Player player : players) {
            if (player.getPiece().getPosition() == board.getSize()) {
                return true;
            }
        }
        return false;
    }

    public Die getDie(){
        return die;
    }

    public void movePiece(Player player,int type){
        int distance = die.getCurrentFace();
        int currentPiecePosition = player.getPiece().getPosition();
        player.getPiece().updatePosition(currentPiecePosition + distance);
        board.movePieceUIUpdate(type , player.getPiece().getPosition());
    }



}
