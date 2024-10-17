import java.util.ArrayList;

public class Student {

  int year;
  String education;
  String name;
  ArrayList<String> courses = new ArrayList<>();

  public Student(int year, String education, String name) {
    this.year = year;
    this.education = education;
    this.name = name;
  }

  public int getYear() {
    return year;
  }

  public void printStudent() {
    System.out.println("Namn: " + name + ", year:" + year);
  }

  public void addCourse(String course) {
    courses.add(course);
  }
}
