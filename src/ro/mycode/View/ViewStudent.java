package ro.mycode.View;

import ro.mycode.Controller.ControllerStudent;
import ro.mycode.Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewStudent {

    private Student student;
    private ControllerStudent controllerStudent;
    private Scanner scanner;

    public ViewStudent(Student student){
        this.student = student;
        this.controllerStudent = new ControllerStudent();
        this.scanner = new Scanner(System.in);
    }

    public void menu (){
        System.out.println("Bune ai venit " + this.student.getFirstName() + " " + this.student.getLastName() + " !!");
        System.out.println("Apasa 1 pentru a lista studentii");
        System.out.println("Apasa 2 pentru a lista studentii in ordine alfabetica");
        System.out.println("Apasa 3 pentru a afisa ce numar este un student la catalog");
        System.out.println("Apasa 4 pentru a verifica daca sunt elevi cu acelasi nume in clasa");
        System.out.println("Apasa 5 pentru a afisa catalogul de la sfarsit spre inceput");
        System.out.println("Apasa 6 pentru a schimba locul cu un alt coleg");



    }

    public void start (){
        boolean run = true;
        menu();
        while (run){
            int buton = Integer.parseInt(scanner.nextLine());
            switch (buton){
                case 1:
                    controllerStudent.afisare();
                    break;
                case 2:
                    controllerStudent.ordineAlfabetica();
                    break;
                case 3:
                    numarCatalog();
                    break;
                case 4:
                    acelasiNume();
                    break;
                case 5:
                    controllerStudent.ordineAlfabeticaInversa();
                    break;
                case 6:
                    locInBanca();
                    break;


            }
        }
    }

    public  void numarCatalog (){
        System.out.println("Introdu numele de familie al elevului:");
        String nume = scanner.nextLine();
        int i = 1 + controllerStudent.numarCatalog(nume);
        System.out.println("Elevul " + nume + " este numarul " + i + " la catalog");
    }
    public void acelasiNume(){
        ArrayList<Student> stud = controllerStudent.getLastName();
        String [] nume = controllerStudent.lastName(stud);
        int [] elevi = controllerStudent.acelasiNume();
        System.out.println("La catalog sunt: ");
        for (int i = 0; i < elevi.length; i++) {
            if (nume[i] != "") {
                System.out.println(elevi[i] + " elevi cu numele de familie " + nume[i]);
            }
        }
    }
    public void locInBanca (){
        System.out.println("Introdu numele si prenumele colegului:");
        String nume = scanner.nextLine();
        String [] numeSp = nume.split(" ");
        controllerStudent.schimbareLoc(numeSp,student);




    }
}
