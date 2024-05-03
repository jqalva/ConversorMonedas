package org.oracle.alura.challange;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("Bienvenido al Conversor de Monedas\n\n");
        System.out.println("1. Dolar =>> Peso Argentino");
        System.out.println("2. Peso Argentino ==> Dolar");
        System.out.println("3. Dolar ==> Real Brasileño");
        System.out.println("4. Real Brasileño ==> Dolar");
        System.out.println("5. Dolar ==> Peso Colombiano");
        System.out.println("6. Peso Colombiano ==> Dolar");
        System.out.println("7. Salir");
        System.out.println("Elija una opción válida");
        System.out.println("*************************************");

        Scanner scanner = new Scanner (System.in);
        int i = scanner.nextInt();

        int option = 0;
        String fromCurrency, toCurrency;
        switch (option) {
            case 1:
                fromCurrency = "USD";
                toCurrency = "ARS";
                break;
            case 2:
                fromCurrency = "ARS";
                toCurrency = "USD";
                break;
            case 3:
                fromCurrency = "USD";
                toCurrency = "BRL";
                break;
            case 4:
                fromCurrency = "BRL";
                toCurrency = "USD";
                break;
            case 5:
                fromCurrency = "USD";
                toCurrency = "COP";
                break;
            case 6:
                fromCurrency = "COP";
                toCurrency = "USD";
                break;

        }
        while (option != 7 && option <= 6 && option >0) {



        }
    }


}