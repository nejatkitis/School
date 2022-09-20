package School;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Teacher t1 = new Teacher("Cansu","Kimya");
        Teacher t2 = new Teacher("Şadi","Matematik");
        Teacher t3 = new Teacher("Melike","Fizik");

        Course c1 = new Course(t1,101);
        Course c2 = new Course(t2,102);
        Course c3 = new Course(t3,103);

        Student s1 = new Student(1990);
        System.out.print("Öğrenci sınıfı : ");
        int cno = input.nextInt();
        s1.Note(cno);

    }
}
