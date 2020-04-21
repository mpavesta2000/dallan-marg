
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void run() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random genarater = new Random();
        System.out.printf("How many attackers or defenders you want?\n");
        int n = input.nextInt();
        ArrayList<Attackers> team1 = new ArrayList();
        ArrayList<Defenders> team2 = new ArrayList();
        for(int i = 0;i < n ; i++){
            team1.add(new Attackers());
            team2.add(new Defenders());
        }
        int round = 1, num1, num2, soldiernum1, soldiernum2;
        while (team1.size() == 0 || team2.size() == 0) {
            while (team1.size() != n || team2.size() != n) {
                soldiernum1 = RandomHelper.nextInt(team1.size());
                soldiernum2 = RandomHelper.nextInt(team1.size());
                team1.get(soldiernum1);
                team2.get(soldiernum2);
                System.out.printf("Round  %d\n",round);
                Thread.sleep(30000);
                System.out.printf("Attacker shoots!");
                num1 = genarater.nextInt() % 10;
                if (num1 != 6 || num1 != 7 || num1 != 8 || num1 != 9) {
                    int h = team2.get(soldiernum2).getHealth();
                    h = h -20;
                    team2.get(soldiernum2).setHealth(h);
                }
                Thread.sleep(30000);
                if (team2.get(soldiernum2).getHealth() < 100) {
                    System.out.printf("Attacker succesfully shooted the target!\n");
                } else {
                    System.out.printf("Attacker missed!\n");
                } System.out.printf("Defender shoots!\n");
                num2 = genarater.nextInt() % 10;
                if (num1 != 6 || num1 != 7 || num1 != 8 || num1 != 9) {
                    int h2 = team1.get(soldiernum1).getHealth();
                     h2 = h2 -20;
                    team2.get(soldiernum2).setHealth(h2);
                }
                Thread.sleep(30000);
                if (team1.get(soldiernum1).getHealth() < 100) {
                    System.out.printf("Defender succesfully shooted the target!\n");
                } else {
                    System.out.printf("Defender missed!\n");
                    if (team1.get(soldiernum1).getHealth() <= 0) {
                        team1.remove(soldiernum1);
                    }
                    if (team2.get(soldiernum2).getHealth() <= 0) {
                        team2.remove(soldiernum2);
                    }
                }
                n--;
                round++;
            }
        }
    }




}
