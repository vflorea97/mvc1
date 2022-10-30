package ro.mycode.Controller;

import ro.mycode.Model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class ControllerStudent {

    private ArrayList<Student> students;

    public ControllerStudent (String text){
        students = new ArrayList<>();
    }

    public ControllerStudent (){
        students = new ArrayList<>();
        this.load();
    }

    public void load (){
        try{
            File file = new File("D:\\mycode\\abstractizare\\MVC1\\src\\ro\\mycode\\Data\\Student.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String text = scanner.nextLine();
                Student student = new Student(text);
                this.students.add(student);
            }
            scanner.close();

        }catch (Exception e){

        }
    }
    public void save (){
        try{
            File file = new File("D:\\mycode\\abstractizare\\MVC1\\src\\ro\\mycode\\Data\\Student.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.print(this.toSave());
            printWriter.close();
        }catch (Exception e){

        }
    }
    public String toSave (){
        String text = "";
        int i = 0;
        for (i = 0; i < students.size() - 1; i++){
            text += this.students.get(i).toSave() + "\n";
        }
        text += this.students.get(i).toSave() + "\n";
        return text;
    }

    public void afisare (){
        for (int i = 0; i < students.size(); i++){
            students.get(i).afisare();
        }
    }

    public void ordineAlfabetica(){
        Collections.sort(students);
        afisare();
    }
    public int numarCatalog(String name){
        Collections.sort(students);
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getLastName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public int [] acelasiNume (){
        int [] eleviA = new int[students.size()];
        int poz = 0;
        for (int i = 0; i < students.size(); i++) {
            eleviA[poz] = Collections.frequency(students, students.get(i));
            poz++;
        }
        return eleviA;
    }
    public ArrayList<Student> getLastName(){
        return this.students;
    }
    public String [] lastName (ArrayList<Student> students){
        String [] students1 = new String[students.size()];
        String gasit = "";
        for (int i = 0; i < students.size(); i++){
            for (int i1 = i + 1; i1 < students.size(); i1++) {
                if (students.get(i).getLastName().equals(students.get(i1).getLastName())) {
                    students1[i1] = gasit;
                }
                if (students1[i] != (gasit)){
                    students1[i] = students.get(i).getLastName();
                }
            }
        }
        return students1;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void ordineAlfabeticaInversa () {
        Collections.sort(students);
        Collections.reverse(students);
        afisare();
    }
    public void schimbareLoc(String [] nume, Student student){
        int s = student.getLoc();
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getFirstName().equals(nume[0]) && students.get(i).getLastName().equals(nume[1])){
                int s2 = student.getLoc();
                int s3 = students.get(i).getLoc();
                int z = s3;
                System.out.println(z);
//                students.get(i).setLoc(s2);
//                System.out.println(students.get(i).getLoc());
//                Collections.swap(students,student.getLoc() - 1,i);
//                System.out.println(student.toString());
//                students.get(6).setLoc(7);
//
//                System.out.println(s2);
//                System.out.println(s3);







            }
        }
    }
}
