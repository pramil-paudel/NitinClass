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
     *  Assignmnet : Random Class ( 5 attributes, getter setter )
     *  Class ko ArrayList ( 1 attribute ko base ma sort )
     *  Map create
     *  Map of Arraylist of the class
     * They all are to be in separate Classes
     *
     * Install git
     * Git Basic Kura ( )
     *
     * Linus Trovald - Linux OS
     * GIT bhanne pani banako
     *
     * Version Control - Git Version Control
     *
     *
     *  Git Server / Remote  --- (Code Rakhinchha )
     *  Individual Developer - Remote Code Clone garchhan
     *  Individual developer le code garchhan - remote ma push garchhan
     *
     *  Yeutai Class ma code :: pull garchhan, remote sanga local ko code uptodate hnchha, add garchhan, push garchhan
     *
     *  git push
     *  git pull
     *  git fetch
     *  git commit
     *  git merge
     *
     *  15.0.1  Version
     *
     * 15.0.2 Branch create garchhan tyas ma code garchhan - code QA test garchhan - production ma janchha
     *
     *
     *
     *
     *  Baki kura git bare padhne
     *
     *  Git halna milchha ( git main program )
     *  Git command line bata chalchha
     *  GUI, git command lai use garera GUI haru pani painchha

     *
     *
     * iheritance
     * set, List, Map
     * Computer Mysql ( command line )
     *
     * */




}


