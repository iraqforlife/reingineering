package loanmain;

import com.google.common.eventbus.EventBus;
import mockit.*;
import mockit.integration.junit4.JMockit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.*;

//@RunWith(JMockit.class)
public class LoanControlerTest {

    @Mocked
    private CalcLoanItem cli;

    @Mocked
    private EventBus eb;
    @Injectable
    private EventBus eb2;
    @Tested
    private LoanControler lc;

    @Test
    public void testUpdateOptionDuree() {
        //lc = new LoanControler(eb);
        lc.setLoanType(LoanItem.LoanType.DUREE);
        lc.updateEntry((float)10,(float)10,(float)10,(float)10);
        new Verifications() {{
            cli.computeDuration(lc.getCurrentItem());times=1;
           eb.post(any); times =1;
        }};
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