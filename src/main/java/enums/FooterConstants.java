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

    public enum Destacados{
        NOSOTROS("Nosotros"),
        COMO_COMPRAR("Cómo comprar"),
        ENVIOS("Envíos"),
        COMO_CAMBIO("Cómo realizar un cambio"),
        DEVOLUCIONES("Devoluciones"),
        FAQ("Preguntas Frecuentes");

        private final String getDestacados;

        Destacados(String hMenu) {
            this.getDestacados = hMenu;
        }

        public String getDestacados () {
            return getDestacados;
        }
    }

    public enum AvisosLegales{
        TERMCONDITION("Términos y condiciones"),
        PRIVACIDAD("Privacidad"),
        TERMPROMO("Términos de promociones");

        private final String getAvisoLegal;

        AvisosLegales(String hMenu) {
            this.getAvisoLegal = hMenu;
        }

        public String getAvisoLegal () {
            return getAvisoLegal;
        }
    }

    public enum Redes{
        FACEBOOK("facebook"),
        INSTAGRAM("instagram");

        private final String getRed;

        Redes(String hMenu) {
            this.getRed = hMenu;
        }

        public String getRed () {
            return getRed;
        }
    }

    /*



    * */

}
