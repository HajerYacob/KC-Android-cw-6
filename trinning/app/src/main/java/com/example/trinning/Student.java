package com.example.trinning;

public class Student {


    private String stidentname;
    private int Studentage;
    private int Studentfhoto;

    public Student(String studentname, int studentage, int studentfhoto) {
        this.stidentname = studentname;
        this.Studentage = studentage;
        this.Studentfhoto = studentfhoto;


    }

    public String getStidentname() {
        return stidentname;
    }

    public void setStidentname(String stidentname) {
        this.stidentname = stidentname;
    }

    public int getStudentage() {
        return Studentage;
    }

    public void setStudentage(int studentage) {
        Studentage = studentage;
    }

    public int getStudentfhoto() {
        return Studentfhoto;
    }

    public void setStudentfhoto(int studentfhoto) {
        Studentfhoto = studentfhoto;
    }
}






