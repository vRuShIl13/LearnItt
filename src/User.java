

public class User {
    private Person type;
    private User next;

    //default constructor
    public User(){
        type = null;
        next = null;
    }

    //2nd constructor
    public User(Person p){
        type = p;
        next = null;
    }


    //getters and setters
    public Person getType() {
        return type;
    }
    public User getNext() {
        return next;
    }
    public void setNext(User next) {
        this.next = next;
    }
    public void setType(Person type) {
        this.type = type;
    }

    public String toString() {
        return "User " + "type=" + type.userID ;
    }
}

