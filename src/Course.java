/*
This is a class that creates courses and the rates provided by the tutors.
*/


public class Course {
    protected String name;
    protected double rate;

    //default constructor
    public Course(){
        name = "";
        rate = 0.0;
    }
    //2nd constructor
    public Course(String cName, double amount){
        name = cName;
        rate = amount;
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


}
