// Nick Brouwer
// CS 410
// Assignment 2

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame {

    public SensorApplication() {
        javax.swing.UIManager.put("ProgressBar.selectionBackground", Color.black);
        javax.swing.UIManager.put("ProgressBar.selectionForeground", Color.black);

        setTitle("Sensor Tracker");
        setLayout(new GridLayout(3,1));

        // Pressure Sensor
        PressureSensorAdapter pressure = new PressureSensorAdapter();
        double pressureValue = pressure.getValue();
        JProgressBar pressureStatus = new JProgressBar(0, 10);
        pressureStatus.setStringPainted(true);
        pressureStatus.setValue((int)pressureValue);
        pressureStatus.setForeground(pressure.getColor());
        pressureStatus.setString(pressure.getReport() + " --> " + pressureValue);
        pressureStatus.setBorder(new TitledBorder(pressure.getName()));
        add(pressureStatus);

        // Radiation Sensor
        RadiationSensorAdapter radiation = new RadiationSensorAdapter();
        double radiationValue = radiation.getValue();
        JProgressBar radiationStatus = new JProgressBar(0, 5);
        radiationStatus.setStringPainted(true);
        radiationStatus.setValue((int)radiationValue);
        radiationStatus.setForeground(radiation.getColor());
        radiationStatus.setString(radiation.getReport() + " --> " + radiationValue);
        radiationStatus.setBorder(new TitledBorder(radiation.getName()));
        add(radiationStatus);

        // Temperature Sensor
        TemperatureSensorAdapter temperature = new TemperatureSensorAdapter();
        double temperatureValue = temperature.getValue();
        JProgressBar temperatureStatus = new JProgressBar(0, 400);
        temperatureStatus.setStringPainted(true);
        temperatureStatus.setValue((int)temperatureValue);
        temperatureStatus.setForeground(temperature.getColor());
        temperatureStatus.setString(temperature.getReport() + " --> " + temperatureValue);
        temperatureStatus.setBorder(new TitledBorder(temperature.getName()));
        add(temperatureStatus);

        setPreferredSize(new Dimension(600,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args)
    {
        SensorApplication app = new SensorApplication();
    }
}
