public interface EditOpHelper {
	/**
	 * Creates an array of edit operations that "inserts" each character of {@code s} starting at index 0 and extends to the character at index {@code endIndex - 1}.
	 *
	 * @param s        source of characters to be inserted
	 * @param endIndex position of the first character after the interval to be inserted (exclusive)
	 * @return an array of {@link EditOp}s that "inserts" each character of {@code s} starting at index 0 and extends to the character at index {@code endIndex - 1}
	 * @throws IndexOutOfBoundsException if {@code endIndex} is negative or larger than the length of {@code s}
	 */
	EditOp[] insertAll(String s, int endIndex);

	/**
	 * Creates an array of edit operations that "deletes" each character of {@code s} starting at index 0 and extends to the character at index {@code endIndex - 1}.
	 *
	 * @param s        source of characters to be deleted
	 * @param endIndex position of the first character after the interval to be deleted (exclusive)
	 * @return an array of {@link EditOp}s that "deletes" each character of {@code s} starting at index 0 and extends to the character at index {@code endIndex - 1}.
	 * @throws IndexOutOfBoundsException if {@code endIndex} is negative or larger than the length of {@code s}
	 */
	EditOp[] deleteAll(String s, int endIndex);

	/**
	 * Appends {@code e} to {@code es} in a new array.
	 *
	 * @param es the array of {@link EditOp}s to which {@code e} should be appended
	 * @param e  the {@link EditOp} to be appended to the array {@code es}
	 * @return a new array containing {es[0], es[1], ..., es[n], e}
	 */
	EditOp[] append(EditOp[] es, EditOp e);
}