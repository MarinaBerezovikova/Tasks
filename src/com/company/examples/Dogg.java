package com.company.examples;

class Dogg {
    String name;
    String says;

    public static void main(String[] args) {
        Dogg spot = new Dogg();
        Dogg scruffy = new Dogg();

        spot.name = "Spot";
        scruffy.name = "Scruffy";
        spot.says = "wow - wow";
        scruffy.says = "wrow - wrow";

        System.out.println(spot.name + " says: " + spot.says);
        System.out.println(scruffy.name + " says: " + scruffy.says);
        //System.out.println (Dog == );
    }
}
