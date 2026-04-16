package com.edu.uce.negocio;

public class PedidoService {

    public void registrar(Pedido pedido) {

     System.out.println("Registrando pedido de: " + pedido.getProducto());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: $" + pedido.getTotal());
        System.out.println("Guardando en la base de datos...");

        if (pedido.getTotal() > 100) {
            // Caso 1: Mail
            NotificadorMail n1 = new NotificadorMail();
            n1.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido (Email)");
            
        } else if (pedido.getTotal() < 50) {
            // Caso 3: WhatsApp (Nombre de clase corregido aquí)
            NotificadorWhatsapp n3 = new NotificadorWhatsapp();
            n3.enviar(pedido.getCliente(), "Se ha creado un pedido para ser atendido (WhatsApp)");
            
        } else {
            // Caso 2: SMS (Entre 50 y 100)
            NotificadorSMS n2 = new NotificadorSMS();
            n2.enviar(pedido.getCliente(), "Se ha creado un pedido para ser atendido (SMS)");
        }
    }
}
