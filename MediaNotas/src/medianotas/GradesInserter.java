/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medianotas;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import static medianotas.FinalGradesCalculator.calculateFinalGrade;
import static medianotas.GradeStatisticsCalculator.calculateAverage;
import static medianotas.GradeStatisticsCalculator.calculateStandardDeviation;

public class GradesInserter {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<Double> grade = new ArrayList<>();
       
       System.out.println("Calculadora de notas finais do aluno!!");       
       System.out.print("Quantas notas deseja inserir?");

        int numNotas = scanner.nextInt();

        for (int i = 1; i <= numNotas; i++) {
        System.out.print("Digite a nota da prova nº" + i + ": ");
        double nota = scanner.nextDouble();
        grade.add(nota);
        }

        if (grade.isEmpty()) {
            System.out.println("A lista de notas está vazia. Nenhum cálculo pode ser realizado.");
        } else {
            double media = calculateAverage(grade);
            double desvioPadrao = calculateStandardDeviation(grade);
            double notaFinal = calculateFinalGrade(grade);
            if (notaFinal >= 70) {
            System.out.println("Média das notas: " + media);
            System.out.println("Desvio Padrão das notas: " + desvioPadrao);
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Aluno aprovado!");
            } else {
            System.out.println("Média das notas: " + media);
            System.out.println("Desvio Padrão das notas: " + desvioPadrao);
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Aluno reprovado!");
            }
        }
    }

    public static double calculateAverage(List<Double> grades) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static double calculateStandardDeviation(List<Double> grades) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}