package oop;

class Employee {
    private int empID = 2;
    private int basicsSal = 20000;
    private int incentives = 200;
    private int ph = 0;
    private String name;

    void countSalaries() {
        System.out.println(basicsSal + incentives);
    }

    // getter and setters
// getter
    int getph(){
        return ph;
    }

    String getName(){
        return name;
    }
}
