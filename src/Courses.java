/*
This is a class that is a linked list implementation, it will stores node that will be of type courses
tutors can use this to store the list of courses they offer to the students
 */


public class Courses {
    private Course first;


    //default constructor
    public Courses(){
        first  = null;
    }

    boolean addCourse(Course newC){
        Course curr = first;
        while (curr != null){
            if(curr.getName().equals(newC.getName())){
                return false;
            }
            curr = curr.getNext();
        }
        if (first != null) {
            newC.setNext(first);
        }
        first = newC;
        return true;
    }

    boolean findCourse(String name){
        Course curr = first;

        while(curr!= null){
            if(curr.getName().equals(name)){
                return true;
            }
            curr=curr.getNext();
        }
        return false;
    }

    Course findC(String name){
        Course curr = first;

        while(curr!= null){
            if(curr.getName().equals(name)){
                return curr;
            }
            curr=curr.getNext();
        }
        return null;
    }

    double getRate(String name){
        return 0.0;
    }

    public String toString() {
        Course curr = first;
        String str = "";
        while(curr!= null){
            str += curr.getName()+  ", ";
            curr=curr.getNext();
        }

        return str;
    }
}
