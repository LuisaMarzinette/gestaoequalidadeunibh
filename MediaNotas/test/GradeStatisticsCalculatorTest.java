/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import medianotas.GradesInserter;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class GradeStatisticsCalculatorTest {

    @Test
    public void testCalculateAverage() {
        List<Double> grades = new ArrayList<>();
        grades.add(85.0);
        grades.add(90.0);
        grades.add(78.0);

        double average = GradesInserter.calculateAverage(grades);
        assertEquals(84.333,GradesInserter.calculateAverage(grades), 0.001);
    }

    @Test
    public void testCalculateStandardDeviation() {
        List<Double> grades = new ArrayList<>();
        grades.add(85.0);
        grades.add(90.0);
        grades.add(78.0);

        double standardDeviation = GradesInserter.calculateStandardDeviation(grades);
        assertEquals(5.773, standardDeviation, 0.002);
    }

    @Test
    public void testCalculateAverageWithEmptyList() {
        List<Double> grades = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> {
            GradesInserter.calculateAverage(grades);
        });
    }

    @Test
    public void testCalculateStandardDeviationWithEmptyList() {
        List<Double> grades = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, () -> {
           
        });
    }

    
}
