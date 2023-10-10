/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medianotas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FinalGradesCalculator {
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<Double> grade = new ArrayList<>();
       
       System.out.println("Calculadora de nota final do aluno");       
       System.out.print("Quantas notas deseja inserir? ");

        int numNotas = scanner.nextInt();

        for (int i = 1; i <= numNotas; i++) {
        System.out.print("Digite a nota da prova nº" + i + ": ");
        double nota = scanner.nextDouble();
        grade.add(nota);
        }
        
        if (grade.isEmpty()) {
            System.out.println("A lista de notas de prova está vazia. Nenhum cálculo pode ser realizado.");
        } else {
            double notaFinal = calculateFinalGrade(grade);
            if (notaFinal >= 70) {
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Aluno aprovado!!!");
            } else {
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Aluno reprovado!!!");
            }
        }
     }

    public static double calculateFinalGrade(List<Double> grade) {
        if (grade.isEmpty()) {
            throw new IllegalArgumentException("A lista de notas de provas não pode estar vazia.");
        }
        double soma = 0;
        for (Double nota : grade) {
             soma += nota;
        }
        return soma;
    }
}
