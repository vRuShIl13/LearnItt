/*
This is a linked list type of class that will hold the student and the tutor objects

 */

public class Website {
    private User first;

    //default constructor
    public Website(){
        first = null;
    }

    public void addPerson(Person type){

        User newU = new User(type);
        if (first != null) {
            newU.setNext(first);
        }
        first = newU;


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


    public Person getPerson(String name){
        User curr = first;
        while(curr!= null){
            System.out.println("inside while loop");
            Person type = curr.getType();

            if(type instanceof Tutor){
                Tutor newTutor = (Tutor)type;

                if((newTutor.userID).equals(name)){
                    System.out.println("Tutor");
                    return curr.getType();
                }

            }else{
                Student newStu = (Student)type;
                if((newStu.userID).equals(name)){
                    System.out.println("Student");
                    return curr.getType();
                }
            }
            curr = curr.getNext();
        }

        return null;
    }

}
