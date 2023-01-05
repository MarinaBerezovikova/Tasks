package com.company.agregationAndCoposition.Task3;

public class Runner {

    public static void main(String[] args) {

        //создание городов
        City cityOneA = new City("One", 388.8);
        City cityTwoA = new City("Two", 84.96);
        City cityThreeA = new City("Tree", 14.2);

        //формирование района Alpha
        District districtAlpha = new District("District Alpha");

        // добавление городов в район
        ListEditor editor = new ListEditor();
        editor.addToList(cityOneA, districtAlpha);
        editor.addToList(cityTwoA, districtAlpha);
        editor.addToList(cityThreeA, districtAlpha);

        //расчёт площади района
        SquareCalculator calculator = new SquareCalculator();
        calculator.calculateDistrictSquare(districtAlpha);

        //создание городов для второго района, повторение действий
        City cityRegionCenter = new City("One", 506.8);
        City cityTwoB = new City("Two", 84.96);
        City cityTreeB = new City("Tree", 14.2);
        City cityFourB = new City("Four", 100.3);

        District districtBeta = new District("District Beta");

        editor.addToList(cityRegionCenter, districtBeta);
        editor.addToList(cityTwoB, districtBeta);
        editor.addToList(cityTreeB, districtBeta);
        editor.addToList(cityFourB, districtBeta);

        calculator.calculateDistrictSquare(districtBeta);

        //создание области(региона)
        Region alphaBeta = new Region("AlphaBeta", cityRegionCenter);
        editor.addToList(districtAlpha, alphaBeta);
        editor.addToList(districtBeta, alphaBeta);

        calculator.calculateRegionSquare(alphaBeta);
/////////////////////////////////////////////////////////////////////////////////////////////////



        //создание второй области, повторение действий первой области
        City cityOneG = new City("One", 489.7);
        City cityTwoG = new City("Two", 87.96);
        City cityThreeG = new City("Tree", 65.2);

        District districtGamma = new District("District Gamma");

        editor.addToList(cityOneG, districtGamma);
        editor.addToList(cityTwoG, districtGamma);
        editor.addToList(cityThreeG, districtGamma);

        calculator.calculateDistrictSquare(districtGamma);

        City cityOneD = new City("One", 95.8);
        City cityRegionCenter2 = new City("Two", 84.96);
        City cityTreeD = new City("Tree", 14.2);
        City cityFourD = new City("Four", 100.3);

        District districtDelta = new District("District Delta");

        editor.addToList(cityOneD, districtDelta);
        editor.addToList(cityRegionCenter2, districtDelta);
        editor.addToList(cityTreeD, districtDelta);
        editor.addToList(cityFourD, districtDelta);

        calculator.calculateDistrictSquare(districtDelta);

        //создание области(региона)
        Region BetaGamma = new Region("BetaGamma", cityRegionCenter2);

        editor.addToList(districtGamma, BetaGamma);
        editor.addToList(districtDelta, BetaGamma);

        calculator.calculateRegionSquare(BetaGamma);
/////////////////////////////////////////////////////////////////////////////////////////////////

        //создание государства
        State state = new State("Alphabet", cityRegionCenter);
        editor.addToList(alphaBeta, state);
        editor.addToList(BetaGamma, state);

        calculator.calculateStateSquare(state);

        Shower shower = new Shower(state);
        shower.showCapitalState();
        shower.showCountRegions();
        shower.showRegionsCentres();
        shower.showStateSquare();
    }


}
