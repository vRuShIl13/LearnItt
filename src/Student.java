/*
This is the student class. it hold the person who wnats to be tutored in different courses by tutors registered in hte website
This class extends Person class and will contain details about a registered student for example :
UserId, appointments , total cost of the tuition etc
 */


class Student extends Person {

    private Appointments aps;

    //default constructor
    public Student(){

        userID = "";
        totalCost = 0;
        totalhrs = 0;
        aps = new Appointments();
    }

    //second constructor
    public Student(String name){
        totalCost = 0;
        totalhrs = 0;
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

    public int getTotalhrs() {
        return totalhrs;
    }

    public void setTotalhrs(int totalhrs) {
        this.totalhrs += totalhrs;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost += totalCost;
    }

    public String record (){
        return "------------------------"+"\n"+"Student "+this.userID + "'s "+ aps.toString() +"Total number of hours of tutoring: "+
                this.getTotalhrs() + "\nTotal cost for the Tuition is "+this.getTotalCost()+"\n";
    }



    public String  getUserID() {
        return userID;
    }

    //this method prints out the details of the student
     public String toString() {
         return "Student { " + " userID = '" + userID  +" }" ;
     }
 }
