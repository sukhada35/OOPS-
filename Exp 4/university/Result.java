package university;

public class Result extends Student {
    public Result(String name, int roll_no, String course, int marks[]) {
        super(name, roll_no, course, marks);
    }

    public char getGrade() {
        double percentage = getPercentage();
        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else return 'C';
    }
}
