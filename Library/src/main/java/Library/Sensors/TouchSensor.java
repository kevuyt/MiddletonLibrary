package Library.Sensors;

import androidx.annotation.NonNull;

import static Library.Resources.Utils.getHardwareMap;

/**
 * Created by Keval Kataria on 3/15/2021
 */

public class TouchSensor {
    private final com.qualcomm.robotcore.hardware.TouchSensor touchSensor;
    private final String name;

    public TouchSensor(String name) {
        this.name = name;
        touchSensor = getHardwareMap().get(com.qualcomm.robotcore.hardware.TouchSensor.class, name);
    }

    public boolean isPressed() {return touchSensor.isPressed();}

    @NonNull
    @Override
    public String toString() {return String.format("%s:\nPressed: %b", name, isPressed());}
}