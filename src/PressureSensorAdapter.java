// Nick Brouwer
// CS 410
// Assignment 2

import sensor.PressureSensor;

import java.awt.*;

public class PressureSensorAdapter implements SensorInterface {
    PressureSensor temp = new PressureSensor();

    @Override
    public String getName()     // Gets the sensor name
    {
        return temp.getSensorName();
    }

    @Override
    public String getReport()       // Gets the sensor status
    {
        return temp.getReport();
    }

    @Override
    public double getValue()        // Gets the sensor read value
    {
        return temp.readValue();
    }

    @Override
    public Color getColor()     // Gets the color based on the status of the reading
    {
        Color color;
        String status = temp.getReport();
        if(status == "OK")
        {
            color = Color.green;
        }else if(status == "CRITICAL")
        {
            color = Color.yellow;
        }else
        {
            color = Color.red;
        }
        return color;
    }
}
