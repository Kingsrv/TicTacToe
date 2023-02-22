package ticTacToe.factory;

import ticTacToe.models.BotDifficultyLevel;
import ticTacToe.strategies.botPlayingStrategy.BotPlayingStrategy;
import ticTacToe.strategies.botPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategiesFactory {

    public static BotPlayingStrategy getPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return new RandomBotPlayingStrategy();
    }

}
