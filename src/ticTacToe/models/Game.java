package ticTacToe.models;

import com.sun.xml.internal.bind.v2.model.core.BuiltinLeafInfo;
import ticTacToe.exceptions.InvalidGameCreationParameteresException;
import ticTacToe.strategies.gameWinningStrategy.EfficientGameWinningStrategy;
import ticTacToe.strategies.gameWinningStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;
    private Player winner;

    //buider design pattern

    private Game(){

    }

    public void undo(){

    }

    public void makeNextMove(){
        //keeps the game running , If after a move any user wins then only stop the game.
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;

        public Builder setDimension(int  dimension){
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayer(List<Player> players){
            this.players = players;
            return this;
        }

        private boolean valid() throws InvalidGameCreationParameteresException{
            if(this.dimension < 3){
                throw new InvalidGameCreationParameteresException("Dimensions should be greater than or equal to 3");
            }

            if(this.players.size() != this.dimension -1){
                throw new InvalidGameCreationParameteresException("Players should at least be one less than the dimension");
            }
            //TODO:
            //validate more things
            //1. number of players
            //2.max bot should be 1

            return true;
        }

        public Game build() throws InvalidGameCreationParameteresException{
            try{
                valid();
            }catch (Exception e){
                throw new InvalidGameCreationParameteresException("Game could not be created...");
            }
            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new EfficientGameWinningStrategy());

            return game;
        }
    }
}
