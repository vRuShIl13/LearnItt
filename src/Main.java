/*
This is the main class take will carry ou the input and output functions.
 */

public class Main {

    public static void main(String[] args) {

        Tutor p1 = new Tutor("Achar", 40);
        Person t1 = new Tutor("Chesoli", 10);
        Person s1 = new Student("Vru");


        Website newW = new Website();
        newW.addPerson(p1);
        newW.addPerson(s1);

        p1.addCourse("OO",120.00);

        Person W1 = newW.getPerson("Achar");
        if(W1!= null){
            if(W1 instanceof Tutor){
                if(((Tutor) W1).findCourse("OO")){
                    System.out.println("course found");
                    Course c =  ((Tutor) W1).findC("OO");
                    if(c != null){
                        System.out.println(c.getName());
                    }
                }
            }
            System.out.println("add");
        }

        if(newW.request("Vru","OO",20)){
            System.out.println("true");
            System.out.println(p1.getNumHrs());
            System.out.println("\n");
            System.out.println(((Student)s1).record());

        }






    }
}


/*
things to do: what if the number of hours is more than those offered
by a specific tutor, look for more tutors, if found make the appointments.

make the proper output.

i/o is left


 */