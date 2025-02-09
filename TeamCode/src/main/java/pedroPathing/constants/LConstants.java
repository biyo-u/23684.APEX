package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class LConstants {
    static {
        // TODO: (DONE) Change this to offsets (using this https://pedropathing.com/localization/setup.html#robot-coordinate-grid)
        PinpointConstants.forwardY = -6.8745;
        PinpointConstants.strafeX = -6.44;
        PinpointConstants.distanceUnit = DistanceUnit.INCH;
        // TODO: (DONE) Change this
        PinpointConstants.hardwareMapName = "odo";
        PinpointConstants.useYawScalar = false;
        // TODO: (DONE) Change this
        PinpointConstants.encoderResolution = GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_SWINGARM_POD;
        // TODO: (DONE) Change this
        PinpointConstants.forwardEncoderDirection = GoBildaPinpointDriver.EncoderDirection.REVERSED;
        PinpointConstants.strafeEncoderDirection = GoBildaPinpointDriver.EncoderDirection.REVERSED;

        // TODO: (DONE) 1. When you are done, test with SensorGoBildaPinpointExample.java
        // TODO: 2. If that works, test again with LocalizationTest.java and go to the field view on http://192.168.43.1:8080/dash
        // TODO: 3. Do the 8 tuning steps given in FConstants.java
    }
}




