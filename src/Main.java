/*
This is the main class take will carry ou the input and output functions.
 */

public class Main {

    public static void main(String[] args) {

        Person p1 = new Tutor("Achar", 10);
        Person t1 = new Tutor("Chesoli", 100);
        Person s1 = new Student("Vrushil");


        Website newW = new Website();
        newW.addPerson(p1);
        newW.addPerson(t1);
        newW.addPerson(s1);

        Person copy1 = newW.getFirst();  //Vrushil
        Person specific = newW.getPerson("Achar");
        Person last = newW.getLast();   //achar

        Person specific2 = newW.getPerson("Vrushil");

        System.out.println(copy1.toString());

        System.out.println(specific.toString());

        System.out.println(last.toString());

        System.out.println(specific2.toString());


        System.out.println(t1);

        if(p1 instanceof Tutor) {
            ((Tutor) p1).addCourse("Chemistry", 100.00);
            ((Tutor) p1).addCourse("Mathematics", 120.00);
        }

        System.out.println(p1);






    }
}
