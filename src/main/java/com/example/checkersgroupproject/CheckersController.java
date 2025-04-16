package com.example.checkersgroupproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CheckersController {
    Board board = new Board();
    Player player;

    @FXML
    private Label boardLabel;

    @FXML
    private Label movesLabel;

    @FXML
    private TextField inputTextField;

    //This method process the move selection from the user.
    @FXML
    private void processMoveButtonPress(){

    }

    //This method sets up the board and displays the moves.
    public void initialize(){
        boardLabel.setText(board.show());
        movesLabel.setText(String.valueOf(board.getValidMoves(player)));

    }

}
