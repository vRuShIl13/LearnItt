/*
This is a class that is a linked list implementation, it will stores node that will be of type courses
tutors can use this to store the list of courses they offer to the students
 */


public class Courses {
    Course first;


    //default constructor
    public Courses(){
        first  = null;
    }

    boolean addCourse(String name, double rate){
        Course curr = first;
        while (curr != null){
            if(curr.name.equals(name)){
                return false;

            }
            curr = curr.getNext();
        }
        Course newC = new Course(name, rate);

        if (first == null) {
            newC.setNext(first);
        }
        first = newC;
        return true;

    }


}
