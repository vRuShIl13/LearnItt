

public class Appointments {
    private Appointment top;

    public Appointments(){
        top = null;
    }

    public void addAppointment(Appointment newAppoint){

        if(top == null){
            newAppoint.setNext(null);
        }

        newAppoint.setNext(top);
        top = newAppoint;
    }

    public Appointment getAps(){
        Appointment curr = top;

        return curr;
    }


    public String toString() {
        Appointment curr = top;
        String appointments = "Report:"+ "\n"+ "------------------------"+"\n";
        int count = 1;

        if (curr != null) {
            while (curr != null) {

                appointments += "Appointment " + count + " " + curr  + "\n";
                count++;
                curr = curr.getNext();
            }
        }
        return appointments;
    }
}


