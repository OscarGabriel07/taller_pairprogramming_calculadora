package com.sofka.test;

import com.sofka.domain.Calculadora;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("logger");
        Scanner leer = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String resultadoOperacion = "";
        int opcion = -1;
        double numero1;
        double numero2;

        while (opcion != 0){
            logger.info("********** BIENVENIDO **********");
            logger.info("1. Sumar");
            logger.info("2. Restar");
            logger.info("3. Multiplicar");
            logger.info("4. Dividir");
            logger.info("0. Salir");
            logger.info("Por favor ingrese una opción");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion){
                case 1:
                    numero1 = capturarNumeroPorConsola();
                    numero2 = capturarNumeroPorConsola();
                    resultadoOperacion = "La suma de los números es: " + calculadora.sumar(numero1, numero2);
                    logger.info(resultadoOperacion);
                    break;
                case 2:
                    numero1 = capturarNumeroPorConsola();
                    numero2 = capturarNumeroPorConsola();
                    resultadoOperacion = "La resta de los números es: " + calculadora.restar(numero1, numero2);
                    logger.info(resultadoOperacion);
                    break;
                case 3:
                    numero1 = capturarNumeroPorConsola();
                    numero2 = capturarNumeroPorConsola();
                    resultadoOperacion = "La multiplicación de los números es: " + calculadora.multiplicar(numero1, numero2);
                    logger.info(resultadoOperacion);
                    break;
                case 4:
                    numero1 = capturarNumeroPorConsola();
                    numero2 = capturarNumeroPorConsola();
                    resultadoOperacion = "La division de los números es: " + calculadora.dividir(numero1, numero2);
                    logger.info(resultadoOperacion);
                    break;
                case 0:
                    logger.info("¡Hasta pronto!");
                    break;
                default:
                    logger.info("No ingresaste una opción válida");
            }
        }
    }
    public static double capturarNumeroPorConsola(){
        Scanner leer = new Scanner(System.in);
        Logger logger = Logger.getLogger("logger");
        logger.info("Por favor ingrese un número");
        return Double.parseDouble(leer.nextLine());
    }
}
