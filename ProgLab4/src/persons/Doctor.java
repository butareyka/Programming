package persons;

import abilities.*;
import enums.*;
import exceptions.CheckMedicalException;

public class Doctor extends LittleMen implements Heartbeat, Sniff, TryingToWake, GiveNames {
    private static final Doctor pilulkin = new Doctor("Pilulkin","Доктор", "Не ел груши");
    private Doctor(String name, String role, String ans){
        super(name, role, ans);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void shakingVictim(Victim dunno){
        System.out.println(this.name + " трясет " + dunno.name + " за плечо");
    }

    @Override
    public void grabVictimHand(Victim dunno){
        System.out.print(this.name + " хватает " + dunno.name + " за руку ");
    }

    @Override
    public void checkingVictimPulse(){
        System.out.println("и проверяет пульс");
    }

    @Override
    public void listenVictimHeartbeat(Victim dunno){
        System.out.println(this.name + " слушает сердцебиение " + dunno.name);

    }

    @Override
    public void giveToSniffToVictim(Victim dunno) throws CheckMedicalException {
        class SniffingObject {
            final String medical = Medical.NASHATR.getMedical();
        }
        SniffingObject sniffingMedical = new SniffingObject();
        if (sniffingMedical.medical != null) {
            System.out.println(this.name + " решает дать " + dunno.name + " понюхать " + sniffingMedical.medical);
        }
        else{
            throw new CheckMedicalException();
        }
    }

    public static Doctor getPilulkin(){
        return pilulkin;
    }
}
