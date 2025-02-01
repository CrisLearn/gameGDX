package cpm.epn.game;

import cpm.badlogic.gdx.Game;

public class EPNGame extends Game {
    @Override
    public void create() {
        // Establece la pantalla inicial del juego
        setScreen(new GameScreen(this));
    }
}
