
//2.	Develop an Employee Attendance Management System using Java packages. 
//Create a package attendance and define a class EmployeeAttendance in EmployeeAttendance.java. 
//Declare variables such as name, empID, totalWorkingDays, daysPresent, daysAbsent, and attendancePercentage. 
//Implement methods to calculate attendance percentage and display attendance records. 
//In another file AttendanceReport.java, create an object, input attendance details, compute the percentage, and print the attendance summary.

package attendance;

import java.util.Scanner;

public class EmployeeAttendance {
    private String name;
    private int empID, totalWorkingDays, daysPresent, daysAbsent;
    private double attendancePercentage;

    public void getAttendanceDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        empID = sc.nextInt();

        System.out.print("Enter Total Working Days: ");
        totalWorkingDays = sc.nextInt();

        System.out.print("Enter Days Present: ");
        daysPresent = sc.nextInt();

        daysAbsent = totalWorkingDays - daysPresent;
        sc.close();
    }

    public void calculateAttendance() {
        attendancePercentage = (double) daysPresent / totalWorkingDays * 100;
    }

    public void displayAttendance() {
        System.out.println("\n🔹 Employee Attendance Report 🔹");
        System.out.println("Name: " + name);
        System.out.println("Attendance: " + attendancePercentage + "%");
    }
}

