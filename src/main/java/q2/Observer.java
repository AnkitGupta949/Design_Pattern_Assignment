package q2;

public interface Observer {

    void update(int runs,int bowls);

}


class CurrentScoreDisplay implements Observer{
int currentRuns;
int currentBowls;
Subject subject;

CurrentScoreDisplay(Subject sub){
this.subject=sub;
    subject.registerObserver(this);
}

    @Override
    public void update(int runs, int bowls) {
        currentRuns=runs;
        currentBowls=bowls;
        print();
    }


    public void print(){
        System.out.println("Current runs : "+currentRuns +"and current bowls : "+currentBowls );

    }
}



class AverageScoreDisplay implements Observer{
    int currentRuns;
    int currentBowls;
    Subject subject;

    AverageScoreDisplay( Subject sub){
        this.subject=sub;
        subject.registerObserver(this);
    }

    @Override
    public void update(int runs, int bowls) {
        currentBowls=bowls;
        currentRuns=runs;
        averageScorePrint();
    }

    public void averageScorePrint(){
        System.out.println("average is :"+currentRuns/currentBowls);
    }

}