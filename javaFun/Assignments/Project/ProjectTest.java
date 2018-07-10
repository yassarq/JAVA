public class ProjectTest {
    public static void main(String[] args){
        Project project1 = new Project();
        Project project2 = new Project("Nina");
        Project project3 = new Project("Tim", " He's the Professor!");
        Project project4 = new Project("Tony", "He is fun!");
        // project1.objectMethods(person2);
        System.out.println(project3.elevatorPitch());
    }
}