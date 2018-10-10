package frc.robot;

import java.util.Random;

/**
 * A class for random fun programming stuff
 */
public class Fun {

    static Random rand = new Random();

    /**
     * Makes the robot spin around like its dancing
     */
    public static void Dance(){
        switch(rand.nextInt(10)){
            case 0: 
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
        }
    }
    
    public static String RandomString(int stringLength){
        String text = "";
        
        for(int i = 0; i < stringLength; i++){
            switch(rand.nextInt(27)){
                case 0: text += ' '; break;
                case 1: text += 'a'; break;
                case 2: text += 'b'; break;
                case 3: text += 'c'; break;
                case 4: text += 'd'; break;
                case 5: text += 'e'; break;
                case 6: text += 'f'; break;
                case 7: text += 'g'; break;
                case 8: text += 'h'; break;
                case 9: text += 'i'; break;
                case 10: text += 'j'; break;
                case 11: text += 'k'; break;
                case 12: text += 'l'; break;
                case 13: text += 'm'; break;
                case 14: text += 'n'; break;
                case 15: text += 'o'; break;
                case 16: text += 'p'; break;
                case 17: text += 'q'; break;
                case 18: text += 'r'; break;
                case 19: text += 's'; break;
                case 20: text += 't'; break;
                case 21: text += 'u'; break;
                case 22: text += 'v'; break;
                case 23: text += 'w'; break;
                case 24: text += 'x'; break;
                case 25: text += 'y'; break;
                case 26: text += 'z'; break;
            }
        }
        return text;
    }
}