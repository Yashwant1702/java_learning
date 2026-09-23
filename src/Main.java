import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        double gpa;
        int[] marks=new int[5];
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name);
        System.out.println("enter your age:");
        age= sc.nextInt();
        System.out.println("enter your marks:");
        gpa = sc.nextDouble();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            System.out.println(marks[i]);
        }
        System.out.println("Name;" + name);
        System.out.println("Age;" + age);
        System.out.println("GPA:" + gpa);
        System.out.println("marks:" + Arrays.toString(marks));
        System.out.println("total:" + calculatedTotal(marks));
        System.out.println("Average:" + calculateAverage(marks));
        System.out.println("Grade:" + calculateGrade(calculateAverage(marks)));
    }
    static int calculatedTotal(int[] marks){
        int total = 0;
        for(int mark : marks){
            total +=mark;
        }
        return total;
    }
    static double calculateAverage(int[] marks){
        int total = calculatedTotal(marks);
        return (double) total / marks.length;
    }
    static char calculateGrade(double average){
        if(average >=90){
            return 'A';
        } else if(average >=80){
            return 'B';
        } else if(average >=70){
            return 'C';
        } else if(average >=60){
            return 'D';
        } else if(average >=50){
            return 'E';
        } else {
            return 'f';
        }
    }
}