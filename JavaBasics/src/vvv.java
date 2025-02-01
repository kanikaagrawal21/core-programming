import java.util.ArrayList;

public class vvv {
    public static void main(String[] args) {
        Student s1 = new Student("kanika", 21, 100);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);

    }
}
    class Student{
        private String name;
        private int rollNumber;
        private int marks;


        Student( String name, int rollNumber,int marks){
            this.name = name;
            this . rollNumber = rollNumber;
            this. marks = marks;

        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public int getMarks() {
            return marks;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }
    }

