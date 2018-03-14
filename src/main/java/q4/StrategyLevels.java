package q4;

public interface StrategyLevels {

    void roll();
    void jump();
}

class LevelFirst implements StrategyLevels {
    @Override
    public void roll() {
        System.out.println("roll at level1");
    }

    @Override
    public void jump() {
        System.out.println("jump at level1");
    }
}


class LevelSecond implements StrategyLevels {
    @Override
    public void roll() {
        System.out.println("roll at level2");
    }

    @Override
    public void jump() {
        System.out.println("jump at level2");
    }
}