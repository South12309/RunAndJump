package com.geekbrains.javaCore2.athletes;

import com.geekbrains.javaCore2.Jumpable;
import com.geekbrains.javaCore2.Runable;
import com.geekbrains.javaCore2.obstacles.Obstacle;
import com.geekbrains.javaCore2.obstacles.Treadmill;
import com.geekbrains.javaCore2.obstacles.Wall;

public abstract class Player {

    protected boolean passed = true;



    public boolean isPassed() {
        return passed;
    }

    public abstract void takeObstacle(Obstacle obstacle);
}
