package org.example;

public class Course {
    private final String subject;
    private final int credit;
    private final String grade; // (A+, A, B+, ...)


    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.grade) {
            case "A+":
                grade = 4.0;
                break;
            case "A":
                grade = 4.0;
                break;
            case "A-":
                grade = 3.7;
                break;
            case "B+":
                grade = 3.3;
                break;
            case "B":
                grade = 3.0;
                break;
            case "B-":
                grade = 2.7;
                break;
            case "C+":
                grade = 2.3;
                break;
            case "C":
                grade = 2.0;
                break;
            case "C-":
                grade = 1.7;
                break;
            case "D+":
                grade = 1.3;
                break;
            case "D":
                grade = 1.0;
                break;
            case "F":
                grade = 0.0;
                break;
        }
        return grade;
    }
}
