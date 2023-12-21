package persons;

import abilities.*;
import enums.LittleMenStatus;
import java.util.Scanner;

public class Victim extends LittleMen implements Sniffing, GiveNames{
    public static class Num{
        static Scanner scanner = new Scanner(System.in);
        static int num;

        static int setNumOfPears() {
            num = scanner.nextInt();
            return num;
        }
    }

    public static int amountOfPears = Num.setNumOfPears();
    private static final Victim victim = new Victim("Dunno", "Пострадавший", "Ел груши", amountOfPears, LittleMenStatus.NOSTATUS);
    private Victim(String name, String role, String ans, int amtOfEatenPears, LittleMenStatus littleMenStatus){
        super(name, role, ans, amtOfEatenPears, littleMenStatus);
    }

    @Override
    public void victimSniffing(){
        System.out.println(this.name + " вдыхает нашатырь... и...");
    }

    @Override
    public String getName(){
        return this.name;
    }

    public class Hands{
        private String position;

        public Hands(String position){
            this.position = position;
        }

        public String getHandPosition(){
            return this.position;
        }
        public void setHandsCondition(String position){
            this.position = position;
        }
    }

    public class Eyes{
        private String condition;

        public Eyes(String condition){
            this.condition = condition;
        }

        public String getEyesCondition(){
            return this.condition;
        }
        public void setEyesCondition(String condition){
            this.condition = condition;
        }
    }

    public static Victim getVictim(){
        return victim;
    }
}
