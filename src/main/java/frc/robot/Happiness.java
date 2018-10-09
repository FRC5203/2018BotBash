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



}