public abstract class EditWithMinOps {
	protected final EditOpHelper eoh; // the helper object providing some helpful methods
	protected final String s1, s2; // the input
	private final EditOp[] editOps; // the output (transforms s1 =to=> s2)

	public EditWithMinOps(EditOpHelper eoh, String s1, String s2) {
		this.eoh = eoh;
		this.s1 = s1;
		this.s2 = s2;
		editOps = computeEditOps(s1.length(), s2.length());
	}

	/**
	 * Computes the shortest sequence of editing operations transforming {@link #s1} into {@link #s2}.
	 *
	 * @param m the current character index within {@link #s1} (computation starts at the end of the string!)
	 * @param n the current character index within {@link #s2} (computation starts at the end of the string!)
	 * @return an array of {@link EditOp}s transforming {@link #s1} into {@link #s2}
	 */
	protected abstract EditOp[] computeEditOps(int m, int n);

	public final EditOp[] getEditOps() {
		return editOps;
	}
}