public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, School!");
        // Skapa 2 skolor

        School school1 = new School("Värnamo");
        System.out.println(school1.getName());
        // school1.setName("Lund");
        // System.out.println(school1.getName());

        // School school2 = new School();

        // Lägga till elever
        school1.addStudent(new Student(1, "java", "Sara"));

        // Skriva ut information om skolan
        // Skriva ut information om elever
        school1.printStudents();

        // Lägga till ämnen till elever

    }

}
