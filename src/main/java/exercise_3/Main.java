package exercise_3;

public class Main {
    static void main() {
        //Creating student objects
        Student student1= new Student("S01","Muthana", 25, "Computer");
        Student student2= new Student("S02","Ragavi", 24, "IT");
        Student student3= new Student("S03","Shanmuga", 24, "Physics");
        Student student4= new Student("S04","Sikdar", 24, "Mathematics");


        student1.setMajor("Chemistry"); //Updating data safely

        // Displaying unique data for each object
        System.out.println(student1.getStudentInfo());
        System.out.println(student2.getStudentInfo());
        System.out.println(student3.getStudentInfo());
        System.out.println(student4.getStudentInfo());
    }
}
