/*
This is a class that creates courses and the rates provided by the tutors.
this class holds the course name and the rate offered by the tutor
*/


public class Course {
    private String name;
    private double rate;
    private Course next;

    //default constructor
    public Course(){
        name = "";
        rate = 0.0;
        next = null;
    }
    //2nd constructor
    public Course(String cName, double amount){
        name = cName;
        rate = amount;
        next = null;
    }

    //Getters and setters
    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public Course getNext() {
        return next;
    }
    public void setNext(Course next) {
        this.next = next;
    }
}
