public class Pilulkin extends LittleMen implements Heartbeat, Sniff, TryingToWake, GiveNames{
    Pilulkin(String name, String role, String ans){
        super(name, role, ans);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void shakingVictim(String name1, String name2){
        System.out.println(name1 + " трясет " + name2 + " за плечо");
    }

    @Override
    public void grabVictimHand(String name1, String name2){
        System.out.print(name1 + " хватает " + name2 + " за руку ");
    }

    @Override
    public void checkingVictimPulse(){
        System.out.println("и проверяет пульс");
    }

    @Override
    public void listenVictimHeartbeat(String name1, String name2){
        System.out.println(name1 + " слушает сердцебиение " + name2);

    }

    @Override
    public void giveToSniffToVictim(String name1, String name2){
        System.out.println(name1 + " решает дать " + name2 + " понюхать нашатырь ");
    }
}
