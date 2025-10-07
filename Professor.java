public class Professor extends Teacher{
  // Instance Variables
  private String specialty;
  private String researchArea;
  private String rank;
  private boolean tenured;

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