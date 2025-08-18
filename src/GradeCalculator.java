public class GradeCalculator {

    public double calculateAverage(double... grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public String getLetterGrade(double average) {
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80 && average <= 89) {
            return "B";
        } else if (average >= 70 && average <= 79){
            return "C";
        } else if(average >= 60 && average <= 69){
            return "D";
        } else if(average > 60){
            return "F";
        } else{
            return "Invalid";
        }

    }

    public void displayResult(String studentName, double average) {
        System.out.printf("Student: %s,  Average: %.2f%n", studentName, average);
    }
    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.printf("Student: %s,  Average: %.2f,  Grade: %s%n", studentName, average, letterGrade);
    }

}

