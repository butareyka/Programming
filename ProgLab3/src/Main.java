import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество съеденных груш Незнайкой: ");
        Scanner scanner = new Scanner(System.in);
        int amountOfPears = scanner.nextInt();

        Victim dunno = new Victim("Dunno", "Пострадавший", "Ел груши", amountOfPears, Status.NOSTATUS);

        if (dunno.getAmtOfEatenPears() > 0){
            switch (dunno.getAmtOfEatenPears()){
                case 0:
                    dunno.setStatus(Status.HUNGRY);
                    break;
                case 1,2,3,4:
                    dunno.setStatus(Status.NORMAL);
                    break;
                case 5,6,7:
                    dunno.setStatus(Status.CLOSEYES);
                    break;
                case 8,9,10,11:
                    dunno.setStatus(Status.WHITEFACE);
                    break;
                default:
                    dunno.setStatus(Status.DEATH);
                    break;
            }
        }
        else{
            System.out.println("О нет! Ты кушаешь негативные груши!");
        }


        switch (dunno.getStatus()){
            case HUNGRY:
                System.out.println(Status.HUNGRY.getStringStatus());
                break;
            case NORMAL:
                System.out.println(Status.NORMAL.getStringStatus());
                break;
            case CLOSEYES:
                System.out.println(Status.CLOSEYES.getStringStatus());
                Doctor.getPilulkin().shakingVictim(dunno);
                System.out.println(Status.WAKEUP.getStringStatus());
                break;
            case WHITEFACE:
                System.out.println(Status.CLOSEYES.getStringStatus());
                Doctor.getPilulkin().shakingVictim(dunno);
                System.out.println(Status.WHITEFACE.getStringStatus());
                Doctor.getPilulkin().grabVictimHand(dunno);
                Doctor.getPilulkin().checkingVictimPulse();
                System.out.println(Status.WEAKPULSE.getStringStatus());
                Doctor.getPilulkin().listenVictimHeartbeat(dunno);
                System.out.println(Status.NOHEARTBEAT.getStringStatus());
                Doctor.getPilulkin().giveToSniffToVictim(dunno);
                dunno.victimSniffing();
                System.out.println(Status.WAKEUP.getStringStatus());
                break;
            case DEATH:
                System.out.println(Status.CLOSEYES.getStringStatus());
                Doctor.getPilulkin().shakingVictim(dunno);
                System.out.println(Status.WHITEFACE.getStringStatus());
                Doctor.getPilulkin().grabVictimHand(dunno);
                Doctor.getPilulkin().checkingVictimPulse();
                System.out.println(Status.WEAKPULSE.getStringStatus());
                Doctor.getPilulkin().listenVictimHeartbeat(dunno);
                System.out.println(Status.NOHEARTBEAT.getStringStatus());
                Doctor.getPilulkin().giveToSniffToVictim(dunno);
                dunno.victimSniffing();
                System.out.println(Status.DEATH.getStringStatus());

        }
    }
}