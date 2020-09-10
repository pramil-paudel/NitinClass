package student;

import java.util.*;

class Student {

    public static void main(String[] args) {
        test();
    }


    static void test() {

        /**
         *  Collection
         *
         *  ArrayList, LinkList
         * */
        // array list
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        //object create
        Vehicle carObjOne = new Vehicle();
        carObjOne.setName("BMW");
        Vehicle carObjTwo = new Vehicle();
        carObjTwo.setName("Toyata");
        Vehicle carObjThree = new Vehicle();
        carObjThree.setName("AUDI");

        //list operation

        vehicles.add(carObjOne);
        vehicles.add(carObjOne);
        vehicles.add(carObjTwo);
        vehicles.add(carObjThree);


        //get
        // classical for loop
        for(int i=0;i<vehicles.size();i++){
            System.out.println(vehicles.get(i).getName());
        }

        for (Vehicle individualVehicle : vehicles){
            System.out.println(individualVehicle.getName());

        }

        /**
         *  Set List but no duplicate element
         * */

        Set<Vehicle> vehicle_set = new HashSet<>();
        vehicle_set.addAll(vehicles);
        for (Vehicle individualVehicle : vehicle_set){
            System.out.println("tt");
            System.out.println(individualVehicle.getName());

        }

        /**
         *
         * Map ( K, V)
         * Key and Value Pair
         * Key is an object
         * Value is also an Object
        * */

        Map< String, Vehicle > vehicleMap = new HashMap<>();
        //vehicleMap.put("firstChoice", carObjOne);
        vehicleMap.put("secondChoice", carObjTwo);
        vehicleMap.put("thirdChoice", carObjThree);


//        System.out.println(vehicleMap.get("firstChoice").getName());


        for(String key : vehicleMap.keySet()){
            System.out.println(vehicleMap.get(key).getName());
        }

        if(!vehicleMap.containsKey("firstChoice")){
            System.out.println(vehicleMap.get("secondChoice").getName());
        }

    }


    /**
     *
     * iheritance
     * set, List, Map
     *
     * */


}


