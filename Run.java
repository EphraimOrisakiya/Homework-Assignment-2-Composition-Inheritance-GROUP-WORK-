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

        //creating a professor object
        Professor professor1 = new Professor("Dr. Ming", false, 92, "052-75-4312", "113404", 98000, 41, "Sociology", "Cultural Intersection", "Professor", true);
        System.out.println("\nCreating Professor Object - " + professor1.toString());

        CollegeStudent[] students = new CollegeStudent[4]; //creating a list of college students to test
        students[0] = new CollegeStudent("Randal Black", true, 20, "456-12-7623", "023841", 3.7, "Computer Science", "Sophmore");
        students[1] = new CollegeStudent("Walter Blue", true, 17, "912-11-8532", "913132", 3.5, "Electrical Engineering", "Sophmore");
        students[2] = new CollegeStudent("Joshua Blonde", true, 18, "376-44-9655", "773215", 3.9, "Mechanical Engineering", "Sophmore");
        students[3] = new CollegeStudent("Kyle Brown", true, 19, "664-54-0067", "356471", 4.0, "Artificial Intelligence", "Sophmore");

        //creating a course object
        Course course1 = new Course(professor1, students, "Advanced Data Structures & Algorithms");
        System.out.println("\nCreating Course Object - " + course1.toString());

        //creating a list of professors to test
        Professor[] professors = new Professor[3]; //creating a list of professors to test
        professors[0] = new Professor("Dr. Lake", true, 48, "854-01-9436", "324800", 130000, 30, "Data Science", "Economic Forecasting", "Professor", true);
        professors[1] = new Professor("Dr. Sea", true, 64, "439-77-2345", "268923", 110000, 35, "Mathematics", "Linear Algebra", "Associate Professor", false);
        professors[2] = new Professor("Dr. Ocean", true, 39, "054-01-5463", "114504", 200000, 10, "Machine Learning", "Quantum Machine Learning", "Professor", true);

        Professor chair1 = new Professor("Dr. Leo", true, 69, "525-90-0588", "076159", 500000, 40, "Education", "Engineering Administration", "Professor", true);
        
        //creating a list of courses to test
        Course[] courses = new Course[2];
        courses[0] = new Course(professors[0], students, "Statistical Modeling");
        courses[1] = new Course(professors[2], students, "Introduction to Machine Learning");

        //creating a department object
        Department department1 = new Department(chair1, professors, courses);
        System.out.println(department1.toString());

    }
}