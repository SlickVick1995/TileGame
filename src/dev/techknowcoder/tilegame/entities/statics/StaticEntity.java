package dev.techknowcoder.tilegame.entities.statics;

import dev.techknowcoder.tilegame.Handler;
import dev.techknowcoder.tilegame.entities.Entity;

public abstract class StaticEntity extends Entity {
    public StaticEntity(Handler handler, float x, float y, int width, int height){
        super(handler, x, y, width, height);
    }
}
