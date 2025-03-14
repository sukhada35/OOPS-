import attendance.EmployeeAttendance;

public class AttendanceReport {
    public static void main(String[] args)
    {
        EmployeeAttendance emp = new EmployeeAttendance();
        emp.getAttendanceDetails();
        emp.calculateAttendance();
        emp.displayAttendance();
    }
}
