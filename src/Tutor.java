/*
This is the class that stores the tutors.
Tutors offer tutoring of specific courses to students
tutors register using their userId and the number of hours available during the semester
 */


 class Tutor extends Person{
    protected String userID;
    protected int numHrs;
    int numCourses = 0;
    Course [] courses = new Course[20];

    //default constructor
    public Tutor(){
        userID = "";
        numHrs = 0;
    }

    //2nd constructor
    public Tutor(String name, int hours){
        userID = name;
        numHrs = hours;
    }


    //when the tutor registers a course and the rate
    //this method adds a course in the tutors list of courses
    boolean  addCourse(String name , double rate){
        boolean val = false;

        if(numCourses<20){
            Course newC = new Course(name, rate);
            courses[numCourses] = newC;
            numCourses++;
            val = true;
        }

        return val;
    }


    //returns the number of courses registered by the tutor.
    int howManyCourses (){
        return numCourses;
    }

    //to string method
    public String toString() {
        return "Report for Tutor  " + "\n--------------------------\n "+ " userID = '" + userID + ", numHrs = " + numHrs + ", numCourses = " + numCourses + " }" ;
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
