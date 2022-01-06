package enums;

public class FooterConstants {

    public enum Section{
        ATENCION_CLIENTE("Atención al Cliente"),
        DESTACADOS("Destacados"),
        METODOS_PAGO("Métodos de pago"),
        AVISOS_LEGALES("Avisos legales"),
        REDES("redes");

        private final String getSection;

        Section(String hMenu) {
            this.getSection = hMenu;
        }

        public String getSection () {
            return getSection;
        }
    }

    public enum Destacado{
        NOSOTROS("Nosotros"),
        COMO_COMPRAR("Cómo comprar"),
        ENVIOS("Envíos"),
        COMO_CAMBIO("Cómo realizar un cambio"),
        DEVOLUCIONES("Devoluciones"),
        FAQ("Preguntas Frecuentes");

        private final String getDestacado;

        Destacado(String hMenu) {
            this.getDestacado = hMenu;
        }

        public String getDestacado () {
            return getDestacado;
        }
    }

    public enum AvisoLegal{
        TERMCONDITION("Términos y condiciones"),
        PRIVACIDAD("Privacidad"),
        TERMPROMO("Términos de promociones");

        private final String getAvisoLegal;

        AvisoLegal(String hMenu) {
            this.getAvisoLegal = hMenu;
        }

        public String getAvisoLegal () {
            return getAvisoLegal;
        }
    }

    public enum Red{
        FACEBOOK("facebook"),
        INSTAGRAM("instagram");

        private final String getRed;

        Red(String hMenu) {
            this.getRed = hMenu;
        }

        public String getRed () {
            return getRed;
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

        private final String getMetodoPago;

        MetodoPago(String hMenu) {
            this.getMetodoPago = hMenu;
        }

        public String getMetodoPago () {
            return getMetodoPago;
        }
    }

    public enum AtencionCliente{
        AMEX("De lunes a viernes"),
        OCA("Whatsapp"),
        TARJETAD("Mail");

        private final String getAtencionCliente;

        AtencionCliente(String hMenu) {
            this.getAtencionCliente = hMenu;
        }

        public String getAtencionCliente () {
            return getAtencionCliente;
        }
    }

}
