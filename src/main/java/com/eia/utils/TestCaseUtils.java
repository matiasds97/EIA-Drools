package com.eia.utils;

import com.eia.model.Diagnostico;
import com.eia.model.DiagnosticoFinal;
import com.eia.model.Lector;
import com.eia.model.Tarjeta;

public class TestCaseUtils {

    public static void print(String title) {
        System.out.println(title);
    }

    public static void print() {
        print("");
    }

    public static void print(Lector lector) {

        DiagnosticoFinal diagnosticoFinal = lector.getDiagnosticoFinal();
        Tarjeta tarjeta = lector.getTarjeta();

        print();
        print("Lector");
        print("Diagnostico final: " +  diagnosticoFinal);
        print("Tarjeta: " + tarjeta);
        print();
    }

    public static void assertResults(DiagnosticoFinal esperado, DiagnosticoFinal obtenido) {
        printResults(esperado, obtenido);
        assert(esperado.isA(obtenido));
    }

    private static void printResults(DiagnosticoFinal esperado, DiagnosticoFinal obtenido) {
        print("Resultados");
        print("Esperaba: " + esperado);
        print("Recibi: " + obtenido);
    }
}