package notaletra;
/**
 *
 * @author Anibal
 */

import java.util.Scanner;
        
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // BLOQUE DE DECLARATIVAS
        double p1, p2, p3, exam, porcentExam, promedio, porcentPromedio, notaFinal;
        char letra;
        
        //BLOQUE DE INSTRUCCIONES
        System.out.println("Ingrese el puntaje de sus parciales: ");
        p1 = scanner.nextDouble();
        scanner.nextLine();
        p2 = scanner.nextDouble();
        scanner.nextLine();
        p3 = scanner.nextDouble();
        
        System.out.println("Ingrese el puntaje del examen: ");
        exam = scanner.nextDouble();
        
        //BLOQUE DE OPERACIONES
        promedio = (p1 + p2 + p3)/3;
        porcentExam = exam * 0.35;
        porcentPromedio = promedio * 0.65;
        notaFinal = porcentPromedio + porcentExam;
        
        //DETERMINAR LETRA
        if (notaFinal >= 91) {
            letra = 'A';
        }
        else if (notaFinal >= 81 && notaFinal < 91) {
            letra = 'B';
        }
        else if (notaFinal >= 71 && notaFinal < 81) {
            letra = 'C';
        }
        else if (notaFinal >= 61 && notaFinal < 71) {
            letra = 'D';
        }
        else {
            letra = 'F';
        }
        
        //IMPRIMIR SALIDA
        System.out.println("------------------------------------");
        System.out.println("Su nota es: ||  " + letra + "  ||");
        System.out.println("------------------------------------");
    }
}
