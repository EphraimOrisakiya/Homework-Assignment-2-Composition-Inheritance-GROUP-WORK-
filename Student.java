public class Student extends Person{ //creating subclass student
    private String stu_id;
    private double gpa;

    public Student(String name, Boolean alive, int age, String SSN, String stu_id, double gpa){
        super(name, alive, age, SSN); //calling the base class constructor
        this.stu_id = stu_id;
        this.gpa = gpa;
    }
    public Student(Student copy){ //ceating the copy constructor
        super(copy);
        if (copy.stu_id.equals("") || copy.gpa <= 0.0 || copy.gpa > 4.0) {
            System.out.println("Invalid");
            System.exit(0);
        }
        this.stu_id = copy.stu_id;
        this.gpa = copy.gpa;
    }

    public Student(){ //no arg constructor

    }
    
    public String getID(){ //creating the get methods
        return this.stu_id;
    }
    public double getGPA(){
        return this.gpa;
    }
    public void setID(String id){ //creating the set methods
        this.stu_id = id;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    public String toString(){ //creating the to string method
        String s = super.toString() + "\nStudent Info: ";
        s += "\nID: " + this.stu_id;
        s += "\nGPA: " + this.gpa;
        return s;
    }
}