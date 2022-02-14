public class Appointment {
    private String stuName;
    private String tutorName;
    private String courseN;
    private int hours;
    private double cost;
    private Appointment next;


    public Appointment(){
        stuName = "";
        tutorName = "";
        courseN = "";
        cost = 0.0;
        hours = 0;
    }
    public  Appointment(String student, String tutor, String course, int hrs,double c){
        stuName = student;
        tutorName = tutor;
        courseN = course;
        hours = hrs;
        cost = c;
    }


    @Override
    public String toString() {
        return "Appointment{" +
                "stuName='" + stuName + '\'' +
                ", tutorName='" + tutorName + '\'' +
                ", courseN='" + courseN + '\'' +
                ", hours=" + hours +
                ", cost=" + cost +
                '}';
    }

    public Appointment getNext() {
        return next;
    }

    public void setNext(Appointment next) {
        this.next = next;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCourseN(String courseN) {
        this.courseN = courseN;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public double getCost() {
        return cost;
    }

    public int getHours() {
        return hours;
    }

    public String getCourseN() {
        return courseN;
    }

    public String getStuName() {
        return stuName;
    }

    public String getTutorName() {
        return tutorName;
    }
}
