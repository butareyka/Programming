public class Victim extends LittleMen implements Sniffing, GiveNames{
    Victim(String name, String role, String ans, int amtOfEatenPears, Status status){
        super(name, role, ans, amtOfEatenPears, status);
    }

    @Override
    public void victimSniffing(){
        System.out.println(this.name + " вдыхает нашатырь... и...");
    }

    @Override
    public String getName(){
        return this.name;
    }
}
