/*
This is the student class. it hold the person who wnats to be tutored in different courses by tutors registered in hte website
This class extends Person class and will contain details about a registered student for example :
UserId, appointments , total cost of the tuition etc
 */


class Student extends Person {

    private double totalCost;
    private Appointments aps;

    //default constructor
    public Student(){

        userID = "";
        aps = new Appointments();
    }

    //second constructor
    public Student(String name){
        totalCost = 0;
        userID = name;
        aps = new Appointments();
    }

    public void addAppointment(Appointment n){
        aps.addAppointment(n);
    }

    //to check if there is another object is of the same class
    public boolean equals(Person prn) {
        return prn instanceof Student;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public String record (){
        return aps.toString();
    }
    //this method prints out the details of the student
     public String toString() {
         return "Student { " + " userID = '" + userID  +" }" ;
     }
 }
