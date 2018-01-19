package task05;
/*
5.Ход коня по шахматной доске
Вводиться текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(inputPosicion());


    }

    public static String inputPosicion(){
        String position;
        Scanner scan = new Scanner(System.in);
        position = scan.nextLine();
        return position;
    }

    public static int positionLine(char x){
        switch (x){
            case 'a':
                return 0;
                break;
            case 'b':
                return 1;
                break;
            case 'c':
                return 2;
                break;
            case 'd':
                return 3;
                break;
            case 'e':
                return 4;
                break;
            case 'f':
                return 5;
                break;
            case 'g':
                return 6;
                break;
            case 'h':
                return 7;
                break;
            default: System.out.println("We haven't this position");

                break;
        }
        return 45;
    }

    public static int[] positionChess(String x){
        int [] arr = new int [2];

        return arr;
    }

    static void field(){
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){

            }
        }
    }
}
