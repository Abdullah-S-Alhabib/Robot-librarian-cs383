package MainController;
//By Abdullah Alhabib 371111359

class MainController {
    /*
    Error method for error handling and error messages.
    Void because it directly sends a message output, so no need to return a value.
    Parameter errorCode: A number for the error which should trigger a response within this method, with a default
    error code for general unexpected errors.
     */

    public void error(int errorCode);

    /*
   Initiate the program.

   Manage the state of the robot:
   If there is no current command, then the state is idle.
   If the state is idle, the robot cleans.
   
   Manage the battery of the Robot, where there is a threshold that if the robot reaches it moves to charge,
   use the checkBattery() method to get battery life.
   The default threshold should be 10% battery or 15 minutes, whichever is lowest.

   Manage requests from the IO module and initiate proper response, return to the SDD document for more info on how
   they interact.

   Send output to the proper IO method.
    */

    public static void main(String[] args);
}
