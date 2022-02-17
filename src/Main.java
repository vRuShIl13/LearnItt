/*
This is the main class take will carry ou the input and output functions.
 */

public class Main {

    public static void main(String[] args) {

        Tutor p1 = new Tutor("Achar", 40);
        Tutor t1 = new Tutor("Chesoli", 40);
        Student s1 = new Student("Vru");
        Student n1 = new Student("Hari");
        Tutor t4 = new Tutor("Chess", 54);


        Website newW = new Website();
        newW.addTutor(p1);
        newW.addStudent(s1);
        newW.addTutor(t1);
        newW.addStudent(n1);
        newW.addTutor(t4);

        p1.addCourse("OO",100.00);
         t1.addCourse("OO",1000.00);
         t1.addCourse("Chem",100.00);
         t4.addCourse("OO",70.00);

        Person W1 = newW.getPerson("Chesoli");
        if(W1!= null){
            if(W1 instanceof Tutor){
                if(((Tutor) W1).findCourse("OO")){
                    Course c =  ((Tutor) W1).findC("OO");
                    if(c != null){
                        System.out.println(c.getName());
                    }
                }
            }
        }




        if(newW.request("Vru","OO",81) ){


            System.out.println("\n");

            System.out.println(s1.record());

            System.out.println(p1.record());

            System.out.println(t1.record());

            System.out.println(n1.record());


        }


    }
}


/*
MAKE sure that the request is successful if and only if all the hours
requested by the students are given to tutors (available )
things to do: what if the number of hours is more than those offered
by a specific tutor, look for more tutors, if found make the appointments.

make the proper output.

i/o is left

//adding the cost variable in the student class this will
keep accumulating as they book appointments with more tutors

 */