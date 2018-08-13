package com.org.parkinglot.constant;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {


    @Test
    public void testCommandNegative() throws Exception {
        Operations command = Operations.findByName("create_parking_lot----null");
        assertTrue(command == null);
    }


    @Test
    public void testCommandPositive() throws Exception {
        Operations command = Operations.findByName("create_parking_lot");
        assertTrue(command != null);
    }
}