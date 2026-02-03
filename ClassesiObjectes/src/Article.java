import java.text.NumberFormat;
import java.util.Locale;

public class Article {

    private String codi;
    private String descripcio;
    private int unitats;
    private float preu;
    private int iva;

    public Article(String codi, String descripcio, int unitats, float preu, int iva) {

        if (codi == null || codi.length() != 4) {
            throw new IllegalArgumentException("El codi ha de tenir 4 caràcters");
        }


        setCodi(codi);
        setDescripcio(descripcio);
        setUnitats(unitats);
        setPreu(preu);
        setIva(iva);
    }

    public String getCodi() { return codi; }
    public String getDescripcio() { return descripcio; }
    public int getUnitats() { return unitats; }
    public float getPreu() { return preu; }
    public int getIva() { return iva; }

    public boolean setUnitats(int unitats) {
        if (unitats < 0) return false;
        this.unitats = unitats;
        return true;
    }

    public boolean setPreu(float preu) {
        if (preu < 0.10f) return false;
        this.preu = preu;
        return true;
    }

    public boolean setIva(int iva) {
        if (iva != 0 && iva != 4 && iva != 5 && iva != 10 && iva != 21)
            return false;
        this.iva = iva;
        return true;
    }

    public float getPreuFinal() {
        float subtotal = unitats * preu;
        return subtotal + subtotal * iva / 100;
    }

    public boolean setDescripcio(String descripcio) {
        if (descripcio == null || descripcio.isEmpty())
            return false;
        this.descripcio = descripcio;
        return true;
    }

    public boolean setCodi(String codi) {
        if (codi == null || codi.length() != 4)
            return false;
        this.codi = codi;
        return true;
    }


    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
        return codi + " : " + descripcio + " : " + nf.format(getPreuFinal());
    }
}
