/*
import java.util.*;
class Student{
    int marks;
}

public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;

        Student obj[] = new Student[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            obj[i].marks = scanner.nextInt();
            System.out.println("student marks is: " + obj[i].marks);
        }

        // Max marks from students
        int max_marks = obj[0].marks;

        for(int i = 1; i < n; i++){
            if(obj[i].marks > max_marks){
                max_marks = obj[i].marks;
            }
        }

        System.out.println("Maximum marks of the students entered: "+max_marks);
    }
}
*/

import java.util.*;

public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();

        // Taking input for 5 students
        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < 5; i++) {
            lst.add(scanner.nextInt());
        }

        // Printing the entered marks
        System.out.print("Student marks are: ");
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        System.out.println();

        // Finding maximum mark
        int max_marks = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) > max_marks) {
                max_marks = lst.get(i);
            }
        }

        System.out.println("Maximum marks of the students entered: " + max_marks);
    }
}
