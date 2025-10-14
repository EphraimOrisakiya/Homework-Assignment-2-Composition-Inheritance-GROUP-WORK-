//ATTEMPTING EXTRA CREDIT

public class Run {
    
    public static void main(String[] args){
        //creating a person object
        Person person1 = new Person("Bobby Brown", true, 21, "424-41-0067");
        System.out.println("\nCreating Person Object - " + person1.toString());

        //creating a student object
        Student student1 = new Student("James Bool", true, 17, "940-12-9514", "842943", 4.0);
        System.out.println("\nCreating Student Object - " + student1.toString());

        //creating a teacher object
        Teacher teacher1 = new Teacher("Mrs. Brown", true, 36, "863-15-6569", "432365",670000, 14);
        System.out.println("\nCreating Teacher Object - " + teacher1.toString());

        //creating a college student object
        CollegeStudent collegestudent1 = new CollegeStudent("Oluwafemi Falade", true, 19, "234-82-0012", "914501", 3.9, "Data Science", "Junior");
        System.out.println("\nCreating College Student Object - " + collegestudent1.toString());

        //creating a professor objects
        Professor professor1 = new Professor("Dr. Ming", false, 92, "052-75-4312", "113404", 98000, 41, "Sociology", "Cultural Intersection", "Professor", true);
        System.out.println("\nCreating Professor Object - " + professor1.toString());
        Professor professor2 = new Professor("Dr. Jami", true, 30, "673-12-0349", "085808", 115000, 7, "Computer Science", "Artificial Intelligence", "Associate Professor", false);
        System.out.println("\nCreating Professor Object - " + professor2.toString());
        Professor professor3 = new Professor("Dr. Rose", true, 39, "737-02-6887", "887979", 125000, 12, "Mathematics", "Linear Algebra", "Professor", true);
        System.out.println("\nCreating Professor Object - " + professor3.toString());

        CollegeStudent[] students = new CollegeStudent[4]; //creating a list of college students to test
        students[0] = new CollegeStudent("Randal Black", true, 20, "456-12-7623", "023841", 3.7, "Computer Science", "Sophmore");
        students[1] = new CollegeStudent("Walter Blue", true, 17, "912-11-8532", "913132", 3.5, "Electrical Engineering", "Sophmore");
        students[2] = new CollegeStudent("Joshua Blonde", true, 18, "376-44-9655", "773215", 3.9, "Mechanical Engineering", "Sophmore");
        students[3] = new CollegeStudent("Kyle Brown", true, 19, "664-54-0067", "356471", 4.0, "Artificial Intelligence", "Sophmore");

        //creating a course objects
        Course course1 = new Course(professor1, students, "Advanced Data Structures & Algorithms");
        System.out.println("\nCreating Course Object - " + course1.toString());
        Course course2 = new Course(professor2, students, "Introduction to Artificial Intelligence");
        System.out.println("\nCreating Course Object - " + course2.toString());

        //creating a list of professors to test
        Professor[] professors = new Professor[3]; //creating a list of professors to test
        professors[0] = new Professor("Dr. Lake", true, 48, "854-01-9436", "324800", 130000, 30, "Data Science", "Economic Forecasting", "Professor", true);
        professors[1] = new Professor("Dr. Sea", true, 64, "439-77-2345", "268923", 110000, 35, "Mathematics", "Linear Algebra", "Associate Professor", false);
        professors[2] = new Professor("Dr. Ocean", true, 39, "054-01-5463", "114504", 200000, 10, "Machine Learning", "Quantum Machine Learning", "Professor", true);

        Professor chair1 = new Professor("Dr. Leo", true, 69, "525-90-0588", "076159", 500000, 40, "Education", "Engineering Administration", "Professor", true);
        Professor chair2 = new Professor("Dr. Palu", true, 55, "801-12-8656", "978856", 450000, 25, "Business", "Corporate Finance", "Professor", true);
        
        //creating a list of courses to test
        Course[] courses = new Course[2];
        courses[0] = new Course(professors[0], students, "Statistical Modeling");
        courses[1] = new Course(professors[2], students, "Introduction to Machine Learning");

        //creating a department objects
        Department department1 = new Department(chair1, professors, courses);
        System.out.println(department1.toString());
        Department department2 = new Department(chair2, professors, courses);
        System.out.println(department2.toString());

        //TESTING EXTRA CREDIT!!!
        //STUDENTS SHOULD BE ABLE TO GET BUT NOT SET DEPARTMENT AND COURSE INFO
        System.out.println("\nGetting Department chair from student -\n" + student1.getChair(department2)); //Getting chair from student
        student1.setChair(professor3); //trying to set chair from student (doesnt work)
        student1.setFaculty(professors); //trying to set faculty from student (doesnt work)
        student1.setCourses(courses); //trying to set courses from student (doesnt work)
        System.out.println("\nGetting Course name from student -\n" + student1.getCourseName(course2)); //Getting course name from student
        student1.setCourseName("New Course Name"); //trying to set course name from student (doesnt work)
        System.out.println("\nGetting Department faculty from student -\n" + student1.toString(department2));

        //PROFESSORS SHOULD BE ABLE TO GET AND SET DEPARTMENT AND COURSE INFO
        professor1.setChair(professor3, department1); //setting chair from professor
        System.out.println("\nGetting Department chair from professor -\n" + professor1.getChair(department1)); //Getting chair from professor
        professor1.setFaculty(professors, department1); //setting faculty from professor
        System.out.println("\nPrinting Department info from professor -\n" + professor1.toString(department1)); //Printing department info from professor
        professor1.setCourses(courses, department1); //setting courses from professor
        System.out.println("\nPrinting Course info from professor -\n" + professor1.toString(course1)); //Printing course info from professor
        professor1.setProfessor(professor2, course1); //setting professor for course1 from professor
        System.out.println("\nGetting Professor from professor -\n" + professor1.getProfessor(course1)); //Getting professor from professor
        professor1.setCourseName("New Course Name", course1); //setting course name from professor
        System.out.println("\nGetting Course name from professor -\n" + professor1.getCourseName(course1)); //Getting course name from professor

    }
}