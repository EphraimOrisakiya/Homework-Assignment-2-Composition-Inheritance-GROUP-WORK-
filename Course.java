//Implementing the Course class. Extra credit portion within this class. 

public class Course{
  // Instance Variables
  private Professor professor;
  private CollegeStudent[] students;
  private String courseName;

  // Constructors
  //Fully loaded constructor
  public Course(Professor professor, CollegeStudent[] students, String courseName){
    if (!isValid(professor, students, courseName)){
      System.out.println("Error: Invalid Course object");
      System.exit(0);
    }
    this.professor = new Professor(professor);
    this.students = new CollegeStudent[students.length];
    for (int i = 0; i < students.length; i++){
      this.students[i] = new CollegeStudent(students[i]);
    }
    this.courseName = courseName;
  }
  //Default constructor
  public Course(){}

  //copy constructor
  public Course(Course c){
    if (c == null || c.professor == null || c.students == null || c.courseName == null || c.courseName.equals("")){
      System.out.println("Error: Invalid Course object");
      System.exit(0);
    }
    this.professor = new Professor(c.professor);
    this.students = new CollegeStudent[c.students.length];
    for (int i = 0; i < c.students.length; i++){
      this.students[i] = new CollegeStudent(c.students[i]);
    }
    this.courseName = c.courseName;
  }

  // Class invariant
  public boolean isValid(Professor professor, CollegeStudent[] students, String courseName){
    return professor != null && students != null && courseName != null && !courseName.equals("") && students.length > 3;
  }

  // Getters and Setters
  public Professor getProfessor(){
    return this.professor;
  }
  protected void setProfessor(Professor professor){
    this.professor = professor;
  }
  public CollegeStudent[] getStudents(){
    
    CollegeStudent[] temp = new CollegeStudent[this.students.length];
    for (int i = 0; i < this.students.length; i++){
      temp[i] = new CollegeStudent(this.students[i]);
    }
    return temp;
  }
  protected void setStudents(CollegeStudent[] students){
    this.students = new CollegeStudent[students.length];
    for (int i = 0; i < students.length; i++){
      this.students[i] = new CollegeStudent(students[i]);
    }
  }
  public String getCourseName(){
    return this.courseName;
  }
  protected void setCourseName(String courseName){
    this.courseName = courseName;
  }
  // toString method
  public String toString(){
    String s = "";
    s = "";
    s += "\nCourse Name: " + this.courseName + "\n";
    s += this.professor.toString() + "\n";
    s += "Students: \n";
    for (int i = 0; i < this.students.length; i++){
      s += this.students[i].toString() + "\n";
    }
    return s;
    
  }
}