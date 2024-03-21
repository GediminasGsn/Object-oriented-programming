import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] names = new String [10];
        String [] surnames = new String [10];
        int [] birthYears = new int [10];
        boolean [] genders = new boolean [10];
        int [][] grades = new int [10][10];
        System.out.println(names[0] + " " + surnames [0] + " " + birthYears[0] + " " + genders[0] + " " + Arrays.toString(grades[0]));

        Student studentas = new Student();

        studentas.name = "Gediminas";
        studentas.surname = "Gasiunas";
        studentas.birthYear = 1999;
        studentas.gender = true;
        studentas.grades = new int []{5,6,8,9,5};

        Student st2 = new Student();
        st2.name = "Vardenis";
        st2.surname = "Pavardenis";
        st2.studentInfo();
        studentas.studentInfo();

        System.out.println(studentas.toString());


    }
}