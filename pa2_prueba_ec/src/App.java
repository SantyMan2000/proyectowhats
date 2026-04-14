import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Sistema de Registro de Pedidos UCE ---");

        PedidoService service = new PedidoService();

        // CASO 1: Pedido mayor a $100 (Debería intentar enviar Mail)
        System.out.println("--- Ejecutando Caso 1 (Mayor a 100) ---");
        Pedido pedidoGrande = new Pedido("Emily Chango", "Coca Cola Pack", 120, "emily@gmail.com");
        service.registrar(pedidoGrande);

        System.out.println("---------------------------------------");

        // CASO 2: Pedido menor o igual a $100 (Debería enviar SMS)
        System.out.println("--- Ejecutando Caso 2 (Menor o igual a 100) ---");
        Pedido pedidoPequeno = new Pedido("Marco Saltos", "Snack", 50, "marco@gmail.com");
        service.registrar(pedidoPequeno);
    }
}