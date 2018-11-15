package loanmain;
import com.google.common.eventbus.EventBus;
import mockit.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class LoanControlerTest {

    @Mocked
    private EventBus eb;

//    @Mocked
//    private LoanControler lc;

    @Mocked
    private CalcLoanItem calc;

    @Test
    public void testUpdateOptionDuree() {

        LoanItem item = new LoanItem();
        LoanControler lc = new LoanControler(eb);
        lc.setCurrentItem(item);
        lc.setLoanType(LoanItem.LoanType.DUREE);
        lc.updateEntry((float)10,(float)10,(float)10,(float)10);

        new Verifications() {{
            calc.computeDuration(lc.getCurrentItem());times=1;
            calc.computeMensHorsAss(lc.getCurrentItem());times=0;
            calc.computeAmount(lc.getCurrentItem());times=0;
            calc.computeRate(lc.getCurrentItem());times=0;
            eb.post((ChangeEvent) any);times =1;
        }};
    }

    @Test
    public void testUpdateOptionMensualite() {
        LoanItem item = new LoanItem();
        LoanControler lc = new LoanControler(eb);
        lc.setCurrentItem(item);
        lc.setLoanType(LoanItem.LoanType.MENSUALITE);
        lc.updateEntry((float)10,(float)10,(float)10,(float)10);

        new Verifications() {{
            calc.computeDuration(lc.getCurrentItem());times=0;
            calc.computeMensHorsAss(lc.getCurrentItem());times=1;
            calc.computeAmount(lc.getCurrentItem());times=0;
            calc.computeRate(lc.getCurrentItem());times=0;
            //eb.post(any); times =1;
            eb.post((ChangeEvent) any);times =1;
        }};
    }

    @Test
    public void testUpdateOptionMontant() {
        LoanItem item = new LoanItem();
        LoanControler lc = new LoanControler(eb);
        lc.setCurrentItem(item);
        lc.setLoanType(LoanItem.LoanType.MONTANT);
        lc.updateEntry((float)10,(float)10,(float)10,(float)10);

        new Verifications() {{
            calc.computeDuration(lc.getCurrentItem());times=0;
            calc.computeMensHorsAss(lc.getCurrentItem());times=0;
            calc.computeAmount(lc.getCurrentItem());times=1;
            calc.computeRate(lc.getCurrentItem());times=0;
            eb.post((ChangeEvent) any);times =1;
        }};
    }

    @Test
    public void testUpdateOptionTaux() {
        LoanItem item = new LoanItem();
        LoanControler lc = new LoanControler(eb);
        lc.setCurrentItem(item);
        lc.setLoanType(LoanItem.LoanType.TAUX);
        lc.updateEntry((float)10,(float)10,(float)10,(float)10);

        new Verifications() {{
            calc.computeDuration(lc.getCurrentItem());times=0;
            calc.computeMensHorsAss(lc.getCurrentItem());times=0;
            calc.computeAmount(lc.getCurrentItem());times=0;
            calc.computeRate(lc.getCurrentItem());times=1;
            eb.post((ChangeEvent) any);times =1;
        }};
    }
}
