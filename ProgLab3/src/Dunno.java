import java.lang.annotation.Repeatable;

public class Dunno extends LittleMen implements Sniffing, GiveNames{
    Dunno(String name, String role, String ans, int amtOfEatenPears, Status status){
        super(name, role, ans, amtOfEatenPears, status);
    }

    @Override
    public void victimSniffing(String name){
        System.out.println(name + " вдыхает нашатырь... и...");
    }

    @Override
    public String getName(){
        return this.name;
    }
}
