package loangui;

import loanmain.LoanItem;

public interface JbiGuiController {
	public void setCurrentItem(final LoanItem pItem);
	public void setDiffed(final boolean pValue);
	public LoanItem getCurrentItem();
	public void updateEntry(final Float pAmo, final Float pTau, final Float pMon, final Float pTim);
    public void setLoanType(LoanItem.LoanType pType);
    public boolean isDiffed();
    public void updateOption(final Float pAfe, final Float pAss, final Float pNot, final Float pSal);
}
