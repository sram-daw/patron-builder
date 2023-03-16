public class PizzaBuilder {

    //objeto pizza que construye el builder
    private Pizza build_pizza;

    // metodo que devuelve el objeto terminado
    public Pizza build() {
        return this.build_pizza;
    }

    // constructor que crea la pizza por defecto para configurarla
    public PizzaBuilder() {
        this.build_pizza = new Pizza();
    }

    // metodos para la personalizacion de la pizza
    public PizzaBuilder setTipoMasa(int tipoMasa) {
        this.build_pizza.setTipoMasa(tipoMasa);
        return this;
    }

    public PizzaBuilder setSize(int size) {
        this.build_pizza.setSize(size);
        return this;
    }

    public PizzaBuilder setRelleno(boolean relleno) {
        this.build_pizza.setRellena(relleno);
        return this;
    }

    public PizzaBuilder setCebolla(boolean cebolla) {
        this.build_pizza.setCebolla(cebolla);
        return this;
    }

    public PizzaBuilder setSinGluten(boolean sinGluten) {
        this.build_pizza.setSinGluten(sinGluten);
        return this;
    }

    public PizzaBuilder setExtraQueso(boolean extraQueso) {
        this.build_pizza.setExtraQueso(extraQueso);
        return this;
    }

    public PizzaBuilder setPineapple(boolean pineapple) {
        this.build_pizza.setPineapple(pineapple);
        return this;
    }

    public PizzaBuilder setChampis(boolean champis) {
        this.build_pizza.setChampis(champis);
        return this;
    }

    public PizzaBuilder setJamon(boolean jamon) {
        this.build_pizza.setJamon(jamon);
        return this;
    }

    public PizzaBuilder setSalsa(boolean salsa) {
        this.build_pizza.setSalsa(salsa);
        return this;
    }

    public PizzaBuilder setRecojida(int recojida) {
        this.build_pizza.setRecojida(recojida);
        return this;
    }
}
