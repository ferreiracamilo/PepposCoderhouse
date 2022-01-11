package enums;

public class BannerConstants {

    public enum Campania{
        SOMOS100ONLINE(" Somos 100% online "),
        ENTUCASA24HS(" En tu casa en 24hs. Cambios sin costo de envío y a domicilio "),
        FANCALZADOINTERNET(" Venimos a hablarle a los fanáticos del calzado e internet "),
        COMPRAONLINE247(" 24/7 para vos: comprá a cualquier hora ");

        public final String label;

        Campania(String label) {
            this.label = label;
        }
    }
}
