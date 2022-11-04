public class Main {

    public static int squareIt() {
        int number = 3;
        if (number != 0) {
            number = number * number;
            System.out.println(number);
        } else {
            System.out.println("На НУЛЬ делить нельзя!!!");
        }return number;
    }

    public static void main(String[] args) {
        squareIt();
    }
}