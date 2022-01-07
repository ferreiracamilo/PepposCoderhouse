package enums;

public class HeaderConstants {

    public enum HeaderMenu{
        HOMBRE("Hombre"),
        MUJER("Mujer"),
        NINOS("Niños"),
        ACCESORIOS("Accesorios"),
        NOVEDADES("Novedades"),
        MARCAS("Marcas");

        public final String label;

        HeaderMenu(String label) {
            this.label = label;
        }
    }

    public enum Calzado{
        BOTA("Bota"),
        CHAMPIONES("Championes"),
        ZUECO("Zueco"),
        SANDALIAS("Sandalias"),
        ACCESORIOS("Accesorios"),
        ZAPATO("Zapato"),
        PANCHAS("Panchas");

        public final String label;

        Calzado(String label) {
            this.label = label;
        }
    }

    public enum Uso{
        FITNESS("Fitness"),
        RUNNING("Running"),
        FUTBOL("Futbol"),
        TREKKING("Trekking"),
        BASKET("Basket"),
        TENNIS("Tennis"),
        AQUATIC("Aquatic"),
        FUTBOL_CANCHA("Futbol cancha"),
        FUTBOL_5("Futbol 5"),
        FUTSAL("Futbol de salón");

        public final String label;

        Uso(String label) {
            this.label = label;
        }
    }

    public enum Accesorio{
        MOCHILA("Mochila");

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
