package cpm.epn.game;

import cpm.badlogic.gdx.Gdx;
import cpm.badlogic.gdx.Screen;
import cpm.badlogic.gdx.graphics.GL20;
import cpm.badlogic.gdx.graphics.Texture;
import cpm.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
    private EPNGame game;
    private SpriteBatch batch;
    private Texture backgroundTexture;
    private Owl owl;

    public GameScreen(EPNGame game) {
        this.game = game;
        batch = new SpriteBatch();

        // Cargar texturas
        backgroundTexture = new Texture(Gdx.files.internal("background.png"));
        Texture owlTexture = new Texture(Gdx.files.internal("owl.png"));

        // Crear el búho
        owl = new Owl(owlTexture);
    }

    @Override
    public void render(float delta) {
        // Limpiar la pantalla
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Dibujar el fondo y el búho
        batch.begin();
        batch.draw(backgroundTexture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        owl.draw(batch);
        batch.end();

        // Actualizar la lógica del búho
        owl.update(delta);
    }

    @Override
    public void dispose() {
        // Liberar recursos
        batch.dispose();
        backgroundTexture.dispose();
        owl.dispose();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void show() {
    }
}
