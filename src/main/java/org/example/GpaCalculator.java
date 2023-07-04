package org.example;

import java.util.List;

public class GpaCalculator {

    private final Courses courses;

    public GpaCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    // Calculation for GPA = sum of (credit hours x course grade) / total credit hours enrolled
    public double calculateGpa() {
        // sum of (credit hours x course grade)
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        // total credit hours enrolled
        int totalCompletedCredits = courses.calculateTotalCompletedCredits();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredits;
    }
}
