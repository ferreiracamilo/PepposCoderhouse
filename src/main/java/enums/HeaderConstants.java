package enums;

public class HeaderConstants {

    public enum HeaderMenu{
        HOMBRE("it hombre"),
        MUJER("it mujer"),
        NINOS("it ninos"),
        ACCESORIOS("it accesorios"),
        NOVEDADES("it novedades"),
        MARCAS("it marcas");

        public final String label;

        HeaderMenu(String label) {
            this.label = label;
        }
    }

    public enum Calzado{
        BOTA("bota"),
        CHAMPIONES("championes"),
        ZUECO("zueco"),
        SANDALIAS("sandalias"),
        ACCESORIOS("accesorios"),
        ZAPATO("zapato"),
        PANCHAS("panchas");

        public final String label;

        Calzado(String label) {
            this.label = label;
        }
    }

    public enum Uso{
        FITNESS("fitness"),
        RUNNING("running"),
        FUTBOL("futbol"),
        TREKKING("trekking"),
        BASKET("basket"),
        TENNIS("tennis"),
        AQUATIC("aquatic"),
        FUTBOL_CANCHA("futbol cancha"),
        FUTBOL_5("futbol 5"),
        FUTSAL("futbol de salón");

        public final String label;

        Uso(String label) {
            this.label = label;
        }
    }

    public enum Accesorio{
        MOCHILA("mochila");

        public final String label;

        Accesorio(String label) {
            this.label = label;
        }
    }

    public enum Marca{
        ADIDAS("adidas"),
        CLARKS("clarks"),
        CONVERSE("converse"),
        CROCS("crocs"),
        FILA("fila"),
        NEW_BALANCE("new-balance"),
        PUMA("puma"),
        PUSH("push"),
        REEBOK("reebok"),
        TOPPER("topper"),
        UMBRO("umbro");

        public final String label;

        Marca(String label) {
            this.label = label;
        }
    }

}
