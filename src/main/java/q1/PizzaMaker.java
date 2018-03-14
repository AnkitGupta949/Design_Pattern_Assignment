package q1;

public class PizzaMaker {
    public static void main(String[] args) {

        Pizza myPizza=new Barbeque(new Capsicum(new Margherita()));

        System.out.println(myPizza.getDescription());
        System.out.println(myPizza.getCost());
    }
}
