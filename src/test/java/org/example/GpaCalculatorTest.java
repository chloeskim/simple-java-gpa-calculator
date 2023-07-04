package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Requirements
 * Calculation for GPA = sum of (credit hours x course grade) / total credit hours enrolled
 * Use first-class collections
 */

public class GpaCalculatorTest {

    @DisplayName("Calculate GPA.")
    @Test
    void calculateGpaTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("Databases", 3, "A+"));

        GpaCalculator gpaCalculator = new GpaCalculator(courses);
        double gpa = gpaCalculator.calculateGpa();

        assertThat(gpa).isEqualTo(4.0);
    }
}
