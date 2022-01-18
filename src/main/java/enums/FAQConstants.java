package enums;

public class FAQConstants {

    public enum Tema{
        MICUENTA("Mi cuenta"),
        COMPRAS("Compras"),
        PAGO("Pago"),
        ENVIO("Envío"),
        CAMBIODEVOLUCION("Cambios y devoluciones"),
        PROMO("Promociones");

        public final String label;

        Tema(String label) {
            this.label = label;
        }
    }
}