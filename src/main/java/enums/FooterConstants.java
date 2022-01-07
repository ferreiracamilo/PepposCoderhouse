package enums;

public class FooterConstants {

    public enum Section{
        ATENCION_CLIENTE("Atención al Cliente"),
        DESTACADOS("Destacados"),
        METODOS_PAGO("Métodos de pago"),
        AVISOS_LEGALES("Avisos legales"),
        REDES("redes");

        public final String label;

        Section(String label) {
            this.label = label;
        }
    }

    public enum Destacado{
        NOSOTROS("Nosotros"),
        COMO_COMPRAR("Cómo comprar"),
        ENVIOS("Envíos"),
        COMO_CAMBIO("Cómo realizar un cambio"),
        DEVOLUCIONES("Devoluciones"),
        FAQ("Preguntas Frecuentes");

        public final String label;

        Destacado(String label) {
            this.label = label;
        }
    }

    public enum AvisoLegal{
        TERMCONDITION("Términos y condiciones"),
        PRIVACIDAD("Privacidad"),
        TERMPROMO("Términos de promociones");

        public final String label;

        AvisoLegal(String label) {
            this.label = label;
        }
    }

    public enum Red{
        FACEBOOK("facebook"),
        INSTAGRAM("instagram");

        public final String label;

        Red(String label) {
            this.label = label;
        }
    }

    public enum MetodoPago{
        AMEX("Amex"),
        OCA("Oca"),
        VISA("Visa"),
        MASTER("Mastercard"),
        ABITAB("Abitab"),
        REDPAGOS("Red Pagos"),
        MERCADOPAGO("Mercado Pago"),
        ANDA("Anda"),
        CABAL("Cabal"),
        CREDITEL("Creditel"),
        DINERS("Diners"),
        LIDER("Líder"),
        PASSCARD("Passcard"),
        TARJETAD("Tarjeta D");

        public final String label;

        MetodoPago(String label) {
            this.label = label;
        }
    }

    public enum AtencionCliente{
        AMEX("De lunes a viernes"),
        OCA("Whatsapp"),
        TARJETAD("Mail");

        public final String label;

        AtencionCliente(String label) {
            this.label = label;
        }
    }

}
