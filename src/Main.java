import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Details");
        System.out.print("Student ID: ");
        String studentId = input.nextLine();

        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Course: ");
        String course = input.nextLine();

        System.out.print("Section: ");
        String section = input.nextLine();

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name     : " + firstName + " " + lastName);
        System.out.println("Course   : " + course);
        System.out.println("Section  : " + section);

        // Input scores
        System.out.print("Midterm Exam Score: ");
        int midterm = input.nextInt();

        System.out.print("Final Exam Score: ");
        int finalExam = input.nextInt();

        System.out.print("Project Score: ");
        int project = input.nextInt();

        System.out.print("Attendance Percentage : ");
        int attendance = input.nextInt();

        int totalScore = midterm + finalExam + project + attendance;
        double averageScore = (totalScore / 400.0) * 100;

        System.out.println("STUDENT SCORES");
        System.out.println("Midterm Exam   : " + midterm);
        System.out.println("Final Exam     : " + finalExam);
        System.out.println("Project        : " + project);
        System.out.println("Attendance     : " + attendance);
        System.out.printf("Average Score  :" +  averageScore);


        System.out.print("Remarks: ");

        if (averageScore < 75) {
            System.out.println("FAILED");
        } else {
            System.out.println("PASSED");
        }

        input.close();
    }
}
