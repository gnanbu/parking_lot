package com.org.parkinglot;

import com.org.parkinglot.processor.AbstractProcessor;
import com.org.parkinglot.processor.FileProcessor;
import com.org.parkinglot.processor.InteractiveParkingLotProcessor;

public class ParkingLotMain {

    public static void main(String[] args) throws Exception {

        AbstractProcessor processor;

        if (args.length >= 1) {
            processor = new FileProcessor(args[0]);
        } else {
            processor = new InteractiveParkingLotProcessor();
        }
        processor.process();
    }

}
