package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex2;

public class CheckingOfSystem {

    //fuel tank check
    public static void testOfFullnessOfTank(int fullnessOfTank) {
        if (fullnessOfTank == 0) {
            System.out.println("!!! The tank is empty, you need to refuel");
        } else {
            System.out.println("... OK, you have enough fuel");
        }
    }

    // check, if the wheels can move
    public static void testIfWheelsMoving(Car myCar) {
        boolean isWheelsMove = false;
        isWheelsMove = myCar.startWheels();

        if (isWheelsMove) { // isWheelsMove == true
            System.out.println("... OK, the wheels can running");
        } else {
            System.out.println("!!! Some problem, check the wheels");
        }
    }

    // check, if the engine is on
    public static void testIfEngineWorks(Engine engine) {
        if (engine.isWorking) { // engine.isWorking == true
            System.out.println("... OK, the engine is running");
        } else {
            System.out.println("!!! Turn-on the engine");
        }
    }

    // check the whole system for driving
    public static void testAllSystem(boolean isWorking, int fullnessOfTank, boolean startWheels) {
        if ((isWorking = true) && (fullnessOfTank > 0) && (startWheels = true)) {
            System.out.println("THE CAR IS RUNNING!");
        } else {
            System.out.println("THE CAR FAILED TO START");
        }
    }
}
