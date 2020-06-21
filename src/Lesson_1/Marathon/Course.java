package Lesson_1.Marathon;

public class Course {

    Obstacle[] course;

    public Course(Obstacle[] course) {
        this.course = course;
    }

    public void passAll(Competitor competitor){//участники по очереди проходят все препятствия;
        for (Obstacle o : course) {
            o.doIt(competitor);
            if (!competitor.isOnDistance()) break;
        }
    }
}
