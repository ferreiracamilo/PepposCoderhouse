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

    public enum Subitems{
        Calzado_BOTA("bota"),
        Calzado_CHAMPIONES("championes"),
        Calzado_ZUECO("zueco"),
        Calzado_SANDALIAS("sandalias"),
        Calzado_ACCESORIOS("accesorios"),
        Calzado_ZAPATO("zapato"),
        Calzado_PANCHAS("panchas"),
        Uso_FITNESS("fitness"),
        Uso_RUNNING("running"),
        Uso_FUTBOL("futbol"),
        Uso_TREKKING("trekking"),
        Uso_BASKET("basket"),
        Uso_TENNIS("tennis"),
        Uso_AQUATIC("aquatic"),
        Uso_FUTBOL_CANCHA("futbol cancha"),
        Uso_FUTBOL_5("futbol 5"),
        Uso_FUTSAL("futbol de salón"),
        Accesorio_MOCHILA("mochila"),
        Marca_ADIDAS("adidas"),
        Marca_CLARKS("clarks"),
        Marca_CONVERSE("converse"),
        Marca_CROCS("crocs"),
        Marca_FILA("fila"),
        Marca_NEW_BALANCE("new-balance"),
        Marca_PUMA("puma"),
        Marca_PUSH("push"),
        Marca_REEBOK("reebok"),
        Marca_TOPPER("topper"),
        Marca_UMBRO("umbro");

        public final String label;

        Subitems(String label) {
            this.label = label;
        }
    }

}
