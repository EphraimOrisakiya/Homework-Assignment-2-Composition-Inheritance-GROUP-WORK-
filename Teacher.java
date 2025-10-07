public class Teacher extends Person{ //making subclass teacher
    private String id;
    private int monthly_salary;
    private int numofyearteaching;

    public Teacher(String name, Boolean alive, int age, String SSN, String id, int salary, int yrs){
        super(name, alive, age, SSN); //calling the base class constructor
        this.id = id;
        this.monthly_salary = salary;
        this.numofyearteaching = yrs;
    }
    public Teacher(Teacher copy){
        super(copy);
        if (copy.id.equals("") || copy.monthly_salary <= 0 || copy.numofyearteaching <= 0) {
            System.out.println("Invalid");
            System.exit(0);
        }
        this.id = copy.id;
        this.monthly_salary = copy.monthly_salary;
        this.numofyearteaching = copy.numofyearteaching;
    }

    public Teacher(){ //no arg constructor

    }

    public String getID(){ //creating get methods
        return this.id;
    }
    public int getSalary(){
        return this.monthly_salary;
    }
    public int getYrs(){
        return this.numofyearteaching;
    }

    public void setID(String id){ //creating set methods
        this.id = id;
    }
    public void setSalary(int salary){
        this.monthly_salary = salary;
    }
    public void setYrs(int yrs){
        this.numofyearteaching = yrs;
    }

    public String toString(){
        String s = super.toString() + "\nStudent Info: ";
        s += "\nID: " + this.id;
        s += "\nSalary: " + this.monthly_salary;
        s += "\nNumber of years teaching: " + this.numofyearteaching;
        return s;
    }
}