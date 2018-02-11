import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    String locStudents = "/home/dima/projects/java/task_27/dima.gres/src/main/resources/students.txt" ;

    ArrayList<Student> students =  readStudents(locStudents);

    for (Student student:students) {
      System.out.println(student);
    }

    
  }

  public static ArrayList<Student> readStudents(String location) {
    final int LAST_NAME = 0;
    final int FIRST_NAME = 1;
    final int AGE = 2;
    final int SPACE = 3;

    ArrayList<Student> students = new ArrayList<>();
    File file = new File(location);

    try (FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader)) {

      String line;
      int counter = 0;
      Student current = null;

      while ( (line = bufferedReader.readLine()) != null )  {
        counter %= 4;

        switch (counter) {
          case LAST_NAME:
            current = new Student();
            current.setLastname(line);
            break;

          case FIRST_NAME:
            current.setFirstname(line);
            break;

          case AGE:
            current.setAge(Integer.parseInt(line));
            break;

          case SPACE:
            students.add(current);
            break;
        }

        counter++;
      }

      students.add(current);

      return students;

    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return null;
  }
}
