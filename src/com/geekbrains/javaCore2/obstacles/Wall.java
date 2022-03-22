package com.geekbrains.javaCore2.obstacles;

public class Wall extends  Obstacle{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
