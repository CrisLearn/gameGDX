package cpm.epn.game;

import cpm.badlogic.gdx.graphics.Texture;
import cpm.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Owl {
    private Texture texture;
    private float x, y;

    public Owl(Texture texture) {
        this.texture = texture;
        x = 100; // Posición inicial X
        y = 100; // Posición inicial Y
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, x, y);
    }

    public void update(float delta) {
        // Mover el búho hacia la derecha
        x += 100 * delta;

        // Reiniciar posición si sale de la pantalla
        if (x > Gdx.graphics.getWidth()) {
            x = -texture.getWidth();
        }
    }

    public void dispose() {
        texture.dispose();
    }
}
