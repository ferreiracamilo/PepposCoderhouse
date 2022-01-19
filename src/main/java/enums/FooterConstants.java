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

    public enum Subitems{
        Destacados_NOSOTROS("Nosotros"),
        Destacados_COMO_COMPRAR("Cómo comprar"),
        Destacados_ENVIOS("Envíos"),
        Destacados_COMO_CAMBIO("Cómo realizar un cambio"),
        Destacados_DEVOLUCIONES("Devoluciones"),
        Destacados_FAQ("Preguntas Frecuentes"),
        AvisosLegales_TERMCONDITION("Términos y condiciones"),
        AvisosLegales_PRIVACIDAD("Privacidad"),
        AvisosLegales_TERMPROMO("Términos de promociones"),
        Redes_FACEBOOK("facebook"),
        Redes_INSTAGRAM("instagram"),
        MetodosPago_AMEX("Amex"),
        MetodosPago_OCA("Oca"),
        MetodosPago_VISA("Visa"),
        MetodosPago_MASTER("Mastercard"),
        MetodosPago_ABITAB("Abitab"),
        MetodosPago_REDPAGOS("Red Pagos"),
        MetodosPago_MERCADOPAGO("Mercado Pago"),
        MetodosPago_ANDA("Anda"),
        MetodosPago_CABAL("Cabal"),
        MetodosPago_CREDITEL("Creditel"),
        MetodosPago_DINERS("Diners"),
        MetodosPago_LIDER("Líder"),
        MetodosPago_PASSCARD("Passcard"),
        MetodosPago_TARJETAD("Tarjeta D"),
        AtencionCliente_SCHEDULE("De lunes a viernes"),
        AtencionCliente_WP("Whatsapp"),
        AtencionCliente_MAIL("Mail");

        public final String label;

        Subitems(String label) {
            this.label = label;
        }
    }

}
