public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "BSIT", 86.3, 87.0, 89);
        Student student2 = new Student("Bob", 19, "BSCS",98, 79, 87);
        Student student3 = new Student("Charlie", 21, "BSIT", 68, 89, 88);

        student1.displayinfo();
        student1.calculateAverage();
        student1.getLetterGrade();
        student1.isPassing();

        student2.displayinfo();
        student2.calculateAverage();
        student2.getLetterGrade();
        student2.isPassing();

        student3.displayinfo();
        student3.calculateAverage();
        student3.getLetterGrade();
        student3.isPassing();

    }
}
