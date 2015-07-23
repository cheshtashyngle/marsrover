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
        if (this.direction == 'E')
            this.direction = 'N';
        else if (this.direction == 'N')
            this.direction = 'W';
        else if (this.direction == 'W')
            this.direction = 'S';
        else
            this.direction = 'E';
    }

    public char direction() {
        return direction;
    }

    public void turnRight() {
        this.direction = 'S';
    }
}
