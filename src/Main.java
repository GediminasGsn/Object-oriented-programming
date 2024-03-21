import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String [] names = new String [10];
//        String [] surnames = new String [10];
//        int [] birthYears = new int [10];
//        boolean [] genders = new boolean [10];
//        int [][] grades = new int [10][10];
//        System.out.println(names[0] + " " + surnames [0] + " " + birthYears[0] + " " + genders[0] + " " + Arrays.toString(grades[0]));
//
//        Student studentas = new Student();
//
//        studentas.name = "Gediminas";
//        studentas.surname = "Gasiunas";
//        studentas.birthYear = 1999;
//        studentas.gender = true;
//        studentas.grades = new int []{5,6,8,9,5};
//
//        Student st2 = new Student();
//        st2.name = "Vardenis";
//        st2.surname = "Pavardenis";
//        st2.studentInfo();
//        studentas.studentInfo();
//
//        System.out.println(studentas.toString());
//
//        Student [] students = {studentas,st2};
//
//        for (int i = 0; i < students.length; i++) {
//            Student student = students [i];
//
//        }
//        for (int i = 0; i < students.length; i++) {
//            Student student = students [i];
//            System.out.println(student);
//        }
//       for (Student kabliukas : students) {
//           System.out.println(kabliukas);
//       }

//        ArrayList<String> vardai = new ArrayList<>();
//       vardai.add("Piotr");
//       vardai.add("dzedimin");
//        System.out.println(vardai.get(2));
//        System.out.println(vardai.get(1));
//        System.out.println(vardai.size());
//        vardai.set(2,"Piotr");
//        vardai.remove(2);
//        vardai.contains("Piotr");
//        vardai.clear();

        Book Book1 = new Book();
       Book1.setTitle("Java for dummies");
       Book1.setPages(300);
       Book1.setReleaseYear(1999);

        Book Book2 = new Book();
        Book2.setTitle("C# for dummies");
        Book2.setPages(500);
        Book2.setReleaseYear(2000);

        Book Book3 = new Book();
        Book3.setTitle("Python for dummies");
        Book3.setPages(500);
        Book3.setReleaseYear(2005);

        ArrayList<Book> Book = new ArrayList<>();

    }
}