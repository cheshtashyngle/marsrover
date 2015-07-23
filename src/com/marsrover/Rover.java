package com.marsrover;

public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private char direction;

    public Rover(int xCoordinate, int yCoordinate, char direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void turnLeft() {
    }

    public char direction() {
        if (this.direction == 'E')
            return 'N';
        else
            return 'W';
    }
}
