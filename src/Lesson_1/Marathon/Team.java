package Lesson_1.Marathon;

public class Team {

    Competitor[] competitors;

    public Team(Competitor[] competitors){
        this.competitors = competitors;
    }

    public void startMarathon(Course course){ //начало марафона, участники проходят препятствия
        for (Competitor competitor : competitors) {
            course.passAll(competitor);
        }
        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}
