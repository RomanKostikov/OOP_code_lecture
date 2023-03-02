package OOP_lecture_1.Ex006;

import java.util.Random;
/**
 * Код на создание команды 6 priesta and 4 mage
 */
public class Teams {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount);
        int priestCount = teamCount - magicianCount;

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount];
        Magician[] magicians = new Magician[magicianCount]; 

        for (int i = 0; i < priestCount; i++) {
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }

    }

}
