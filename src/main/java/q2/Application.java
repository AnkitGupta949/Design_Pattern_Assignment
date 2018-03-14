package q2;

public class Application {
    public static void main(String[] args) {
        CricInfo subject=new CricInfo();

        Observer observer1=new CurrentScoreDisplay(subject);
        Observer observer2=new AverageScoreDisplay(subject);
        subject.removeObserver(observer1);
        subject.changedScore(20,100);

    }
}
