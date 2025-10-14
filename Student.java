//ATTEMPTING EXTRA CREDIT

public class Student extends Person{ //creating subclass student
    private String stu_id;
    private double gpa;

    //EXTRA CREDIT 
    public Professor getChair(Department department){ //EXTRA CREDIT
        return department.getChair(); //ALLOWING STUDENT TO GET CHAIR OF DEPARTMENT
    }
    public void setChair(Professor chair){ //EXTRA CREDIT
        System.out.println("\nStudents cannot set chair\n"); //RESTRICTING STUDENTS FROM SETTING CHAIR
    }
    public Professor[] getFaculty(Department department){ //EXTRA CREDIT
        return department.getFaculty(); //ALLOWING STUDENT TO GET FACULTY OF DEPARTMENT
    }
    public void setFaculty(Professor[] faculty){ //EXTRA CREDIT
        System.out.println("\nStudents cannot set Faculty\n"); //RESTRICTING STUDENTS FROM SETTING FACULTY
    }
    public Course[] getCourses(Department department){ //EXTRA CREDIT
        return department.getCourses(); //ALLOWING STUDENT TO GET COURSES OF DEPARTMENT
    }
    public void setCourses(Course[] courses){ //EXTRA CREDIT
        System.out.println("\nStudents cannot set courses\n"); //RESTRICTING STUDENTS FROM SETTING COURSES
    }
    public Professor getProfessor(Course course){ //EXTRA CREDIT
        return course.getProfessor(); //ALLOWING STUDENT TO GET PROFESSOR OF COURSE
    }
    public void setProfessor(Professor professor){ //EXTRA CREDIT
        System.out.println("\nStudents cannot set Professor\n"); //RESTRICTING STUDENTS FROM SETTING PROFESSOR
    }
    public CollegeStudent[] getStudents(Course course){ //EXTRA CREDIT
        return course.getStudents(); //ALLOWING STUDENT TO GET STUDENTS OF COURSE
    }
    public void setStudents(CollegeStudent[] students){ //EXTRA CREDIT
        System.out.println("\nStudents cannot set Students\n"); //RESTRICTING STUDENTS FROM SETTING STUDENTS
    }
    public String getCourseName(Course course){ //EXTRA CREDIT
        return course.getCourseName(); //ALLOWING STUDENT TO GET COURSENAME OF COURSE
    }
    public void setCourseName(String courseName){ //EXTRA CREDIT
        System.out.println("\nStudents cannot set Course Name\n"); //RESTRICTING STUDENTS FROM SETTING COURSENAME
    }
    public String toString(Department department){ //EXTRA CREDIT
        String s = department.toString(); //ALLOWING STUDENT TO PRINT DEPARTMENT INFO
        return s;
    }
    public String toString(Course course){ //EXTRA CREDIT
        String s = course.toString(); //ALLOWING STUDENT TO PRINT COURSE INFO
        return s;
    }
    //EXTRA CREDIT ^^^

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