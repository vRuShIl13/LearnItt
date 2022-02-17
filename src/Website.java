/*
This is a linked list type of class that will hold the student and the tutor objects
This will be the main class of the program. It's called Website, as it stores the users.
Users = > these are persons/ people who can either be students or the tutors
tutors => they register in the website to provide tutoring in one or more courses. their details can be provided upon request
students => they register to look for tutors in certain courses. details show their appointments and their fees

 */



public class Website {
    //CLASS  fields
    //pointer to the first user
    private User first;

    //default constructor
    public Website(){
        first = null;
    }


    //this method adds a new person who wants to register in the website.
    public boolean addStudent(Student type){

        if(!findDuplicateStudent(type)) {

            User newU = new User(type);
            if (first != null) {
                newU.setNext(first);
            }
            first = newU;

            return true;
        }
        return false;
    }

    //this method adds a new person who wants to register in the website.
    public boolean addTutor(Tutor type){

        if(!findDuplicateTutor(type)) {

            User newU = new User(type);
            if (first != null) {
                newU.setNext(first);
            }
            first = newU;

            return true;
        }
        return false;
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
                if(((curr.getType()).userID).equals(name)){
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

        User curr = first;
        Tutor tutor1;
        Student eligibleStu;
        Course currTutCourse = null;
        int availableHrs=0;

        //start by looking for the student in the website
        eligibleStu = getStudent(stuId);

        if(eligibleStu != null){
            //now look for all the tutors with availabe hrs and specifically teaching the course.
            //store the in a temporary list of tutors
            Tutor eligibleTut = null;
            
            while(curr!=null){
                //start from the first user , look for tutors.
                if(curr.getType() instanceof Tutor){
                     tutor1 = ((Tutor) curr.getType());
                    //if tutor is found then check if he/she has available hours and the course required
                    if((tutor1.getNumHrs()>0) && (tutor1.findCourse(tpc))){
                        //if the tutor has available hours and teaches the required course then assign him/ her as eligible
                        //we will look for all the possible / best options for the student
                         currTutCourse = tutor1.findC(tpc);
                         availableHrs += tutor1.getNumHrs();
                        System.out.println(availableHrs);
                        //if the tutor was first user in the website as a tutor then just assign as eligible
                        if(eligibleTut == null){
                            eligibleTut = tutor1;
                        }else{
                            //here we compare current tutor and the eligible tutor's rates for the course
                            //the one that offers the course with a lower rate will be the best choose.
                            if(currTutCourse.getRate()<eligibleTut.findC(tpc).getRate()){
                                eligibleTut =tutor1;

                            }else if(currTutCourse.getRate()==eligibleTut.findC(tpc).getRate()){
                                //if there exists a tie with the course rates then the tutor with more hours is eligible
                                if(tutor1.getNumHrs()> eligibleTut.getNumHrs() ){
                                    eligibleTut = tutor1;

                                }else if(tutor1.getNumHrs() == eligibleTut.getNumHrs() && (tutor1.getUserID().compareTo(eligibleTut.getUserID()))<0){
                                    //if current tutor and eligible tutor have the same number of hrs then their userIds are compared
                                    //alphabetically the tutor will be chosen
                                    eligibleTut = tutor1;
                                }
                                //if all the scenarios fail, then the request fails
                            }
                        }
                    }
                }
                curr = curr.getNext();
            }

            //this happens if there is no tutor who teachers the course at all.
            if(eligibleTut == null ||  availableHrs < n){

                System.out.println("myb the tutors did not have enough hours to do the tutoring fo rhte couserstrs");
                return false;
            }

            if(currTutCourse != null) {
                if (eligibleTut.getNumHrs() >= n) {
                    setAppointment(eligibleStu, eligibleTut, tpc, n, currTutCourse.getRate());
                } else {
                    int remain = n - eligibleTut.getNumHrs();

                    setAppointment(eligibleStu,eligibleTut,tpc,eligibleTut.getNumHrs(),currTutCourse.getRate());

                    request(stuId, tpc, remain);


                }
            }

        }else{
            System.out.println("Request Failed : Student with userID: "+ stuId + " not found!");
            return false;
        }
        return true;
    }

    public Tutor findEligibleTut (){





        return null;
    }

    public void setAppointment(Student student, Tutor tutor, String course, int hrs, double c){
        Appointment newA1 = new Appointment(student.userID, tutor.getUserID(), course, hrs ,c);
        Appointment newA2 = new Appointment(student.userID, tutor.getUserID(), course, hrs ,c);
        int remain = tutor.getNumHrs()-hrs;
        tutor.setNumHrs(remain);
        student.addAppointment(newA1);
        tutor.addAppointment(newA2);
        student.setTotalCost(c);
        student.setTotalhrs(hrs);
        tutor.setTotalCost(c);
        tutor.setTotalhrs(hrs);

    }

    public boolean findDuplicateStudent(Student type){

        User curr = first;
        while (curr != null){
            if(curr.getType() instanceof Student  ){
                if(curr.getType().getUserID().equals(type.getUserID())){
                    return true;
                }
            }
            curr = curr.getNext();
        }

        return false;
    }
    public boolean findDuplicateTutor(Tutor type){

        User curr = first;
        while (curr != null){
            if(curr.getType() instanceof Tutor  ){
                if((curr.getType().getUserID()).equals(type.getUserID())){
                    return true;
                }
            }
            curr = curr.getNext();
        }

        return false;
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
