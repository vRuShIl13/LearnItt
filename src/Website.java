/*
This is a linked list type of class that will hold the student and the tutor objects
This will be the main class of the program. It's called Website, as it stores the users.
Users = > these are persons/ people who can either be students or the tutors
tutors => they register in the website to provide tutoring in one or more courses. their details can be provided upon request
students => they register to look for tutors in certain courses. details show their appointments and their fees

 */

import java.sql.SQLOutput;

public class Website {
    //CLASS  fields
    //pointer to the first user
    private User first;

    //default constructor
    public Website(){
        first = null;
    }


    //this method adds a new person who wants to register in the website.
    public boolean addPerson(Person type){

        User curr = first;
        while (curr != null){
            if(curr.getType() instanceof Tutor && type instanceof Tutor ){
                if((((Tutor)curr.getType()).getUserID()).equals(((Tutor)type).getUserID())){
                    return false;
                }
            }else if(curr.getType() instanceof Student && type instanceof Student ){
                if((curr.getType()).userID.equals(type.userID)){
                   return false;
                }
            }
            curr = curr.getNext();
        }
        User newU = new User(type);
        if (first != null) {
            newU.setNext(first);
        }
        first = newU;
        return true;
    }


    //this method allows the website to extract a user using the userID
    //it can either be a student or a tutor, casting is applied to get the accurate result
    public Person getPerson(String name){
        User curr = first;
        while(curr!= null){
            Person type = curr.getType();
            if(type instanceof Tutor){
                if((((Tutor)type).getUserID()).equals(name)){
                    return curr.getType();
                }
            }else{
                if((type.userID).equals(name)){
                    return curr.getType();
                }
            }
            curr = curr.getNext();
        }
        return null;
    }

    public Student getStudent(String name){

        User curr = first;

        while(curr!= null){
            if(curr.getType() instanceof Student  ){
                if((((Student)curr.getType()).userID).equals(name)){
                    return (Student) curr.getType();
                }
            }
            curr = curr.getNext();
        }

        return null;
    }


    //this is the main part of the website
    //according to the topic given in the parameter, a search is done through the list of tutors, and  then through their list of courses, if they tutor the tpc
    public boolean request(String stuId, String tpc, int n){
        boolean val = false;

        User curr = first;;
        Tutor tutor1;
        Student eligibleStu;
        Course currTutCourse = null;

        //start by looking for the student in the website
        eligibleStu = getStudent(stuId);

        if(eligibleStu != null){
            //now look for all the tutors with availabe hrs and specifically teaching the course.
            //store the in a temporary list of tutors
            Tutor eligibleTut = null;
            
            while(curr!=null){
                if(curr.getType() instanceof Tutor){
                     tutor1 = ((Tutor) curr.getType());
                    if((tutor1.getNumHrs()>0) && (tutor1.findCourse(tpc))){
                        System.out.println("coming till here?");
                         currTutCourse = tutor1.findC(tpc);

                        if(eligibleTut == null){
                            eligibleTut = tutor1;
                        }else{
                            if(currTutCourse.getRate()<eligibleTut.findC(tpc).getRate()){
                                eligibleTut =tutor1;
                            }else if(currTutCourse.getRate()==eligibleTut.findC(tpc).getRate()){
                                if(tutor1.getNumHrs()> eligibleTut.getNumHrs() ){
                                    eligibleTut = tutor1;
                                }else if((tutor1.getUserID().compareTo(eligibleTut.getUserID()))<0){
                                    eligibleTut = tutor1;
                                }
                            }
                        }
                    }
                }
                curr = curr.getNext();
            }
            if(eligibleTut.getNumHrs()>=n && currTutCourse != null){
                setAppointment(eligibleStu,eligibleTut,tpc,n ,currTutCourse.getRate() );

            }else{
                int remain = n - eligibleTut.getNumHrs();
                val = request(stuId,tpc,remain);
            }

        }else{
            System.out.println("Request Failed : Student with userID: "+ stuId + " not found!");
            return false;
        }
        return true;
    }

    public void setAppointment(Student student, Tutor tutor, String course, int hrs, double c){
        Appointment newAppointment = new Appointment(student.userID, tutor.getUserID(), course, hrs ,c);
        int remain = tutor.getNumHrs()-hrs;
        tutor.setNumHrs(remain);
        student.addAppointment(newAppointment);
        tutor.addAppointment(newAppointment);

    }





    public Person getFirst(){
        return first.getType();
    }
    public Person getLast(){
        User curr = first;

        while (curr.getNext()!=null){
            curr = curr.getNext();
        }
        return curr.getType();
    }

}
