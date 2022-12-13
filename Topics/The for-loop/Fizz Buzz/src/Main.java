import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = end - start; i >= 0; i--){
            if ((start % 5) == 0 && (start % 3) == 0) {
                System.out.println("FizzBuzz");
            } else if ((start % 5) == 0) {
                System.out.println("Buzz");
            } else if ((start % 3) == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(start);
            }
            start++;
        }// start coding here
    }
}