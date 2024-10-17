import java.util.ArrayList;

public class School {
  String name;
  ArrayList<Student> students = new ArrayList<>();

  public School(String name) {
    this.name = name;

    students.add(new Student(1, "java", "Faraz"));
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void printStudents() {
    System.out.println("På denna skola går: ");
    for (Student student : students) {
      student.printStudent();
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
