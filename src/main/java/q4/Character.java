package q4;

public class Character {

    private StrategyLevels levelno;

    public void setLevelno(StrategyLevels level){
        levelno=level;
    }

    public void kick(){
        System.out.println("kicked");
    }


    public void punch(){
        System.out.println("punched");
    }

    public void jump(){
        levelno.jump();
    }

    public void roll(){
        levelno.roll();
    }
}

