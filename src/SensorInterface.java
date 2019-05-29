// Nick Brouwer
// CS 410
// Assignment 2

import java.awt.*;

public interface SensorInterface {

    // Gets the sensor name
    String getName();

    // Gets the sensor status
    String getReport();

    // Gets the sensor read value
    double getValue();

    // Gets the color based on the status of the reading
    Color getColor();
}
