package com.company;
import java.util.Scanner;

/**
 * Created by AlexPanteleev on 04.03.2017.
 */
public class Game {
   private int[] enemy = new int[3];
   private int count = 0;
   private int count_hod = 0;
   private Scanner scan = new Scanner(System.in);

    public void game_starts ()
    {

        while (count < 3)
        {
            shooting(enemy);
            count_hod++;

        }
        System.out.println("Ты победил!");
        System.out.println("Количество затраченных ходов: " +count_hod);
    }
    public void shooting (int[] ar  ) {
        setEnemy();
        System.out.println("Стреляй");
        int a = scan.nextInt();
        System.out.println("Идет обстрел точки: " + a);
        for (int i=0; i<enemy.length; i++){
            if (a == ar[i]){
                System.out.println("Попал");
                count++;
                break;
            }
            if (i==enemy.length-1){
                System.out.println("Не попал");
            }

        }
    }
    public void setEnemy(){
        int a = 0+(int)(Math.random()*10);
        int check = 0+ (int)(Math.random()*2);
        if (a <=1) check = 0;
        if (a >=8) check = 1;
        for (int i = 0; i<enemy.length; i++)
        {
            enemy[i] = a;
            if (check ==0) a++;
            if (check ==1) a--;
        }
    }
    public void getEnemy(){
        for (int i = 0; i<enemy.length; i++)
        {
            System.out.println("Enemy[" +i +"]: " +enemy[i]);
        }
    }
}
