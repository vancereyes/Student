package model;

public class Main {
    public static void main(String[] args){
     Student myStudent = new Student();

    myStudent.setName("Vance");
    myStudent.setAge(25);
    myStudent.setGender("Male");
    myStudent.setID_NO(20206969);

        System.out.println(myStudent.getName());
        System.out.println(myStudent.getGender());
        System.out.println(myStudent.getAge());
        System.out.println(myStudent.getID_NO());
    }
}
