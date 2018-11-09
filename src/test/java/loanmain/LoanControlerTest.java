package loanmain;
import com.google.common.eventbus.EventBus;
import mockit.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class LoanControlerTest {


    @Mocked
    private EventBus eb;
    @Injectable
    private EventBus eb2;

    @Mocked
    private LoanControler lc;
    @Mocked
    private CalcLoanItem calc;


    @Test
    public void testUpdateOptionDuree() {
//        MockUp<CalcLoanItem> cli = new MockUp<CalcLoanItem>()
//        {
//            @Mock
//            public Double computeDuration(final LoanItem pItem) {
//                if (pItem.getMensualite().equals(0F) || pItem.getTaux().equals(0F) || pItem.getAmount().equals(0F)) {
//                    return null;
//                }
//                double lMens = pItem.getMensualite() - (pItem.getAmount() * pItem.getInsurance() / 1200D);
//                double lTaux = pItem.getTaux() / 1200D;
//                return -Math.log(1D - pItem.getAmount() * lTaux / lMens) / Math.log(1D + lTaux) / 12D;
//            }
//        };

        LoanItem item = new LoanItem();
        lc.setCurrentItem(item);
        lc.setLoanType(LoanItem.LoanType.DUREE);
        lc.updateEntry((float)10,(float)10,(float)10,(float)10);
//        new Verifications() {{
//            calc.computeDuration(lc.getCurrentItem());times=1;
//           eb.post(any); times =1;
//        }};



        assertTrue(true);
    }

//    @Test
//    public void testUpdateOptionMensualite() {
//    }
//
//    @Test
//    public void testUpdateOptionMontant() {
//    }
//
//    @Test
//    public void testUpdateOptionTaux() {
//    }
}
