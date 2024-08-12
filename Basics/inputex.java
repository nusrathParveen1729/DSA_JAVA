import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("ënter username");

        String username = myobj.nextLine();//read user input
        

        //String input
        String name = myobj.nextLine();
        //numerical input
        int age = myobj.nextInt();
        double salary = myobj.nextDouble();
        //output
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}

