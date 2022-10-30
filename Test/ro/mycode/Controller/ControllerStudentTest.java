package ro.mycode.Controller;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ControllerStudentTest {

    @Test
    void acelasiNume() {

        Scanner scanner = new Scanner(System.in);

        ControllerStudent controllerStudent = new ControllerStudent("new");
        Student student = new Student(201,"Petre","Amariei","amariei.petre@yahoo.com",20,"10amariei10",1);
        Student student1 = new Student(202,"Petr","Aiei","amariei.petre@yahoo.com",20,"10amariei10",2);
        Student student2 = new Student(203,"Pet","Nicolau","amariei.petre@yahoo.com",20,"10amariei10",3);
        Student student3 = new Student(204,"Pe","Nicolau","amariei.petre@yahoo.com",20,"10amariei10",4);
        Student student4 = new Student(205,"P","Pascu","amariei.petre@yahoo.com",20,"10amariei10",5);
        Student student5 = new Student(206,"Petreeee","Plop","amariei.petre@yahoo.com",20,"10amariei10",6);
        Student student6 = new Student(207,"Petrrrre","Plop","amariei.petre@yahoo.com",20,"10amariei10",7);
        Student student7 = new Student(208,"Pettttre","Plop","amariei.petre@yahoo.com",20,"10amariei10",8);
        controllerStudent.addStudent(student);
        controllerStudent.addStudent(student1);
        controllerStudent.addStudent(student2);
        controllerStudent.addStudent(student3);
        controllerStudent.addStudent(student4);
        controllerStudent.addStudent(student5);
        controllerStudent.addStudent(student6);
        controllerStudent.addStudent(student7);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
//
//        int [] elevi = new int[students.size()];
//        int poz = 0;
//        for (int i = 0; i < students.size(); i++) {
//            elevi[poz] = Collections.frequency(students, students.get(i));
//            poz++;
//        }
//
//        for (int i = 0; i < elevi.length; i++){
//            System.out.println(elevi[i]);
//        }
        String num = "Petr Amariei";
        String [] nume = num.split(" ");

        controllerStudent.schimbareLoc(nume,student3);


        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}