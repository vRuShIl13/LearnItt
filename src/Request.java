/*
This class is a representation of a formal request by the students looking for tutors in the courses
they are enrolled in.
The request either fails or succeeds
the request consists of student id , topic and hours.
 */

public class Request {
    private String stuId;
    private int numHrs;
    private Course tpc;

    //default constructor
    public Request(){
        stuId = null;
        numHrs= 0;
        tpc = null;
    }

    //2nd constructor
    public Request(String student, Course c , int h){
        stuId = student;
        tpc = c;
        numHrs = h;
    }

    @Override
    public String toString() {
        return "Request { " +
                "stuId='" + stuId + '\'' + ", numHrs=" + numHrs +
                ", tpc=" + tpc +  " }";
    }
}
