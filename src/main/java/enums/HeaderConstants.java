package enums;

public class HeaderConstants {

    public enum HeaderMenu{
        HOMBRE("Hombre"),
        MUJER("Mujer"),
        NINOS("Niños"),
        ACCESORIOS("Accesorios"),
        NOVEDADES("Novedades"),
        MARCAS("Marcas");

        private final String getHeaderMenu;

        HeaderMenu(String hMenu) {
            this.getHeaderMenu = hMenu;
        }

        public String getHeaderMenu () {
            return getHeaderMenu;
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

        private final String getCalzado;

        Calzado(String hMenu) {
            this.getCalzado = hMenu;
        }

        public String getCalzado () {
            return getCalzado;
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

        private final String getUso;

        Uso(String hMenu) {
            this.getUso = hMenu;
        }

        public String getUso () {
            return getUso;
        }
    }

    public enum Accesorio{
        MOCHILA("Mochila");

        private final String getAccesorio;

        Accesorio(String hMenu) {
            this.getAccesorio = hMenu;
        }

        public String getAccesorio () {
            return getAccesorio;
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

        private final String getMarca;

        Marca(String hMenu) {
            this.getMarca = hMenu;
        }

        public String getMarca () {
            return getMarca;
        }
    }

}
