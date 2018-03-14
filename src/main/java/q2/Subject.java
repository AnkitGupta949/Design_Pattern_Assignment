package q2;

import java.util.ArrayList;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObserver();

}

class CricInfo implements  Subject{
private int runs;
private int bowls;

private ArrayList<Observer> observerArrayList;

CricInfo(){
    observerArrayList=new ArrayList<>();
}

@Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerArrayList.remove(o);
    }


    @Override
    public void notifyAllObserver() {
        for(Observer observer:observerArrayList){
            observer.update(runs,bowls);
        }
    }

    public void updateScore(){
    notifyAllObserver();
    }

    public void changedScore(int b,int r){
    runs=r;
    bowls=b;
    updateScore();

    }
}

