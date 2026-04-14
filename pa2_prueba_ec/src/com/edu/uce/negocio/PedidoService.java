package com.edu.uce.negocio;

public class PedidoService {

   

    public void registrar(Pedido pedido) {

        System.out.println("Registrando pedido de:" + pedido.getProducto()
        );
        System.out.println("Cliente:" + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");


// Lógica de notificación según el monto
        if (pedido.getTotal() > 100) {
            try {
                // Para montos mayores a 100 se envía Mail
                NotificadorMail n1 = new NotificadorMail();
                n1.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido (Email)");
            } catch (Exception e) {
                System.out.println("Error al inicializar el servicio de correo.");
            }
        } else {
            // Para montos menores o iguales a 100 se envía SMS
            NotificadorSMS n2 = new NotificadorSMS();
            n2.enviar(pedido.getCliente(), "Se ha creado un pedido para ser atendido (SMS)");
        }
    }
}
