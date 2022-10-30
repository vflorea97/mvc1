package ro.mycode;

import ro.mycode.Controller.ControllerStudent;
import ro.mycode.Model.Student;
import ro.mycode.View.ViewStudent;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ControllerStudent controllerStudent = new ControllerStudent();
        ArrayList<Student> students = controllerStudent.getLastName();

        ViewStudent viewStudent = new ViewStudent(students.get(1));
        viewStudent.start();

    }
}
