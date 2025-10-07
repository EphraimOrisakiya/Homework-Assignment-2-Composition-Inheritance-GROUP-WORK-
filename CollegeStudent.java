public class CollegeStudent extends Student{
  // Instance Variables
  private String major;
  private String grade;

  // Constructors
  //Fully loaded constructor
  public CollegeStudent(String name, boolean alive, int age, String SSN, String studentID, double gpa, String major, String grade){
    super(name, alive, age, SSN, studentID, gpa);
    if (!isValidDerived(major, grade)){
      System.out.println("Error: Invalid CollegeStudent object");
      System.exit(0);
    }
    this.major = major;
    this.grade = grade;
  }
  //Default constructor
  public CollegeStudent(){}

  //copy constructor
  public CollegeStudent(CollegeStudent cs){
    super(cs);
    if (cs == null || cs.major == null || cs.grade == null || cs.major.equals("") || cs.grade.equals("")){
      System.out.println("Error: Invalid CollegeStudent object");
      System.exit(0);

    }
    this.major = cs.major;
    this.grade = cs.grade;
  }

  // Class invariant
  public boolean isValidDerived(String major, String grade){
    return major != null && grade != null && !major.equals("") && !grade.equals("");
  }

  
  // Getters and Setters
  public String getMajor(){
    return this.major;
  }
  public void setMajor(String major){
    this.major = major;
  }
  public String getGrade(){
    return this.grade;
  }
  public void setGrade(String grade){
    this.grade = grade;
  }

  // toString method
  public String toString(){
    return super.toString() + "\nMajor: " + this.major + "\nGrade: " + this.grade;
  }
  
  

}