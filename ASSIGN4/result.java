package ASSIGN4;
import java.util .*;

    class Student {
        int rollno;

        void setRollNo() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll Number: ");
            rollno = sc.nextInt();
        }

        void getRollNo() {
            System.out.println("Roll Number: " + rollno);
        }
    }

    class Test extends Student {
        int sub1, sub2;

        void setMarks() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks for Subject 1: ");
            sub1 = sc.nextInt();
            System.out.print("Enter marks for Subject 2: ");
            sub2 = sc.nextInt();
        }

        void getMarks() {
            System.out.println("Subject 1 Marks: " + sub1);
            System.out.println("Subject 2 Marks: " + sub2);
        }
    }

    interface Sports {
        void setSportsMarks();
    }

    class Result extends Test implements Sports {
        int sportsMarks;

        public void setSportsMarks() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Sports Marks: ");
            sportsMarks = sc.nextInt();
        }

        void displayResult() {
            System.out.println("\n--- Student Exam Results ---");
            getRollNo();
            getMarks();
            System.out.println("Sports Marks: " + sportsMarks);
            int total = sub1 + sub2 + sportsMarks;
            System.out.println("Total Marks: " + total);
        }
    }

    class Testapp {
        public static void main(String[] args) {
            Result student = new Result();
            student.setRollNo();
            student.setMarks();
            student.setSportsMarks();
            student.displayResult();
        }
    }

    /*
output:
Enter Roll Number: 49
Enter marks for Subject 1: 55
Enter marks for Subject 2: 66
Enter Sports Marks: 20

--- Student Exam Results ---
Roll Number: 49
Subject 1 Marks: 55
Subject 2 Marks: 66
Sports Marks: 20
Total Marks: 141

     */

