// Nick Brouwer
// CS 410
// Assignment 2

import sensor.RadiationSensor;

import java.awt.*;

public class RadiationSensorAdapter implements SensorInterface {
    RadiationSensor temp = new RadiationSensor();

    @Override
    public String getName()     // Gets the sensor name
    {
        return temp.getName();
    }

    @Override
    public String getReport()       // Gets the sensor status
    {
        return temp.getStatusInfo();
    }

    @Override
    public double getValue()        // Gets the sensor read value
    {
        return temp.getRadiationValue();
    }

    @Override
    public Color getColor()     // Gets the color based on the status of the reading
    {
        Color color;
        String status = temp.getStatusInfo();
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
