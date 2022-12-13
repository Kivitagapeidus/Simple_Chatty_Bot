import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int elements = scanner.nextInt();
        int number = 0;
        int max = 0;
        for (int i = 0; i < elements; i++){
            number = scanner.nextInt();
            if (number > max && (number % 4) == 0){
                max = number;
            }
        }
        System.out.println(max);
    }
}