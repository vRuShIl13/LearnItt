

public class Appointments {
    private Appointment top;

    public Appointments(){
        top = null;
    }

    public void addAppointment(Appointment newAppoint){

        if(top == null){
            newAppoint.setNext(top);
        }
        top = newAppoint;
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "top" + top.toString() +
                '}';
    }
}


