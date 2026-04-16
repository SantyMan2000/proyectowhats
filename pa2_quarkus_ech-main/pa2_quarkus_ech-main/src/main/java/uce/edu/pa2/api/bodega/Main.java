package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        @Inject
        private PedidoService pedidoService;
        // Modelos IoC
        // Di
        // @Inject
        // private PedidoService pedidoService;
        // 2. Service Locator(Lookup)
        // private PedidoService pedidoService =
        // CDI.current().select(PedidoService.class).get();

        // casi 1
        @Override
        public int run(String... args) {
            PedidoService pedidoService = CDI.current().select(PedidoService.class).get();
            Pedido pedido = new Pedido("Emily Chango", "Sprite", 1200, "eschango@uce.edu.ec");
            pedidoService.registrar(pedido);

            // caso 2
            Pedido pedido2 = new Pedido("Emily Chango", "Coca", 80, "@emily");
            pedidoService.registrar(pedido2);

            // caso 3
            Pedido pedido3 = new Pedido("Emily Chango", "WhatsApp", 45, "03154021");
            pedidoService.registrar(pedido3);

            return 0;
        }
    }
}
