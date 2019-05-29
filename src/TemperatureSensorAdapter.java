// Nick Brouwer
// CS 410
// Assignment 2

import sensor.TemperatureSensor;

import java.awt.*;

public class TemperatureSensorAdapter implements SensorInterface {
    TemperatureSensor temp = new TemperatureSensor();

    @Override
    public String getName()     // Gets the sensor name
    {
        return temp.getSensorType();
    }

    @Override
    public String getReport()       // Gets the sensor status
    {
        return temp.getTempReport();
    }

    @Override
    public double getValue()        // Gets the sensor read value
    {
        return temp.senseTemperature();
    }

    @Override
    public Color getColor()     // Gets the color based on the status of the reading
    {
        Color color;
        String status = temp.getTempReport();
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
