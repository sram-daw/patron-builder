public class Main {
    public static void main(String[] args) {

        //Instancia de la pizza con defecto con el patrón builder
        Pizza pizzaConBuilder= new PizzaBuilder().build(); //se instancia el objeto PizzaBuilder, creando su atributo build_pizza con el constructor. Luego esa pizza la devuelve el método build para asignarla a pizzaConBuilder

        //Instancia de una pizza customizada con el patrón builder
        Pizza pizzaBuilderCustom=new PizzaBuilder()
                .setTipoMasa(Pizza.PAN)
                .setSize(Pizza.MEDIUM)
                .setSinGluten(false)
                .setRelleno(true)
                .setPineapple(false)
                .setCebolla(false)
                .setExtraQueso(true)
                .setChampis(true)
                .setJamon(true)
                .setSalsa(true)
                .setRecojida(Pizza.PARALLEVAR)
                .build();
        //Se muestra el resultado
        System.out.println(pizzaConBuilder.toString()+"\n"+pizzaBuilderCustom.toString());


    }
}