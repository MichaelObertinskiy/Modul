package task02;

import java.util.Random;
import java.util.Scanner;

/*
Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
 */
public class GuessNumber {

    public int number() {
        int num = 0;
        Random ran = new Random();
        num = ran.nextInt(100);
        return num;
    }

    public int inputNumber() {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number");
        x = scan.nextInt();
        return x;
    }

    public boolean test(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    public void game(int i, int y) {
        i++;
        int x = inputNumber();
        if (test(x, y)) {
            System.out.println("You win");
        } else {
            if (i <= 10) {
                if (x < y){
                    System.out.println("Try write a number more");
                }else{
                    System.out.println("Try write a number less");
                }
                game(i, y);
            } else {
                System.out.println("You Lost");
            }
        }
    }
}
