public class Main {
    public static void main(String[] args) {

        //Instancia de pizzas antes de patrón builder
        Pizza hawaiana = new Pizza(Pizza.FINA, Pizza.MEDIUM, true, false, false, true, true, false, true, Pizza.PARALLEVAR);
        Pizza jamonChampis = new Pizza(Pizza.FINA, Pizza.SMALL, true, false, true, true, false, true, true, Pizza.TIENDA);
        Pizza cebollaChampis = new Pizza(Pizza.FINA, Pizza.SMALL, true, true, true, true, false, true, true, Pizza.TIENDA);

        System.out.println(hawaiana.toString() + "\n"+jamonChampis.toString() +"\n"+ cebollaChampis.toString());


    }
}