public class Pizza {
    private int tipoMasa;
    private int size;
    private boolean rellena;
    private boolean cebolla;
    private boolean sinGluten;

    private boolean extraQueso;

    private boolean pineapple;

    private boolean champis;

    private boolean jamon;
    private int recojida;

    // tipo de masa
    public static final int FINA = 0;
    public static final int PAN = 1;

    // tamaño de la pizza
    public static final int SMALL = 0;
    public static final int MEDIUM = 2;
    public static final int BIG = 3;

    // recojida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizza() {
        this.cebolla = true;
        this.recojida = TIENDA;
        this.rellena = false;
        this.sinGluten = false;
        this.extraQueso = true;
        this.pineapple = false;
        this.champis = true;
        this.jamon = true;
        this.size = MEDIUM;
        this.tipoMasa = FINA;
    }


    /**
     * Constructor con todoa los parametros
     *
     * @param tipoMasa   espesor de la masa
     * @param size       tamaño de la pizza
     * @param rellena    si el borde esta relleno de queso
     * @param cebolla    lleva o no lleva
     * @param sinGluten  para celíacos
     * @param extraQueso doble de queso
     * @param sinGluten  con o sin piña
     * @param champis    con o sin champiñones
     * @param jamon con o sin jamón
     * @param recojida   como lo va a recoger el cliente
     */
    public Pizza(int tipoMasa, int size, boolean rellena, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean pineapple, boolean champis, boolean jamon, int recojida) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pineapple = pineapple;
        this.champis = champis;
        this.jamon = jamon;
        this.recojida = recojida;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tipoMasa=" + tipoMasa +
                ", size=" + size +
                ", rellena=" + rellena +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", pineapple=" + pineapple +
                ", champis=" + champis +
                ", jamon=" + jamon +
                ", recojida=" + recojida +
                '}';
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
    }

    public boolean isChampis() {
        return champis;
    }

    public void setChampis(boolean champis) {
        this.champis = champis;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }
}
