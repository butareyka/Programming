import persons.*;
import enums.*;
import exceptions.*;

public class Main{
    public static void main(String[] args) throws CheckMedicalException {
        System.out.println("Введите количество груш:");

        MinorCharacters guys = new MinorCharacters("Vintic and Shpuntic", "наблюдатели", "не ели"){
            {
                this.watching();
            }
            void watching(){
                System.out.println(this.name + LittleMenStatus.WATCHING.getStringStatus() + Victim.getVictim().getName());
            }
        };

        Victim.Hands hands = Victim.getVictim().new Hands(PartOfBody.DOWN.getStringStatusPartOfBody());
        Victim.Eyes eyes = Victim.getVictim().new Eyes(PartOfBody.CLOSE.getStringStatusPartOfBody());

        if (Victim.getVictim().getAmtOfEatenPears() > 0){
            switch (Victim.getVictim().getAmtOfEatenPears()){
                case 0:
                    Victim.getVictim().setStatus(LittleMenStatus.HUNGRY);
                    break;
                case 1,2,3,4:
                    Victim.getVictim().setStatus(LittleMenStatus.NORMAL);
                    break;
                case 5,6,7:
                    Victim.getVictim().setStatus(LittleMenStatus.CLOSEYES);
                    break;
                case 8,9,10,11:
                    Victim.getVictim().setStatus(LittleMenStatus.WHITEFACE);
                    break;
                default:
                    Victim.getVictim().setStatus(LittleMenStatus.DEATH);
                    break;
            }
        }
        else {
            throw new EatImposibleAmountOfPearsException();
        }

        switch (Victim.getVictim().getStatus()){
            case HUNGRY:
                System.out.println(LittleMenStatus.HUNGRY.getStringStatus());
                break;
            case NORMAL:
                System.out.println(LittleMenStatus.NORMAL.getStringStatus());
                break;
            case CLOSEYES:
                System.out.println(Victim.getVictim().getName() + hands.getHandPosition());
                System.out.println(Victim.getVictim().getName() + eyes.getEyesCondition());
                System.out.println(LittleMenStatus.CLOSEYES.getStringStatus());
                Doctor.getPilulkin().shakingVictim(Victim.getVictim());
                System.out.println(LittleMenStatus.WAKEUP.getStringStatus());
                hands.setHandsCondition(PartOfBody.UP.getStringStatusPartOfBody());
                eyes.setEyesCondition(PartOfBody.OPEN.getStringStatusPartOfBody());
                System.out.println(Victim.getVictim().getName() + hands.getHandPosition());
                System.out.println(Victim.getVictim().getName() + eyes.getEyesCondition());
                break;
            case WHITEFACE:
                System.out.println(Victim.getVictim().getName() + hands.getHandPosition());
                System.out.println(Victim.getVictim().getName() + eyes.getEyesCondition());
                System.out.println(LittleMenStatus.CLOSEYES.getStringStatus());
                Doctor.getPilulkin().shakingVictim(Victim.getVictim());
                System.out.println(LittleMenStatus.WHITEFACE.getStringStatus());
                Doctor.getPilulkin().grabVictimHand(Victim.getVictim());
                Doctor.getPilulkin().checkingVictimPulse();
                System.out.println(LittleMenStatus.WEAKPULSE.getStringStatus());
                Doctor.getPilulkin().listenVictimHeartbeat(Victim.getVictim());
                System.out.println(LittleMenStatus.NOHEARTBEAT.getStringStatus());
                Doctor.getPilulkin().giveToSniffToVictim(Victim.getVictim());
                Victim.getVictim().victimSniffing();
                System.out.println(LittleMenStatus.WAKEUP.getStringStatus());
                hands.setHandsCondition(PartOfBody.UP.getStringStatusPartOfBody());
                eyes.setEyesCondition(PartOfBody.OPEN.getStringStatusPartOfBody());
                System.out.println(Victim.getVictim().getName() + hands.getHandPosition());
                System.out.println(Victim.getVictim().getName() + eyes.getEyesCondition());
                break;
            case DEATH:
                System.out.println(Victim.getVictim().getName() + hands.getHandPosition());
                System.out.println(Victim.getVictim().getName() + eyes.getEyesCondition());
                System.out.println(LittleMenStatus.CLOSEYES.getStringStatus());
                Doctor.getPilulkin().shakingVictim(Victim.getVictim());
                System.out.println(LittleMenStatus.WHITEFACE.getStringStatus());
                Doctor.getPilulkin().grabVictimHand(Victim.getVictim());
                Doctor.getPilulkin().checkingVictimPulse();
                System.out.println(LittleMenStatus.WEAKPULSE.getStringStatus());
                Doctor.getPilulkin().listenVictimHeartbeat(Victim.getVictim());
                System.out.println(LittleMenStatus.NOHEARTBEAT.getStringStatus());
                Doctor.getPilulkin().giveToSniffToVictim(Victim.getVictim());
                Victim.getVictim().victimSniffing();
                System.out.println(LittleMenStatus.DEATH.getStringStatus());
        }
    }

}