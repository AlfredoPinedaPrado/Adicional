package Adicional;

import java.util.*;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese su linea de operadora: (Telcel, Telmex, AT&T)");
        String operadora = keyboard.nextLine();
        System.out.println("Ingrese su tipo de Marca de teléfono: (samsung, iphone, xiaomi, siemens)");
        String marca = keyboard.nextLine();
        System.out.println("Ingrese su Tipo de teléfono: (móvil, fijo, solo llamadas, llamadas y mensajes de texto)");
        String TipoTel = keyboard.nextLine();
        System.out.println("Ingrese su numero de telefono");
        String numeroTel = keyboard.nextLine();
        System.out.println("Espesifique su tipo de contrato: (Prepago, Postpago)");
        String contrato = keyboard.nextLine();
        Telefono datos = new Telefono(operadora, marca, TipoTel, numeroTel, contrato);

        System.out.println();
        System.out.println("| -- -- -- -- -- -- -- -- |");
        System.out.println("|  Alfredo Pineda Prado   |");
        System.out.println("| ***DATOS RECIBIDOS***   |");
        System.out.println("| -- -- -- -- -- -- -- -- |\n");
        System.out.println("[*]Operador:" + operadora);
        System.out.println("[*]Marca:" + marca);
        System.out.println("[*]Tipo de Telefono:" + TipoTel);
        System.out.println("[*]Numero Telefonico:" + numeroTel);
        System.out.println("[*]Contrato:" + contrato);
    }

}
