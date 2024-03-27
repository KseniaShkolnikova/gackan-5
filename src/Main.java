import java.util.Scanner;
public class Main {
    public static class cat implements Animal, Pet{
        @Override
        public void eat() {
            System.out.println("---------------------------------------------------------\nКошечки кушают корм и рыбу, пьют молоко");
        }
        @Override
        public void sound() {
            System.out.println("Кошечка говорит МЯУ и мурлыкает");
        }
        @Override
        public void play() {
            System.out.println("Играет в мышку и бантик");
        }
    }
    public static class dog implements Animal, Pet{
        @Override
        public void eat() {
            System.out.println("---------------------------------------------------------\nСобачки любят кушать корм и мясо. Иногда едят огурцы и яйца");
        }
        @Override
        public void sound() {
            System.out.println("Собачка говорит ГАВ");
        }
        @Override
        public void play() {
            System.out.println("Играет в мячик");
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------------------------------------------------\n  Выберите одно из животных:\n  1. Кошечка \n  2. Собачка\n  3. Выход");
            Scanner scanner = new Scanner(System.in);
            int var = scanner.nextInt();
            switch (var){
                case 1:
                    cat cat = new cat();
                    cat.eat();
                    cat.sound();
                    cat.play();
                    break;
                case 2:
                    dog dog = new dog();
                    dog.eat();
                    dog.sound();
                    dog.play();
                    break;
                case 3:
                    System.out.println("Пока пока!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Нужно вводить номер варианта ответа");
                    break;
            }
        }
    }
}