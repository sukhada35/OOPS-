package portal;

import university.Student;

public class StudentPortal {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 76};
        Student student = new Student("Sukhada", 101, "CS", marks);

        // Can't access private data directly (Encapsulation)
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Percentage: " + student.getPercentage());
    }
}
