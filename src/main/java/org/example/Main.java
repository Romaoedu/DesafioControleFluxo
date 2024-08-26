package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o primeiro numero");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int parametro2 = scanner.nextInt();

        try {
                Contador(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    static void Contador(int numero1, int numero2) throws ParametrosInvalidosException{

        if (numero2 > numero1){
            int resultado =  numero2 - numero1;
            for (int i = 1; i <= resultado; i++) {
                System.out.println(i);
            }
        } else{
            throw new ParametrosInvalidosException();

        }
    }
}