package com.company.classes.Task4;

import java.util.Comparator;
import java.util.List;

public class TrainSorter {

    public final Comparator<Train> COMPARE_BY_NUMBER = Comparator.comparingInt(Train::getTrainNumber);

    public void sortByTrainsNumber(List<Train> trains) {
        trains.sort(COMPARE_BY_NUMBER);
    }

    public final Comparator<Train> COMPARE_BY_DESTINATION = Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime);

    public void sortByTrainsDestination(List<Train> trains) {
        trains.sort(COMPARE_BY_DESTINATION);
    }
}
