package in.stackroute;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Trainee john = new Trainee(122, "John", "Chennai");
        Trainee john2 = null;

        try {
            TraineeIO traineeIO = new TraineeIO();
//            traineeIO.serialize(john);
            john2 = traineeIO.deSerialize();
            System.out.println(john2);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}