/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import medianotas.FinalGradesCalculator;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import medianotas.GradesInserter;


public class GradesInserterTest {
    @Test
    public void testCalculateSum() {
        List<Double> grades = new ArrayList<>();
        grades.add(10.0);
        grades.add(20.0);
        grades.add(35.0);

        double soma = FinalGradesCalculator.calculateFinalGrade(grades);
        assertEquals(65, soma, 0.001);
    }
    
    @Test 
    public void invalidNumber() {
       List<Double> grades = new ArrayList<>();
       grades.add(10.0);
       grades.add(-5.0);
       
       assertThrows(IllegalArgumentException.class, () -> {
            GradesInserter.calculateAverage(grades);
        });
    }

    @Test
    public void testCalculateMoreThen100() {
        List<Double> grades = new ArrayList<>();
        grades.add(50.0);
        grades.add(50.0);
        grades.add(1.0);

        double soma = FinalGradesCalculator.calculateFinalGrade(grades);
        assertEquals(101, soma, 0.001);
    }
}
