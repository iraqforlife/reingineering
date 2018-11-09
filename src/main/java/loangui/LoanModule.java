package loangui;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;

import loanmain.LoanControler;


public class LoanModule extends AbstractModule {

    private EventBus eventBus = new EventBus();
    
	@Override
	protected void configure() {
		/*
		 * Use get instance will always return the same instance
		 * in this case we will create loancontroller 
		 * it will use the instance of eventbus right here
		 * Where we will create loanFram, we will use the same instance
		 * 
		 */
		bind(EventBus.class).toInstance(eventBus);
		//bind interfacer to concreat class.
		bind(JbiGuiController.class).to(LoanControler.class);
	}
}
