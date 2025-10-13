//ATTEMPTING EXTRA CREDIT

public class Person{ //Here im making the person class
    private String name; //adding the class attributes
    private Boolean alive;
    private int age;
    private String SSN;
    private Department department; //EXTRA CREDIT
    private Course course; //EXTRA CREDIT

    public Department getDepartment(){  //EXTRA CREDIT - MAKING GET DEPARTMENT METHOD ACCESIBLE TO ALL CLASSES
        return new Department(this.department);
    }
    public Course getCourse(){ //EXTRA CREDIT - MAKING GET COURSE METHOD ACCESIBLE TO ALL CLASSES
        return new Course(this.course);
    }
    protected void setDepartment(Department department){ //EXTRA CREDIT
        this.department = new Department(department);
    }
    protected void setCourse(Course course){ //EXTRA CREDIT
        this.course = new Course(course);
    }

    public Person(String name, Boolean alive, int age, String ssn){ //making the fully loaded constructor
        this.name = name;
        this.alive = alive;
        this.age = age;
        this.SSN = ssn;
    }

    public Person(Person copy){ //making copy constructor and adding an error check
        if (copy == null || copy.name.equals("") || copy.alive == null || copy.age <= 0 || copy.SSN.equals("")) {
            System.out.println("Invalid");
            System.exit(0);
        }
        this.name = copy.name;
        this.alive = copy.alive;
        this.age = copy.age;
        this.SSN = copy.SSN;
    }

    public Person(){ //NO ARG CONSTRUCTOR

    }

    public String getName(){ //making the get methods
        return this.name;
    }
    public Boolean getAlive(){
        return this.alive;
    }
    public int getAge(){
        return this.age;
    }
    public String getSSN(){
        return this.SSN;
    }

    public void setName(String name){ //making the set methods
        this.name = name;
    }
    public void setAlive(Boolean alive){
        this.alive = alive;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSSN(String ssn){
        this.SSN = ssn;
    }

    public String toString(){//making the to string method
        String s = "\nPerson:";
        s += "\nName: " + this.name;
        s += "\nAge: " + this.age;
        s += "\nSSN: " + this.SSN;
        s += "\nAlive: " + this.alive;
        return s;
    }
}