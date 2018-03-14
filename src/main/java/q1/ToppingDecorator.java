package q1;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    ToppingDecorator(Pizza piz){
        tempPizza=piz;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public int getCost() {
        return tempPizza.getCost();
    }
}



class Tomato extends ToppingDecorator{

    Tomato(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" tomato";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 1;
    }
}

class Paneer extends ToppingDecorator{

    Paneer(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" paneer";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 2;
    }
}


class Jalapeno extends ToppingDecorator{

    Jalapeno(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription() +" jalapano";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 3;
    }
}


class Capsicum extends ToppingDecorator{

    Capsicum(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription()
    {
        System.out.println("caps");
        return tempPizza.getDescription() +" capsicum";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 4;
    }
}


class Barbeque extends ToppingDecorator{

    Barbeque(Pizza piz){
        super(piz);
    }


    @Override
    public String getDescription()
    {
        System.out.println("barb");
        return tempPizza.getDescription() +" barbeque";
    }


    @Override
    public int getCost() {
        return tempPizza.getCost() + 5;
    }
}
