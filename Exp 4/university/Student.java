package university;
//import java.util.Scanner;
public class Student {
    private String name, course;
    private int roll_no;
    private int marks[];

    public Student(String name, int roll_no, String course, int marks[]) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) total += mark;
        return total;
    }

    public double getPercentage() {
        return getTotalMarks() / (double) marks.length;
    }
}
