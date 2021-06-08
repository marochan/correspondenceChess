package com.szachyonline.szachyonlinedemo;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.move.Move;
import com.github.bhlangonijr.chesslib.Square;
@RestController
public class GameBroker {
    
    public GameBroker(){};

    public void saveGame(String gameId, Board board){
        //placeholder
    }

    public Board getGame(String gameId){
        //placeholder: sample code only
        Board board = new Board();
        board.doMove(new Move(Square.E2, Square.E4));

        return board;
    }

   
    public String getNewGameId(){

        //Returns random string for now - should be replaced
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) 
            (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        System.out.println(buffer);
        return generatedString;
    }

    @GetMapping("/join-random")
    public String addToRandomGames(String gameId){
        //placeholder
    	return "lol";
    }

    public String getRandomExistingGameId(){
        //PLACEHOLDER ONLY - for now returns just random game Id 
        return getNewGameId();
    }


}