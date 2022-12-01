public class EditOp {
	public final EditOpType type;
	public final int position;
	public final char newChar; // for insert or replace only

	public EditOp(EditOpType type, int position) {
		this.type = type;
		this.position = position;
		this.newChar = 0;
	}

	public EditOp(EditOpType type, int position, char newChar) {
		this.type = type;
		this.position = position;
		this.newChar = newChar;
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof EditOp && this.type.equals(((EditOp) other).type) && this.position == ((EditOp) other).position && this.newChar == ((EditOp) other).newChar;
	}

	@Override
	public int hashCode() {
		return (type.toString() + position + newChar).hashCode();
	}

	@Override
	public String toString() {
		return type + "(" + position + (newChar != 0 ? "," + newChar : "") + ")";
	}
}