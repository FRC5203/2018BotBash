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
                //region Alphabet
                case 0: text += ' ';
                case 1: text += 'a';
                case 2: text += 'b';
                case 3: text += 'c';
                case 4: text += 'd';
                case 5: text += 'e';
                case 6: text += 'f';
                case 7: text += 'g';
                case 8: text += 'h';
                case 9: text += 'i';
                case 10: text += 'j';
                case 11: text += 'k';
                case 12: text += 'l';
                case 13: text += 'm';
                case 14: text += 'n';
                case 15: text += 'o';
                case 16: text += 'p';
                case 17: text += 'q';
                case 18: text += 'r';
                case 19: text += 's';
                case 20: text += 't';
                case 21: text += 'u';
                case 22: text += 'v';
                case 23: text += 'w';
                case 24: text += 'x';
                case 25: text += 'y';
                case 26: text += 'z';
                //endregion
            }
        }
        return text;
    }
}