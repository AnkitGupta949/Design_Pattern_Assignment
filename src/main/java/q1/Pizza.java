package q1;

public interface Pizza {

     int getCost();
     String getDescription();

}

class PeppyPaneer implements Pizza{

    public int getCost(){
        return 10;
    }

    @Override
    public String getDescription() {
        return "peppy paneer";
    }
}

class Farmhouse implements Pizza{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "farm house";
    }
}


class Margherita implements Pizza{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription()
    {
        System.out.println("marg");
        return "margherita";
    }
}

class ChickenFiesta implements Pizza{

    public int getCost(){
        return 40;
    }

    @Override
    public String getDescription() {
        return "chicken fiesta";
    }
}
