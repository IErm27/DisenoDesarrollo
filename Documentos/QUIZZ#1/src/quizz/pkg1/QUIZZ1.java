/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class QUIZZ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        //double SEM = 0.0925;
        //double IVM = 0.0508;
        String empleados = "";
        String salarioindividual = "";
        double salarioindividualDouble = 0;
        double totalSEM;
        double totalIVM;
        double totalpagar;
        // Solicitar cantidad de empleados

        empleados = JOptionPane.showInputDialog("Cual es la cantidad de empleados?: ");

        salarioindividual = JOptionPane.showInputDialog("Digite el salario individual");
        salarioindividualDouble = Double.parseDouble(salarioindividual);

        //Calcular el SEM
        totalSEM = salarioindividualDouble * 0.0925;
        System.out.println("El Salario de SEM: " + totalSEM);

        //Calcular el IVM
        totalIVM = salarioindividualDouble * 0.0508;
        System.out.println("El Salario de IVM: " + totalIVM);
        
        totalpagar = totalSEM + totalIVM;

        System.out.println("La empresa debera abonar a la CCSS un monto de  por concepto de SEM y IVM\n" +totalpagar);

    }

    }


