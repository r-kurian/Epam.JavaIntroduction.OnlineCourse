package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex2;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

Create an object of the Car class using the Wheel and Engine classes.
Methods: driving, refuelling, changing a wheel, displaying the make of the car on the console.
*/

public class Main {

    public static void main(String[] args) {

        // create 4 wheels
        Wheel t1 = new Wheel(7, 18, "Continental");
        Wheel t2 = new Wheel(7, 18, "Continental");
        Wheel t3 = new Wheel(7, 18, "Continental");
        Wheel t4 = new Wheel(0, 18, "Continental");

        // put 4 wheels in the car
        Wheel[] tire = {t1, t2, t3, t4};

        // create an object of class engine
        Engine engine = new Engine(70, Engine.TypeOfEngine.DIESEL, false);

        // create a car. add characteristics and objects of the composition, namely wheels (array, 4 pcs) and an engine
        Car myCar = new Car("black", "BMW", tire, engine, 0);

        // display info about the car
        myCar.print();

        System.out.println("\nChecking the readiness to run:");

        // check, if the tank is full
        CheckingOfSystem.testOfFullnessOfTank(myCar.getFullnessOfTank());

        // check, if the engine is running
        CheckingOfSystem.testIfEngineWorks(engine);

        // check, if the wheels are running
        CheckingOfSystem.testIfWheelsMoving(myCar);

        // check all systems. If all systems are OK, then the car is running
        CheckingOfSystem.testAllSystem(engine.isWorking, myCar.getFullnessOfTank(), myCar.startWheels());

        System.out.println("\n***************************************************************************");

        System.out.println("\nFixing the car breakdowns:");

        // pumping the flat tire
        t4.pumpUpTheFlatTire(7);

        // complete wheel replacement, 2nd position
        myCar.changeWheel(7, 18, "Michelin", 2);

        // turn on the engine
        myCar.turnOn();

        // fill the fuel tank
        myCar.refuel(100);

        myCar.print();

        System.out.println("\nChecking the readiness to run:");

        CheckingOfSystem.testOfFullnessOfTank(myCar.getFullnessOfTank());

        CheckingOfSystem.testIfEngineWorks(engine);

        CheckingOfSystem.testIfWheelsMoving(myCar);

        CheckingOfSystem.testAllSystem(engine.isWorking, myCar.getFullnessOfTank(), myCar.startWheels());

    }
}
