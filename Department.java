public class Department{ //creating clas department
    private Professor chair; //making the class attributes
    private Professor[] faculty;
    private Course[] courses;

    public Department(){} //no arg constructor

    public Department(Professor chair, Professor[] faculty, Course[] courses){ //fully loaded constructor
        this.chair = new Professor(chair); //setting the chair to a new object to preserve security
        this.faculty = new Professor[faculty.length]; //setting the faculty to a new list to preserve security
        for (int i = 0; i < faculty.length; i++){
            this.faculty[i] = new Professor(faculty[i]);
        }
        this.courses = new Course[courses.length]; //setting the courses to a new list to preserve security
        for (int i = 0; i < courses.length; i++){
            this.courses[i] = new Course(courses[i]);
        }
    }

    public Department(Department copy){ //copy constructor
        if (copy == null || copy.faculty == null || copy.courses == null){ //error check
            System.out.println("Invalid Department Object");
            System.exit(0);
        }
        this.chair = new Professor(copy.chair);
        this.faculty = new Professor[copy.faculty.length];
        for (int i = 0; i < copy.faculty.length; i++){
            this.faculty[i] = new Professor(copy.faculty[i]);
        }
        this.courses = new Course[copy.courses.length];
        for (int i = 0; i < copy.courses.length; i++){
            this.courses[i] = new Course(copy.courses[i]);
        }
    }

    public Professor getChair(){ //creating getmethods
        return new Professor(this.chair);
    }
    public Professor[] getFaculty(){//created a new list and added the values from the original list
        Professor[] temp = new Professor[this.faculty.length];
        for (int i = 0; i < this.faculty.length; i++){
            temp[i] = new Professor(this.faculty[i]);
        }
        return temp;
    }
    public Course[] getCourses(){
        Course[] temp = new Course[this.courses.length];
        for (int i = 0; i < this.courses.length; i++){
            temp[i] = new Course(this.courses[i]);
        }
        return temp;
    }

    public void setChair(Professor chair){ //creating setmethods
        this.chair = new Professor(chair);
    }
    public void setFaculty(Professor[] faculty){
        this.faculty = new Professor[faculty.length];
        for (int i = 0; i < faculty.length; i++){
            this.faculty[i] = new Professor(faculty[i]);
        }
    }
    public void setCourses(Course[] courses){
        this.courses = new Course[courses.length];
        for (int i = 0; i < courses.length; i++){
            this.courses[i] = new Course(courses[i]);
        }
    }

    public String toString(){
        String s = "\nDepartment Info: ";
        s += "\nChair: " + this.chair.toString();
        s += "\nFaculty: " + this.faculty.toString();
        s += "\nCourses: " + this.courses.toString();
        return s;
    }
    
}