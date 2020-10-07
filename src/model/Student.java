package model;

public class Student {
    public String name, gender;
    public int age, ID_NO;

    public Student(){
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID_NO() {
        return ID_NO;
    }

    public void setID_NO(int ID_NO) {
        this.ID_NO = ID_NO;
    }
}
