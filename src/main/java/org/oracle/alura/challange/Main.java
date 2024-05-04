package org.oracle.alura.challange;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        String fromCurrency="", toCurrency="";
        int option = 0;
        do {
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

            option = scanner.nextInt();

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
            System.out.println("fromCurrency: " + fromCurrency + " toCurrency: " + toCurrency);
            // Setting URL
            String url_str = "https://v6.exchangerate-api.com/v6/550e30eafe663c42961a5b39/latest/COP";

            // Making Request
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            // Accessing object
            JsonObject req_result = jsonobj.get("conversion_rates").getAsJsonObject();
            System.out.println("*************"+req_result);

        }
        while (option != 7 && option <= 6 && option >=1);

    }


}