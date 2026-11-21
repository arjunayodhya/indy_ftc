import android.util.Size;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//more imports needed
//this is just basic build more needed
VisionPortal myVisionPortal;
//builder pattern and method chaining as opposed to individual method calls
myVisionPortal = new VisionPortal.Builder()
    .setCamera(hardwareMap.get(WebcamName.class, "Webcam 1"))
    .addProcessor(myAprilTagProcessor)
    .setCameraResolution(new Size(640, 480))
    .setStreamFormat(VisionPortal.StreamFormat.YUY2)
    .enableCameraMonitoring(true)
    .setAutoStopLiveView(true)
    .build();
