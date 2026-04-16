import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String... args) throws Exception {
        System.out.println("--- Sistema de Registro de Pedidos UCE ---");

        PedidoService service = new PedidoService();


        // CASO 1: Mayor a 100
        System.out.println("--- Ejecutando Caso 1 (Mayor a 100) ---");
        Pedido p1 = new Pedido("Emily Chango", "Coca Cola Pack", 120, "emily@gmail.com");
        service.registrar(p1);

        // CASO 2: Entre 50 y 100
        System.out.println("--- Ejecutando Caso 2 (Entre 50 y 100) ---");
        Pedido p2 = new Pedido("Marco Saltos", "Snack", 80, "marco@gmail.com");
        service.registrar(p2);

        // CASO 3: Menor a 50
        System.out.println("--- Ejecutando Caso 3 (Menor a 50) ---");
        Pedido p3 = new Pedido("Carlos Lara", "Pizza Familiar", 45, "carlos@gmail.com");
        service.registrar(p3);
    }
}