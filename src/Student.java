public class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;
    boolean isPassing;
    double average;



    public Student(String nameStudent, int studentAge, String studentCourse, double Gradeone, double Gradetwo, double Gradethree){
            name = nameStudent;
            age = studentAge;
            course = studentCourse;
            isPassing = true;
            grade1 = Gradeone;
            grade2 = Gradetwo;
            grade3 = Gradethree;


        }


    public void calculateAverage(){
      average = (grade1 + grade2 + grade3) / 3.0;
      System.out.println("Average: " + average);
    }


    public void getLetterGrade() {

        if (average <= 90 || average <= 100) {
            System.out.println("Letter Grade: A");
            isPassing = true;

        } else if (average <= 80 || average <= 89) {
            System.out.println("Letter Grade: B");
            isPassing = true;


        } else if (average <= 70 || average <= 79) {
            System.out.println("Letter Grade: C");
            isPassing = true;


        } else if (average <= 60 || average <= 69) {
            System.out.println("Letter Grade: D");
            isPassing = false;

        } else {
            System.out.println("Letter Grade: F");
            isPassing = false;

        }
    }
        public void isPassing(){

            if (isPassing){
                System.out.println("STATUS : PASSING");
            }else {
                System.out.println("STATUS : FAILING");
            }

        }

        public void displayinfo(){

            System.out.println("Name: " + name + "," + "Age: " + age + "," + "Course: "+ course);
            System.out.println("Grades: " + grade1 + "," + grade2 + "," + grade3);


        }

}
