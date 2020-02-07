package dev.techknowcoder.tiles;

import dev.techknowcoder.tilegame.gfx.Assets;

import java.awt.image.BufferedImage;

public class RockTile extends Tile {
    public RockTile(int id) {
        super(Assets.stone, id);
    }

    @Override
    public boolean isSolid(){
        return false;
    }
}
