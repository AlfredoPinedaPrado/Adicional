package Adicional;

import java.util.ArrayList;

public class Acciones extends Marca {

    public Acciones(String linea, String marca) {
        super(linea, marca);
    }

    public void llamar() {
        System.out.println();
        // ArrayList<String> llamadas = new ArrayList<>();
        // llamadas.add("Llamar al número 555-9876543");
        // llamadas.add("Llamar al número 555-1234567");
    }

    public void Recibirllamada() {
        ArrayList<String> Historial_llamada = new ArrayList<>();
        Historial_llamada.add("Recibir una llamada telefónica del número 555-0987654");
    }

    public void Mensaje() {
        ArrayList<String> mensaje = new ArrayList<>();
        mensaje.add("Envía un mensaje “prueba de mensaje” del número 555-9988776");
    }

    public void RecibirMensaje() {
        ArrayList<String> Historial_mensaje = new ArrayList<>();
        Historial_mensaje.add("Recibe el mensaje “Hola buen día” del número 555-1234566");
    }

    public void Historial() {
        ArrayList<String> Historial = new ArrayList<>();
        Historial.add("50 llamadas de salida");
        Historial.add("23 llamadas de entrada");
    }
}
