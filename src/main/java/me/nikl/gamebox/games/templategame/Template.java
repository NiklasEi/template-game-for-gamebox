package me.nikl.gamebox.games.templategame;

import me.nikl.gamebox.GameBox;
import me.nikl.gamebox.game.Game;
import me.nikl.gamebox.game.GameSettings;
import me.nikl.gamebox.games.GameTemplatePlugin;

/**
 * @author Niklas Eicker
 *
 * Main class of the game. The path to this class has to be passed to the module (@see {@link GameTemplatePlugin})
 */
public class Template extends Game {

    public Template(GameBox gameBox){
        super(gameBox, GameTemplatePlugin.gameID);
    }

    @Override
    public void onDisable() {
        // save your game specific stuff
    }

    @Override
    public void init() {

    }

    @Override
    public void loadSettings() {
        // or some other game type...
        gameSettings.setGameType(GameSettings.GameType.SINGLE_PLAYER);

        // the other settings are ok on default
    }

    @Override
    public void loadLanguage() {
        gameLang = new TemplateLanguage(this);
    }

    @Override
    public void loadGameManager() {
        gameManager = new TemplateManager(this);
    }
}