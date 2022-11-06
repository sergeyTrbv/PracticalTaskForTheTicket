public class Main {

    public static int squareIt(int number) {
        if (number != 0) {
            number = number * number;
            System.out.println(number);
        } else {
            System.out.println("Нет смысла возводить в квадрат Нуль!");
        }return number;
    }

    public static void main(String[] args) {
        int number = 3;
        squareIt(number);
    }
}