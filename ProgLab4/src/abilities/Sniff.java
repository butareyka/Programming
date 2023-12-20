package abilities;
import exceptions.CheckMedicalException;
import exceptions.CreatingAnotherCopyException;
import persons.*;

public interface Sniff{
    void giveToSniffToVictim(Victim dunno) throws CreatingAnotherCopyException, CheckMedicalException;
}
