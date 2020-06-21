package Lesson_1.Marathon;


public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }//препятствие стена, определённой высоты;

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}