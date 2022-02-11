 class Student extends Person {

    int totalCost;
    int totalHrs;


    //default constructor
    public Student(){
        userID = "";
    }

    public Student(String name){
        userID = name;
    }



     public String toString() {
         return "Student { " + " userID = '" + userID  +" }" ;
     }
 }
