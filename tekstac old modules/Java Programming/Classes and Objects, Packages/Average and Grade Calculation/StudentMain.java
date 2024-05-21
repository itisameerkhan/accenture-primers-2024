class Student {
    private int id;
    private String name;
    private int marks[];
    private float average;
    private char grade;

    Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int[] getMarks() {
        return this.marks;
    }
    public float calculateAvg() {
        float average = 0.0f;
        for(int i=0;i<marks.length;i++) {
            average += marks[i];
        }
        return average / marks.length;
    }
    public char findGrade() {
        int minimumGrade = marks[0];
        for(int i=0;i<marks.length;i++) {
            minimumGrade = marks[i] < minimumGrade ? marks[i] : minimumGrade;
        }
        this.grade = minimumGrade < 50 ? 'F' : (minimumGrade >= 80 && minimumGrade <= 100 ? 'O' : 'A');
        return this.grade;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", new int[]{100, 99, 98, 97, 95});
        System.out.println("Average: "+ s1.calculateAvg());
        System.out.println("Grade: " + s1.findGrade());
    }
}
