package frc.robot;

import java.util.Random;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Happiness {

    //region Variables
    public int guy;
    public Random rand = new Random();

    //endregion

    public void Positivity(){
        guy = rand.nextInt(5);
        switch(guy){
            case 0: SmartDashboard.putString("DB/String 5", "You're doing a spectacular job!");
            case 1: SmartDashboard.putString("DB/String 5", "Hope everything goes well!");
            case 2: SmartDashboard.putString("DB/String 5", "Have a great day!");
            case 3: SmartDashboard.putString("DB/String 5", "Keep working hard!");
            case 4: SmartDashboard.putString("DB/String 5", "You're Amazing!");
        }
    }

    public void RobotMood(){
        Random rand2 = new Random();
        int guy2;
        guy2 = rand2.nextInt(3);
        switch(guy2){
            case 0: SmartDashboard.putString("DB/String 6", "Happy");
            case 1: SmartDashboard.putString("DB/String 6", "Neutral");
            case 2: SmartDashboard.putString("DB/String 6", "Sad");
        }
    }
    public void SentenceGen(){

    }
    public String NounGen(){
        String noun;
        noun = null;
        Random nounRand = new Random();
        int boi = nounRand.nextInt(5);
        switch(boi){
            case 0: noun = "tree";
            case 1: noun = "car";
            case 2: noun = "person";
            case 3: noun = "man";
            case 4: noun = "dog";
        }
        
        return noun;
        
    }
    public String ArticleGen(){
        String article;
        article = null;

        return article;
    }
    
   



}