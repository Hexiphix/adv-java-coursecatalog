package lab1;

public class Main {
    public static void main(String args[]){
        CourseAbstract course1 = new IntroToProgrammingCourse("Intro To Programming","CS101");
        CourseAbstract course2 = new IntroJavaCourse("Intro To Java","CS201");
        CourseAbstract course3 = new AdvancedJavaCourse("Advanced Java","CS251");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
