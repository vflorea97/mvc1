package ro.mycode.Model;

public class Student implements Comparable<Student>{

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String parola;
    private int loc;

    public Student (){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.age = 0;
        this.parola = "";
        this.loc = 0;
    }

    public Student (int id,String firstName,String lastName,String email,int age,String parola,int loc){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.parola = parola;
        this.loc = loc;
    }

    public Student (String text){
        String [] proprietati = text.split(",");
        this.id = Integer.parseInt(proprietati[0]);
        this.firstName = proprietati[1];
        this.lastName = proprietati[2];
        this.email = proprietati[3];
        this.age = Integer.parseInt(proprietati[4]);
        this.parola = proprietati[5];
        this.loc = Integer.parseInt(proprietati[6]);
    }

    @Override
    public String toString (){
        String text = "";
        text += "ID: " + this.id + "\n";
        text += "First name: " + this.firstName + "\n";
        text += "Last name: " + this.lastName + "\n";
        text += "Email: " + this.email + "\n";
        text += "Age: " + this.age + "\n";
        text += "Loc: " + this.loc + "\n";
        return text;
    }

    public void afisare() {
        System.out.println(this);
    }

    public String toSave (){
        return this.id+","+this.firstName+","+this.lastName+","+this.email+","+this.age+","+this.parola+","+this.loc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getLoc() {
        return loc;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object s){
        Student student = (Student)s;
        return student.lastName.equals(lastName);
    }

    @Override
    public int compareTo(Student o) {
        if (this.getLastName().compareTo(o.getLastName()) > 0){
            return 1;
        }
        if (this.getLastName().compareTo(o.getLastName()) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
