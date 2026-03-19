package exercise_3;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private String major;

    // Constructor
    public Student(String studentId, String name, int age, String major) {
        this.studentId = studentId;
        setName(name);
        setAge(age);
        setMajor(major);
    }

    // Getters and Setters with validation
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Please enter a valid age.");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major == null || major.isEmpty()){
            throw new IllegalArgumentException("Not declared");
        }else {
            this.major = major;
        };
    }

    public String getStudentInfo() {
        return "ID: " + studentId + " | Name: " + name + " | Age: " + age + " | Major: " + major;
    }
}
