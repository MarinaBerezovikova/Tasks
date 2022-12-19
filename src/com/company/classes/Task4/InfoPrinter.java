package com.company.classes.Task4;

import java.time.LocalTime;
import java.util.*;

public class InfoPrinter {


    public void showInfoAllTrains(List<Train> trains) {
        for (Train train : trains) {
            System.out.println("Number of train: " + train.getTrainNumber() +
                    " will head to " + train.getDestination() + ". The time of departure: "
                    + train.getDepartureTime());
        }
    }

    private static final String CANCEL_FOR_REQUEST_INFO = "No";

    public void showTrainInfoByDestination(List<Train> trains) {

        String currentDestination;
        String inputtedDestination;
        Train currentTrain;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a destination to get the departure times info: ");

        while (!scanner.hasNext(CANCEL_FOR_REQUEST_INFO)) {
            inputtedDestination = scanner.nextLine();

            for (Train train : trains) {
                currentTrain = train;
                currentDestination = currentTrain.getDestination();

                if (currentDestination.equals(inputtedDestination)) {
                    System.out.println("Number of train: " + currentTrain.getTrainNumber() +
                            " will head to " + currentDestination + ". The time of departure: "
                            + currentTrain.getDepartureTime());
                }
            }
            System.out.println("Input second destination or input \"No\" for finish search info. ");
        }
        System.out.println("Program is closed.");
        scanner.close();
    }
}