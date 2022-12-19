package com.company.classes.Task4;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Train> trains = new ArrayList<>();
        trains.add(new Train(123, "Vienna", 20, 15));
        trains.add(new Train(254, "Tokyo", 13, 15));
        trains.add(new Train(846, "Hanoi", 22, 0));
        trains.add(new Train(124, "Oslo", 55, 60));
        trains.add(new Train(124, "Oslo", 13, 15));
        trains.add(new Train(124, "Oslo", 8, 15));

        TrainSorter trainComparator = new TrainSorter();
        InfoPrinter infoPrinter = new InfoPrinter();

        trainComparator.sortByTrainsNumber(trains);
        System.out.println("Sorted trains by train number: ");
        infoPrinter.showInfoAllTrains(trains);

        trainComparator.sortByTrainsDestination(trains);
        System.out.println("Sorted trains by destination: " );
        infoPrinter.showInfoAllTrains(trains);

        System.out.println(("Printed information of trains: "));
        infoPrinter.showInfoAllTrains(trains);

        System.out.println(("Started the \"showTrainInfoByDestination\" "));
        infoPrinter.showTrainInfoByDestination(trains);
    }
}