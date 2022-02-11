/*
This is the student class. it hold the person who wnats to be tutored in different courses by tutors registered in hte website
This class extends Person class and will contain details about a registered student for example :
UserId, appointments , total cost of the tuition etc
 */


class Student extends Person {

    int totalCost;
    int totalHrs;


    //default constructor
    public Student(){
        userID = "";
    }

    //second constructor
    public Student(String name){
        userID = name;
    }

    //to check if there is another object is of the same class
    public boolean equals(Person prn) {
        return prn instanceof Student;
    }

    //this method prints out the details of the student
     public String toString() {
         return "Student { " + " userID = '" + userID  +" }" ;
     }
 }
