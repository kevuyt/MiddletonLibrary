package Library.Sensors;

import androidx.annotation.NonNull;

import static Library.Resources.Utils.getHardwareMap;
import static java.util.Locale.US;
import static org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit.*;

/**
 * Created by Keval Kataria on 3/22/2021
 */

public class DistanceSensor {
    private final com.qualcomm.robotcore.hardware.DistanceSensor distanceSensor;
    private final String name;

    public DistanceSensor(String name) {
        this.name = name;
        distanceSensor =  getHardwareMap().get(com.qualcomm.robotcore.hardware.DistanceSensor.class, name);
    }

    public double inches() {return distanceSensor.getDistance(INCH);}
    public double centimeters() {return distanceSensor.getDistance(CM);}
    public double millimeters() {return distanceSensor.getDistance(MM);}
    public double meters() {return distanceSensor.getDistance(METER);}

    @NonNull
    @Override
    public String toString() {
        return String.format(US, "%s:\nMeters: %.2f\nInches: %.2f\nCentimeters: %.2f\nMillimeters: %.2f",
                name, meters(), inches(), centimeters(), millimeters());
    }
}