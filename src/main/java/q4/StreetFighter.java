package q4;

public class StreetFighter {

    public static void main(String[] args) {

        /*Character character1=new Level1();
        character1.jump();

        character1.setLevelno(new LevelSecond());
        character1.jump();
*/
        Character character1=new Character();
        character1.setLevelno(new LevelSecond());
        character1.jump();
        character1.kick();
        character1.roll();

    }
}
