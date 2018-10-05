/*
 * Components that are interested in LoanItem differenciations should implement this interface.
 */
package loanmain;

import java.util.EventObject;

/**
 * Components that are interested in LoanItem changes should implement this interface.
 *
 * @author jean-blas imbert
 */
public class DiffEvent extends EventObject {
    /**
     * Function should be fired when the item has changed
     *
     * @param pItem the changed item
     */
	private LoanItem _pItem1;
	private LoanItem _pItem2;
	
	public DiffEvent(Object source, LoanItem pItem1, LoanItem pItem2) {
        super(source);
        this._pItem1 = pItem1;
        this._pItem2 = pItem2;
    }
	
	public LoanItem GetpItem1()
	{
		return _pItem1;
	}
	public LoanItem GetpItem2()
	{
		return _pItem2;
	}
	//void itemDiffed(final LoanItem pItem1, final LoanItem pItem2);
}