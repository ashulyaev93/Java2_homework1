package Lesson_1.Marathon;


public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {//препятствие вода, определённой длины;
        competitor.swim(length);
    }
}
