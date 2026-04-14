package com.edu.uce.negocio;

public class NotificadorSMS {
    public void enviar(String cliente, String mensaje) {
        System.out.println("Se envia un SMS al cliente: " + cliente);
        System.out.println("SMS: " + mensaje);
        System.out.println("");
    }
}
