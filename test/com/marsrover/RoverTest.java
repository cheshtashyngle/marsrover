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

}
