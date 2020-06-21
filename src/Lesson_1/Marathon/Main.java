package Lesson_1.Marathon;


public class Main {

    public static void main(String[] args){

        Team team = new Team(new Competitor[]{new Cat("Барсик"), new Dog("Бобик"), new Human("Боб")});
        Course course = new Course(new Obstacle[]{new Cross(80), new Water(5), new Wall(1), new Cross(120)});
        team.startMarathon(course);
    }
}

