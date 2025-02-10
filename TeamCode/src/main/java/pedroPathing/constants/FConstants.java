package pedroPathing.constants;

import com.pedropathing.localization.Localizers;
import com.pedropathing.follower.FollowerConstants;
import com.pedropathing.util.CustomFilteredPIDFCoefficients;
import com.pedropathing.util.CustomPIDFCoefficients;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FConstants {
    static {
        // TODO: (DONE) Set this values
        FollowerConstants.localizers = Localizers.PINPOINT;

        // TODO: (DONE) Set these values
        // TODO: Check this

        // Original (Strafing and Turning reversed)
        FollowerConstants.leftFrontMotorName = "frontLeft";
        FollowerConstants.leftRearMotorName = "rearLeft";
        FollowerConstants.rightFrontMotorName = "frontRight";
        FollowerConstants.rightRearMotorName = "rearRight";
        FollowerConstants.leftFrontMotorDirection = DcMotorSimple.Direction.REVERSE;
        FollowerConstants.leftRearMotorDirection = DcMotorSimple.Direction.REVERSE;
        FollowerConstants.rightFrontMotorDirection = DcMotorSimple.Direction.FORWARD;
        FollowerConstants.rightRearMotorDirection = DcMotorSimple.Direction.FORWARD;

        // Front and Back Switched (TO TEST)
//        FollowerConstants.leftFrontMotorName = "rearLeft";
//        FollowerConstants.leftRearMotorName = "frontLeft";
//        FollowerConstants.rightFrontMotorName = "rearRight";
//        FollowerConstants.rightRearMotorName = "frontRight";
//        FollowerConstants.leftFrontMotorDirection = DcMotorSimple.Direction.REVERSE;
//        FollowerConstants.leftRearMotorDirection = DcMotorSimple.Direction.REVERSE;
//        FollowerConstants.rightFrontMotorDirection = DcMotorSimple.Direction.FORWARD;
//        FollowerConstants.rightRearMotorDirection = DcMotorSimple.Direction.FORWARD;

        // Left and Right Switched (TO TEST)
//        FollowerConstants.leftFrontMotorName = "frontRight";
//        FollowerConstants.leftRearMotorName = "rearRight";
//        FollowerConstants.rightFrontMotorName = "frontLeft";
//        FollowerConstants.rightRearMotorName = "rearLeft";
//        FollowerConstants.leftFrontMotorDirection = DcMotorSimple.Direction.FORWARD;
//        FollowerConstants.leftRearMotorDirection = DcMotorSimple.Direction.FORWARD;
//        FollowerConstants.rightFrontMotorDirection = DcMotorSimple.Direction.REVERSE;
//        FollowerConstants.rightRearMotorDirection = DcMotorSimple.Direction.REVERSE;

        // Left and Right Switched and Forward and Back Switched (TO TEST)
//        FollowerConstants.leftFrontMotorName = "rearRight";
//        FollowerConstants.leftRearMotorName = "frontRight";
//        FollowerConstants.rightFrontMotorName = "rearLeft";
//        FollowerConstants.rightRearMotorName = "frontLeft";
//        FollowerConstants.leftFrontMotorDirection = DcMotorSimple.Direction.FORWARD;
//        FollowerConstants.leftRearMotorDirection = DcMotorSimple.Direction.FORWARD;
//        FollowerConstants.rightFrontMotorDirection = DcMotorSimple.Direction.REVERSE;
//        FollowerConstants.rightRearMotorDirection = DcMotorSimple.Direction.REVERSE;

        // TODO: (DONE) Set this value (in kilograms)
        FollowerConstants.mass = 12.3;

        // TODO: Do the steps in LConstants.java
        // TODO: Tune your robot with https://pedropathing.com/automatic/prerequisites.html and https://pedropathing.com/pidf/test.html

//        FollowerConstants.xMovement = 57.8741;
//        FollowerConstants.yMovement = 52.295;
//
//        FollowerConstants.forwardZeroPowerAcceleration = -41.278;
//        FollowerConstants.lateralZeroPowerAcceleration = -59.7819;
//
//        FollowerConstants.translationalPIDFCoefficients.setCoefficients(0.1,0,0.01,0);
//        FollowerConstants.useSecondaryTranslationalPID = false;
//        FollowerConstants.secondaryTranslationalPIDFCoefficients.setCoefficients(0.1,0,0.01,0); // Not being used, @see useSecondaryTranslationalPID
//
//        FollowerConstants.headingPIDFCoefficients.setCoefficients(2,0,0.1,0);
//        FollowerConstants.useSecondaryHeadingPID = false;
//        FollowerConstants.secondaryHeadingPIDFCoefficients.setCoefficients(2,0,0.1,0); // Not being used, @see useSecondaryHeadingPID
//
//        FollowerConstants.drivePIDFCoefficients.setCoefficients(0.1,0,0,0.6,0);
//        FollowerConstants.useSecondaryDrivePID = false;
//        FollowerConstants.secondaryDrivePIDFCoefficients.setCoefficients(0.1,0,0,0.6,0); // Not being used, @see useSecondaryDrivePID
//
//        FollowerConstants.zeroPowerAccelerationMultiplier = 4;
//        FollowerConstants.centripetalScaling = 0.0005;
//

        // These values are never set in the tuning docs, but the first one is overwritten 

//        FollowerConstants.pathEndTimeoutConstraint = 500;
//        FollowerConstants.pathEndTValueConstraint = 0.995;
//        FollowerConstants.pathEndVelocityConstraint = 0.1;
//        FollowerConstants.pathEndTranslationalConstraint = 0.1;
//        FollowerConstants.pathEndHeadingConstraint = 0.007;
    }
}
