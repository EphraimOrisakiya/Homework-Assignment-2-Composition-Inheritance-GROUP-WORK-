//ATTEMPTING EXTRA CREDIT

public class Professor extends Teacher{
  // Instance Variables
  private String specialty;
  private String researchArea;
  private String rank;
  private boolean tenured;

  //EXTRA CREDIT
  public Professor getChair(Department department){ //EXTRA CREDIT
      return department.getChair(); //ALLOWING PROFESSOR TO GET CHAIR OF DEPARTMENT
  }
  public void setChair(Professor chair, Department department){ //EXTRA CREDIT
    department.setChair(chair); //ALLOWING PROFESSOR TO SET CHAIR OF DEPARTMENT
  }
  public Professor[] getFaculty(Department department){ //EXTRA CREDIT
      return department.getFaculty(); //ALLOWING PROFESSOR TO GET FACULTY OF DEPARTMENT
  }
  public void setFaculty(Professor[] faculty, Department department){ //EXTRA CREDIT
    department.setFaculty(faculty); //ALLOWING PROFESSOR TO SET FACULTY OF DEPARTMENT
  }
  public Course[] getCourses(Department department){ //EXTRA CREDIT
      return department.getCourses(); //ALLOWING PROFESSOR TO GET COURSES OF DEPARTMENT
  }
  public void setCourses(Course[] courses, Department department){ //EXTRA CREDIT
    department.setCourses(courses); //ALLOWING PROFESSOR TO SET COURSES OF DEPARTMENT
  }
  public Professor getProfessor(Course course){ //EXTRA CREDIT
      return course.getProfessor(); //ALLOWING PROFESSOR TO GET PROFESSOR OF COURSE
  }
  public void setProfessor(Professor professor, Course course){ //EXTRA CREDIT
    course.setProfessor(professor); //ALLOWING PROFESSOR TO SET PROFESSOR OF COURSE
  }
  public CollegeStudent[] getStudents(Course course){ //EXTRA CREDIT
      return course.getStudents(); //ALLOWING PROFESSOR TO GET STUDENTS OF COURSE
  }
  public void setStudents(CollegeStudent[] students, Course course){ //EXTRA CREDIT
    course.setStudents(students); //ALLOWING PROFESSOR TO SET STUDENTS OF COURSE
  }
  public String getCourseName(Course course){ //EXTRA CREDIT
      return course.getCourseName(); //ALLOWING PROFESSOR TO GET COURSENAME OF COURSE
  }
  public void setCourseName(String courseName, Course course){ //EXTRA CREDIT
    course.setCourseName(courseName); //ALLOWING PROFESSOR TO SET COURSENAME OF COURSE
  }
  public String toString(Department department){ //EXTRA CREDIT
      String s = department.toString(); //ALLOWING PROFESSOR TO PRINT DEPARTMENT INFO
      return s;
  }
  public String toString(Course course){ //EXTRA CREDIT
      String s = course.toString(); //ALLOWING PROFESSOR TO PRINT COURSE INFO
      return s;
  }
  //EXTRA CREDIT ^^^

  // Constructors
  //Fully loaded constructor
  public Professor(String name, Boolean alive, int age, String SSN, String id, int salary, int yrs, String specialty, String researchArea, String rank, boolean tenured){
    super(name, alive, age, SSN, id, salary, yrs);
    if (!isValidDerived(specialty, researchArea, rank, tenured)){
      System.out.println("Error: Invalid Professor object");
      System.exit(0);
    }
    this.specialty = specialty;
    this.researchArea = researchArea;
    this.rank = rank;
    this.tenured = tenured;
  }
  //Default constructor
  public Professor(){}

  //copy constructor
  public Professor(Professor p){
    super(p);
    if (p == null || p.specialty == null || p.researchArea == null || p.rank == null || p.specialty.equals("") || p.researchArea.equals("") || p.rank.equals("")){
      System.out.println("Error: Invalid Professor object");
      System.exit(0);
    }
    this.specialty = p.specialty;
    this.researchArea = p.researchArea;
    this.rank = p.rank;
    this.tenured = p.tenured;
  }

  // Class invariant
  public boolean isValidDerived(String specialty, String researchArea, String rank, boolean tenured){
    return specialty != null && researchArea != null && rank != null && !specialty.equals("") && !researchArea.equals("") && !rank.equals("");
  }

  // Getters and Setters
  public String getSpecialty(){
    return this.specialty;
  }
  public void setSpecialty(String specialty){
    this.specialty = specialty;
  }
  public String getResearchArea(){
    return this.researchArea;
  }
  public void setResearchArea(String researchArea){
    this.researchArea = researchArea;
  }
  public String getRank(){
    return this.rank;
  }
  public void setRank(String rank){
    this.rank = rank;
  }
  public boolean getTenured(){
    return this.tenured;
  }
  public void setTenured(boolean tenured){
    this.tenured = tenured;
  }

  // toString method
  public String toString(){
    return super.toString() + "\nSpecialty: " + this.specialty + "\nResearch Area: " + this.researchArea + "\nRank: " + this.rank + "\nTenured: " + this.tenured;
  }
  
}