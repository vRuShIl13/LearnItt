
//this is just an abstract class that will be a base for the student and the tutor
//this will be that static type , once a variable of this type is declared it cannot be changed.
// but the dynamic part can hold a student object or a tutor object

 public abstract class  Person {
     //commonly shared fields
     protected String userID;
     protected double totalCost;
     protected int totalhrs;


     //common methods
     //abstract method with no implementation


     public abstract String toString();
     public abstract void addAppointment(Appointment n);
     public abstract boolean equals(Person prn);
     public abstract void setTotalhrs(int totalhrs);
     public abstract void setTotalCost(double totalCost);
     public abstract String record ();


     public abstract String getUserID();
 }
