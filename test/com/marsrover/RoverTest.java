package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void roverShouldTurnNorthFromEastWhenLeftIsApplied() {
        Rover rover = new Rover(0, 0, 'E');

        rover.turnLeft();

        assertEquals('N', rover.direction());
    }

    @Test
    public void roverShouldTurnWestFromNorthWhenLeftIsApplied() {
        Rover rover = new Rover(0, 0, 'N');

        rover.turnLeft();

        assertEquals('W', rover.direction());
    }

    @Test
    public void roverShouldTurnSouthFromWestWhenLeftIsApplied() {
        Rover rover = new Rover(0, 0, 'W');

        rover.turnLeft();

        assertEquals('S', rover.direction());
    }

    @Test
    public void roverShouldTurnEastFromSouthWhenLeftIsApplied() {
        Rover rover = new Rover(0, 0, 'S');

        rover.turnLeft();

        assertEquals('E', rover.direction());
    }

    @Test
    public void roverShouldTurnSouthFromWhenRightIsApplied() {
        Rover rover = new Rover(0, 0, 'E');

        rover.turnRight();

        assertEquals('S', rover.direction());
    }
}
