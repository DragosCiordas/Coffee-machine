package ex4;

import jdk.internal.event.Event;
import ex4.event.*;
import ex4.sensor.*;
import ex4.unit.*;
import sun.management.Sensor;
import sun.tools.jconsole.Plotter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Controller extends Home implements Unit {

    private static Logger LOGGER = Logger.getLogger(Controller.class);
    private Unit heatUnit = new HeatingUnit();
    private Unit coolUnit = new CoolingUnit();
    private Unit alarmUnit = new AlarmUnit();
    private Unit gsmUnit = new GsmUnit();
    private static int temp_value = 23;
    Sensor tempSensor = new TemperatureSensor();
    List<Sensor> fireSensors = new ArrayList<>(5);
    private static Controller instance;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Controller() {
        for (int i = 0; i < 5; i++) {
            fireSensors.add(new FireSensor());

        }
    }

    @Override
    protected void controllStep() {
        LOGGER.info("Control step: ");
        fireSensors.stream()
                .filter(sensor -> sensor.getValue() == 1)
                .findAny()
                .ifPresent(sensor -> {
                    alarmUnit.execute();
                    gsmUnit.execute();
                });
        if (tempSensor.getValue() < temp_value)
            heatUnit.execute();
        else {
            coolUnit.execute();
        }
        LOGGER.info("");

        fireSensors.forEach(sensor ->sensor.setValue(0));
    }

    @Override
    protected void setValueInEnvironment(Event event) {
        switch(event.getType()){
            case TEMPERATURE:
                this.tempSensor.setValue((TemperatureEvent)event).getValue());
                break;
            case FIRE:
                this.fireSensors.get(r.nextInt(fireSensors.size())).setValue((FireEvent)e);
                break;
            case NONE:
                break;
            default: throw new IllegalStateException("Unexpected value: " + event.getType());

        }
    }
    @Override
    public void execute(){
        super.simulate();
    }
}