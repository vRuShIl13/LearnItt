/*
This is the class that stores the tutors.
Tutors offer tutoring of specific courses to students
tutors register using their userId and the number of hours available during the semester
 */


 class Tutor extends Person{
    protected String userID;
    protected int numHrs;
    int numCourses = 0;
    Courses numC;

    //default constructor
    public Tutor(){
        userID = "";
        numHrs = 0;
        numC = new Courses();
    }

    //2nd constructor
    public Tutor(String name, int hours){
        userID = name;
        numHrs = hours;
        numC = new Courses();
    }


    //when the tutor registers a course and the rate
    //this method adds a course in the tutors list of courses
    boolean  addCourse(String name , double rate){
        boolean val = false;

        if(numCourses<20){
            Course newC = new Course(name, rate);
            numC.addCourse(newC);
            numCourses++;
            val = true;
        }

        return val;
    }


    //this method checks the object in the parameter is the same class as the current object instance
     public boolean equals(Person prn) {
         return prn instanceof Tutor;
     }

     //returns the number of courses registered by the tutor.
    int howManyCourses (){
        return numCourses;
    }

    //to string method
    public String toString() {
        return "Report for Tutor  " + "\n--------------------------\n "+ " userID = '" + userID + ", numHrs = " + numHrs + ", numCourses = " + numCourses + " }"
                ;
    }

    public String getCourses(){
        return numC.toString();
    }

    //GETTERS AND SETTERS
    public void setNumHrs(int numHrs) {
        this.numHrs = numHrs;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public int getNumHrs() {
        return numHrs;
    }
    public String getUserID() {
        return userID;
    }

}
