/*
This is the main class take will carry ou the input and output functions.
 */

public class Main {

    public static void main(String[] args) {

        Tutor p1 = new Tutor("Achar", 10);
        Person t1 = new Tutor("Chesoli", 100);
        Person s1 = new Student("Vrushil");
        Person s4= new Tutor("Achar",1);

        Website newW = new Website();
        newW.addPerson(p1);
        newW.addPerson(t1);
        newW.addPerson(s1);
        if(newW.addPerson(s4)){
            System.out.println("wtf");
        }else{
            System.out.println("duplicate");
        }

        Person copy1 = newW.getFirst();  //Vrushil
        Person specific = newW.getPerson("Achar");
        Person last = newW.getLast();   //achar

        Person specific2 = newW.getPerson("Vrushil");


        System.out.println(copy1.toString());
        System.out.println(specific.toString());
        System.out.println(last.toString());

        System.out.println(specific2.toString());


        System.out.println(t1);

        p1.addCourse("Chemistry", 100.00);
        p1.addCourse("Mathematics", 120.00);

        System.out.println(p1);






    }
}
