package Lesson_1.Marathon;


public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }//расстояние, которое нужно пробежать;

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
