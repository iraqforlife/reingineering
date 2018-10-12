/*
 * Components that are interested in LoanItem changes should implement this interface.
 */
package loanmain;
import java.util.EventObject;

/**
 * Components that are interested in LoanItem changes should implement this interface.
 *
 * @author jean-blas imbert
 */
@SuppressWarnings("serial")
public class ChangeEvent extends EventObject {
    /**
     * Function should be fired when the item has changed
     *
     * @param pItem the changed item
     */
	private LoanItem _LoanItem;
	
	public ChangeEvent(Object source, LoanItem loanItem) {
        super(source);
        this._LoanItem = loanItem;
    }
	
	public LoanItem GetLoadItem()
	{
		return _LoanItem;
	}
	//void itemChanged(final LoanItem pItem)
}
