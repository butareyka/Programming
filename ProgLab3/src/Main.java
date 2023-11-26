import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество съеденных груш Незнайкой: ");
        Scanner scanner = new Scanner(System.in);
        int amountOfPears = scanner.nextInt();

        Dunno pers1 = new Dunno("Dunno", "Пострадавший", "Ел груши", amountOfPears, Status.NOSTATUS);
        Pilulkin pers2 = new Pilulkin("Pilulkin","Доктор", "Не ел груши");
        
        String name1 = pers1.getName();
        String name2 = pers2.getName();

        if (pers1.getAmtOfEatenPears() > 0){
            switch (pers1.getAmtOfEatenPears()){
                case 0:
                    pers1.setStatus(Status.HUNGRY);
                    break;
                case 1,2,3,4:
                    pers1.setStatus(Status.NORMAL);
                    break;
                case 5,6,7:
                    pers1.setStatus(Status.CLOSEYES);
                    break;
                case 8,9,10,11:
                    pers1.setStatus(Status.WHITEFACE);
                    break;
                default:
                    pers1.setStatus(Status.DEATH);
                    break;
            }
        }
        else{
            System.out.println("О нет! Ты кушаешь негативные груши!");
        }


        switch (pers1.getStatus()){
            case HUNGRY:
                System.out.println(Status.HUNGRY.getStringStatus());
                break;
            case NORMAL:
                System.out.println(Status.NORMAL.getStringStatus());
                break;
            case CLOSEYES:
                System.out.println(Status.CLOSEYES.getStringStatus());
                pers2.shakingVictim(name2, name1);
                System.out.println(Status.WAKEUP.getStringStatus());
                break;
            case WHITEFACE:
                System.out.println(Status.CLOSEYES.getStringStatus());
                pers2.shakingVictim(name2, name1);
                System.out.println(Status.WHITEFACE.getStringStatus());
                pers2.grabVictimHand(name2, name1);
                pers2.checkingVictimPulse();
                System.out.println(Status.WEAKPULSE.getStringStatus());
                pers2.listenVictimHeartbeat(name2, name1);
                System.out.println(Status.NOHEARTBEAT.getStringStatus());
                pers2.giveToSniffToVictim(name2, name1);
                pers1.victimSniffing(name1);
                System.out.println(Status.WAKEUP.getStringStatus());
                break;
            case DEATH:
                System.out.println(Status.CLOSEYES.getStringStatus());
                pers2.shakingVictim(name2, name1);
                System.out.println(Status.WHITEFACE.getStringStatus());
                pers2.grabVictimHand(name2, name1);
                pers2.checkingVictimPulse();
                System.out.println(Status.WEAKPULSE.getStringStatus());
                pers2.listenVictimHeartbeat(name2, name1);
                System.out.println(Status.NOHEARTBEAT.getStringStatus());
                pers2.giveToSniffToVictim(name2, name1);
                pers1.victimSniffing(name1);
                System.out.println(Status.DEATH.getStringStatus());

        }
    }
}