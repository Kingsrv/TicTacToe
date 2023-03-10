package ticTacToe.strategies.gameWinningStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Move;
import ticTacToe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastMovePlayer, Move lastMove);
    //DSA homework :- find the winner in O(1) time
}
