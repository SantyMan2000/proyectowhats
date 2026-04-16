package com.edu.uce.negocio;

public class NotificadorWhatsapp {

    public void enviar(String cliente, String mensaje) {
        System.out.println("Se envia un mensaje de Whatsapp al cliente: " + cliente);
        System.out.println("Whatsapp: " + mensaje + "\n");

    }
}