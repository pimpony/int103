package InClass_model;

public class Student extends Person {

    private long id;

    public Student(String name, long id) {
        super(name);
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getSignature() {
        // use Signature from parent class follow by -id
        return  super.getSignature() + this.id;
    }


    @Override
    public String toString() {
        return super.toString() + "\nid: " + id;
    }

}
