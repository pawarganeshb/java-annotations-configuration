package com.app;

// Class representing a student
public class Students {
    private String stuName; // Student's name
    private int StuRoll;    // Student's roll number
    private int marks;      // Student's marks
    
    // Constructor
    public Students() {
        System.out.println("Student Object Created...!");
    }

    // Getter for student's name
    public String getStuName() {
        return stuName;
    }

    // Setter for student's name
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    // Getter for student's roll number
    public int getStuRoll() {
        return StuRoll;
    }

    // Setter for student's roll number
    public void setStuRoll(int stuRoll) {
        StuRoll = stuRoll;
    }

    // Getter for student's marks
    public int getMarks() {
        return marks;
    }

    // Setter for student's marks
    public void setMarks(int marks) {
        this.marks = marks;
    }
}