import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;
import org.junit.*;

public class EditWithMinOpsPublicTest {
	// ========== SYSTEM ==========
	protected static final String EX_NAME_EditWithMinOpsNaive = "EditWithMinOpsNaive";
	protected static final String EX_NAME_EditWithMinOpsDP = "EditWithMinOpsDP";
	protected static final String CLASS_NAME_EditWithMinOpsNaive = "EditWithMinOpsNaive";
	protected static final String CLASS_NAME_EditWithMinOpsDP = "EditWithMinOpsDP";
	protected static final String METHOD_NAME_computeEditOps = "computeEditOps";
	protected static final String METHOD_NAME_getEditOps = "getEditOps";
	// --------------------

	// ========== TEST-DATA ==========
	private static final Random RND = new Random(4711_0815_666L);

	// ========== PUBLIC TEST: EX_NAME_EditWithMinOpsNaive ==========
	@Test(timeout = 666)
	public void pubTest__EditWithMinOpsNaive__Intestines__IF_THIS_VERY_IMPORTANT_TEST_FAILS_THEN_YOU_WILL_GET_NO_POINTS_AT_ALL() {
		check__Intestines(EditWithMinOpsNaive.class);
	}

	@Test(timeout = 6666)
	public void pubTest__EditWithMinOpsNaive__systematic_and_random() {
		String msg = EditWithMinOpsPublicTest.CLASS_NAME_EditWithMinOpsNaive + EditWithMinOpsPublicTest.METHOD_NAME_getEditOps + " failed: ";
		BigBrother bb_AuD_AusD = new BigBrother();
		EditWithMinOps naive_AuD_AusD = new EditWithMinOpsNaive(bb_AuD_AusD, "AuD", "AusD");
		BigBrother bb_AusD_AuD = new BigBrother();
		EditWithMinOps naive_AusD_AuD = new EditWithMinOpsNaive(bb_AusD_AuD, "AusD", "AuD");
		BigBrother bb_AuD_ARD = new BigBrother();
		EditWithMinOps naive_AuD_ARD = new EditWithMinOpsNaive(bb_AuD_ARD, "AuD", "ARD");
		BigBrother bb_sunday_saturday = new BigBrother();
		EditWithMinOps naive_sunday_saturday = new EditWithMinOpsNaive(bb_sunday_saturday, "sunday", "saturday");
		for (int pass = 0; pass < 4711; pass++) {
			assertNotNull(msg + "result is null.", naive_AuD_AusD.getEditOps());
			assertNotNull(msg + "result is null.", naive_AusD_AuD.getEditOps());
			assertNotNull(msg + "result is null.", naive_AuD_ARD.getEditOps());
			assertNotNull(msg + "result is null.", naive_sunday_saturday.getEditOps());
			assertEquals(msg + "result has wrong length.", 1, naive_AuD_AusD.getEditOps().length);
			assertEquals(msg + "result has wrong length.", 1, naive_AusD_AuD.getEditOps().length);
			assertEquals(msg + "result has wrong length.", 1, naive_AuD_ARD.getEditOps().length);
			assertEquals(msg + "result has wrong length.", 3, naive_sunday_saturday.getEditOps().length);
			assertSame(msg + "result is wrong.", EditOpType.INSERT, naive_AuD_AusD.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 2, naive_AuD_AusD.getEditOps()[0].position);
			assertEquals(msg + "result is wrong.", 's', naive_AuD_AusD.getEditOps()[0].newChar);
			assertSame(msg + "result is wrong.", EditOpType.DELETE, naive_AusD_AuD.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 2, naive_AusD_AuD.getEditOps()[0].position);
			assertSame(msg + "result is wrong.", EditOpType.REPLACE, naive_AuD_ARD.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 1, naive_AuD_ARD.getEditOps()[0].position);
			assertEquals(msg + "result is wrong.", 'R', naive_AuD_ARD.getEditOps()[0].newChar);
			assertSame(msg + "result is wrong.", EditOpType.INSERT, naive_sunday_saturday.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 1, naive_sunday_saturday.getEditOps()[0].position);
			assertEquals(msg + "result is wrong.", 'a', naive_sunday_saturday.getEditOps()[0].newChar);
			assertSame(msg + "result is wrong.", EditOpType.INSERT, naive_sunday_saturday.getEditOps()[1].type);
			assertEquals(msg + "result is wrong.", 1, naive_sunday_saturday.getEditOps()[1].position);
			assertEquals(msg + "result is wrong.", 't', naive_sunday_saturday.getEditOps()[1].newChar);
			assertSame(msg + "result is wrong.", EditOpType.REPLACE, naive_sunday_saturday.getEditOps()[2].type);
			assertEquals(msg + "result is wrong.", 2, naive_sunday_saturday.getEditOps()[2].position);
			assertEquals(msg + "result is wrong.", 'r', naive_sunday_saturday.getEditOps()[2].newChar);
			assertTrue(msg + "recursion depth is wrong.", bb_AuD_AusD.getMinStackTraceDepth(false) > 3);
			assertTrue(msg + "recursion depth is wrong.", bb_AusD_AuD.getMinStackTraceDepth(false) > 3);
			assertTrue(msg + "recursion depth is wrong.", bb_AuD_ARD.getMinStackTraceDepth(false) > 3);
			assertTrue(msg + "recursion depth is wrong.", bb_sunday_saturday.getMinStackTraceDepth(false) > 6);
		}
		for (int pass = 0; pass < 10; pass++) {
			randomTest__EditWithMinOps(false, 5, 8);
		}
	}

	// ========== PUBLIC TEST: EX_NAME_EditWithMinOpsDP ==========
	@Test(timeout = 666)
	public void pubTest__EditWithMinOpsDP__Intestines__IF_THIS_VERY_IMPORTANT_TEST_FAILS_THEN_YOU_WILL_GET_NO_POINTS_AT_ALL() {
		check__Intestines(EditWithMinOpsDP.class);
	}

	@Test(timeout = 6666)
	public void pubTest__EditWithMinOpsDP__systematic_and_random() {
		String msg = EditWithMinOpsPublicTest.CLASS_NAME_EditWithMinOpsDP + EditWithMinOpsPublicTest.METHOD_NAME_getEditOps + " failed: ";
		BigBrother bb_AuD_AusD = new BigBrother();
		EditWithMinOps dp_AuD_AusD = new EditWithMinOpsDP(bb_AuD_AusD, "AuD", "AusD");
		BigBrother bb_AusD_AuD = new BigBrother();
		EditWithMinOps dp_AusD_AuD = new EditWithMinOpsDP(bb_AusD_AuD, "AusD", "AuD");
		BigBrother bb_AuD_ARD = new BigBrother();
		EditWithMinOps dp_AuD_ARD = new EditWithMinOpsDP(bb_AuD_ARD, "AuD", "ARD");
		BigBrother bb_sunday_saturday = new BigBrother();
		EditWithMinOps dp_sunday_saturday = new EditWithMinOpsDP(bb_sunday_saturday, "sunday", "saturday");
		for (int pass = 0; pass < 4711; pass++) {
			assertNotNull(msg + "result is null.", dp_AuD_AusD.getEditOps());
			assertNotNull(msg + "result is null.", dp_AusD_AuD.getEditOps());
			assertNotNull(msg + "result is null.", dp_AuD_ARD.getEditOps());
			assertNotNull(msg + "result is null.", dp_sunday_saturday.getEditOps());
			assertEquals(msg + "result has wrong length.", 1, dp_AuD_AusD.getEditOps().length);
			assertEquals(msg + "result has wrong length.", 1, dp_AusD_AuD.getEditOps().length);
			assertEquals(msg + "result has wrong length.", 1, dp_AuD_ARD.getEditOps().length);
			assertEquals(msg + "result has wrong length.", 3, dp_sunday_saturday.getEditOps().length);
			assertSame(msg + "result is wrong.", EditOpType.INSERT, dp_AuD_AusD.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 2, dp_AuD_AusD.getEditOps()[0].position);
			assertEquals(msg + "result is wrong.", 's', dp_AuD_AusD.getEditOps()[0].newChar);
			assertSame(msg + "result is wrong.", EditOpType.DELETE, dp_AusD_AuD.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 2, dp_AusD_AuD.getEditOps()[0].position);
			assertSame(msg + "result is wrong.", EditOpType.REPLACE, dp_AuD_ARD.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 1, dp_AuD_ARD.getEditOps()[0].position);
			assertEquals(msg + "result is wrong.", 'R', dp_AuD_ARD.getEditOps()[0].newChar);
			assertSame(msg + "result is wrong.", EditOpType.INSERT, dp_sunday_saturday.getEditOps()[0].type);
			assertEquals(msg + "result is wrong.", 1, dp_sunday_saturday.getEditOps()[0].position);
			assertEquals(msg + "result is wrong.", 'a', dp_sunday_saturday.getEditOps()[0].newChar);
			assertSame(msg + "result is wrong.", EditOpType.INSERT, dp_sunday_saturday.getEditOps()[1].type);
			assertEquals(msg + "result is wrong.", 1, dp_sunday_saturday.getEditOps()[1].position);
			assertEquals(msg + "result is wrong.", 't', dp_sunday_saturday.getEditOps()[1].newChar);
			assertSame(msg + "result is wrong.", EditOpType.REPLACE, dp_sunday_saturday.getEditOps()[2].type);
			assertEquals(msg + "result is wrong.", 2, dp_sunday_saturday.getEditOps()[2].position);
			assertEquals(msg + "result is wrong.", 'r', dp_sunday_saturday.getEditOps()[2].newChar);
			assertEquals(msg + "recursion depth is wrong.", 1, bb_AuD_AusD.getMinStackTraceDepth(true));
			assertEquals(msg + "recursion depth is wrong.", 1, bb_AusD_AuD.getMinStackTraceDepth(true));
			assertEquals(msg + "recursion depth is wrong.", 1, bb_AuD_ARD.getMinStackTraceDepth(true));
			assertEquals(msg + "recursion depth is wrong.", 1, bb_sunday_saturday.getMinStackTraceDepth(true));
		}
		EditWithMinOpsPublicTest.check__EditWithMinOps(true, "", "", new EditOp[0]);
		for (int pass = 0; pass < 10; pass++) {
			randomTest__EditWithMinOps(true, 42, 128);
		}
	}

	// ========== HELPER ==========
	protected static void randomTest__EditWithMinOps(boolean useDP, int min, int max) {
		StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
		int len = min + RND.nextInt(max - min + 1);
		List<EditOp> expectedList = new LinkedList<>();
		EditOpType last = null;
		int skipped = Integer.MAX_VALUE;
		for (int i = 0; i < len; i++) {
			char c1 = (char) (33 + RND.nextInt(127 - 33)), c2; // ASCII '!'(33) - '~'(126)
			if (s1.length() > 0 && c1 == s1.charAt(s1.length() - 1)) {
				c1++;
				if (c1 > 126) {
					c1 -= 126;
				}
			}
			s1.append(c1);
			int choice = RND.nextInt(4);
			if (skipped > 2 && choice == 0 && last != EditOpType.DELETE) {
				c2 = (char) (33 + RND.nextInt(127 - 33)); // ASCII '!'(33) - '~'(126)
				s2.append(c2);
				s2.append(c1);
				expectedList.add(new EditOp(last = EditOpType.INSERT, i, c2));
				skipped = 0;
			} else if (skipped > 2 && choice == 1 && last != EditOpType.INSERT) {
				expectedList.add(new EditOp(last = EditOpType.DELETE, i));
				skipped = 0;
			} else if (skipped > 2 && choice <= 2) {
				c2 = (char) (33 + RND.nextInt(127 - 33)); // ASCII '!'(33) - '~'(126)
				s2.append(c2);
				expectedList.add(new EditOp(last = EditOpType.REPLACE, i, c2));
				skipped = 0;
			} else {
				s2.append(c1);
				skipped++;
			}
		}
		EditOp[] expected = expectedList.toArray(new EditOp[0]);
		EditWithMinOpsPublicTest.check__EditWithMinOps(useDP, s1.toString(), s2.toString(), expected);
	}

	protected static void check__EditWithMinOps(boolean useDP, String s1, String s2, EditOp[] expected) {
		String msg = EditWithMinOpsPublicTest.CLASS_NAME_EditWithMinOpsNaive + EditWithMinOpsPublicTest.METHOD_NAME_getEditOps + " failed for \u2588" + s1 + "\u2588 \u23e9 \u2588" + s2 + "\u2588:";
		BigBrother bb = new BigBrother();
		EditOp[] actual = useDP ? new EditWithMinOpsDP(bb, s1, s2).getEditOps() : new EditWithMinOpsNaive(bb, s1, s2).getEditOps();
		assertNotNull(msg + "result is null.", actual);
		for (int i = 0; i < actual.length; i++) {
			assertNotNull(msg + "result contains null entries at index " + i, actual[i]);
			if (i > 0) {
				assertTrue(msg + "result contains edit operations in wrong order at index " + (i - 1) + "/" + i, actual[i - 1].position <= actual[i].position);
			}
		}
		assertTrue(msg + "result is longer than necessary.", expected.length >= actual.length);
		StringBuilder s2check = new StringBuilder();
		int nextCharPos = 0, nextEditOp = 0;
		while (nextCharPos < s1.length() || nextEditOp < actual.length) {
			if (nextEditOp < actual.length && nextCharPos == actual[nextEditOp].position) {
				if (actual[nextEditOp].type == EditOpType.INSERT) {
					s2check.append(actual[nextEditOp].newChar);
				} else if (actual[nextEditOp].type == EditOpType.DELETE) {
					nextCharPos++;
				} else if (actual[nextEditOp].type == EditOpType.REPLACE) {
					s2check.append(actual[nextEditOp].newChar);
					nextCharPos++;
				}
				nextEditOp++;
			} else if (nextCharPos < s1.length()) {
				s2check.append(s1.charAt(nextCharPos));
				nextCharPos++;
			} else {
				fail(msg + "result contains weird edit operation sequence => could rebuild only \u2588" + s2 + "\u2588 so far.");
			}
		}
		assertEquals(msg + "result cannot reproduce second string.", s2, s2check.toString());
		assertEquals(msg + "recursion depth is wrong.", useDP ? 1 : Math.min(s1.length(), s2.length()) + 1, bb.getMinStackTraceDepth(useDP));
	}

	// ========== HELPER: Intestines ==========
	// @AuD-STUDENT: DO NOT USE REFLECTION IN YOUR OWN SUBMISSION!
	private static Class<?>[] getDeclaredClasses(Class<?> clazz) {
		java.util.List<Class<?>> declaredClasses = new java.util.ArrayList<>();
		for (Class<?> c : clazz.getDeclaredClasses()) {
			if (!c.isSynthetic()) {
				declaredClasses.add(c);
			}
		}
		return declaredClasses.toArray(new Class[0]);
	}

	private static Field[] getDeclaredFields(Class<?> clazz) {
		java.util.List<Field> declaredFields = new java.util.ArrayList<>();
		for (Field f : clazz.getDeclaredFields()) {
			if (!f.isSynthetic()) {
				declaredFields.add(f);
			}
		}
		return declaredFields.toArray(new Field[0]);
	}

	private static Constructor<?>[] getDeclaredConstructors(Class<?> clazz) {
		java.util.List<Constructor<?>> declaredConstructors = new java.util.ArrayList<>();
		for (Constructor<?> c : clazz.getDeclaredConstructors()) {
			if (!c.isSynthetic()) {
				declaredConstructors.add(c);
			}
		}
		return declaredConstructors.toArray(new Constructor[0]);
	}

	private static Method[] getDeclaredMethods(Class<?> clazz) {
		java.util.List<Method> declaredMethods = new java.util.ArrayList<>();
		for (Method m : clazz.getDeclaredMethods()) {
			if (!m.isBridge() && !m.isSynthetic()) {
				declaredMethods.add(m);
			}
		}
		return declaredMethods.toArray(new Method[0]);
	}

	private void check__Intestines(Class<?> clazz) {
		assertTrue(clazz + " must be public!", Modifier.isPublic(clazz.getModifiers()));
		assertFalse(clazz + " must not be abstract!", Modifier.isAbstract(clazz.getModifiers()));
		assertFalse(clazz + " must not be an annotation!", clazz.isAnnotation());
		assertFalse(clazz + " must not be an enumeration!", clazz.isEnum());
		assertFalse(clazz + " must not be an interface!", clazz.isInterface());
		assertSame(clazz + " must extend a certain super-class!", EditWithMinOps.class, clazz.getSuperclass());
		assertEquals(clazz + " must implement a certain number of interfaces!", 0, clazz.getInterfaces().length);
		assertEquals(clazz + " must declare a certain number of inner annotations!", 0, clazz.getDeclaredAnnotations().length);
		assertEquals(clazz + " must declare a certain number of inner classes!", 0, getDeclaredClasses(clazz).length);
		Field[] fields = getDeclaredFields(clazz);
		assertEquals(clazz + " must declare a certain number of fields!", 0, fields.length);
		Constructor<?>[] constructors = getDeclaredConstructors(clazz);
		assertEquals(clazz + " must declare a certain number of constructors (possibly including default constructor)!", 1, constructors.length);
		for (Constructor<?> constructor : constructors) {
			assertTrue(constructor + " - constructor must be public!", Modifier.isPublic(constructor.getModifiers()));
			assertEquals(constructor + " - constructor must have a certain number of parameters!", 3, constructors[0].getParameterTypes().length);
		}
		Method[] methods = getDeclaredMethods(clazz);
		assertEquals(clazz + " must declare a certain number of methods!", 1, methods.length);
	}

	// ========== Big Brother ==========
	private static final class BigBrother implements EditOpHelper {
		private final LinkedList<Integer> stackTraceLogNaive = new LinkedList<>(), stackTraceLogDP = new LinkedList<>();

		@Override
		public EditOp[] insertAll(String s, int to) {
			log();
			EditOp[] r = new EditOp[to];
			for (int i = 0; i < to; i++) {
				r[i] = new EditOp(EditOpType.INSERT, 0, s.charAt(i));
			}
			return r;
		}

		@Override
		public EditOp[] deleteAll(String s, int to) {
			log();
			EditOp[] r = new EditOp[to];
			for (int i = 0; i < to; i++) {
				r[i] = new EditOp(EditOpType.DELETE, i);
			}
			return r;
		}

		private void log() {
			int stackDepthNaive = 0, stackDepthDP = 0;
			StackTraceElement[] st = Thread.currentThread().getStackTrace();
			for (StackTraceElement ste : st) {
				if (ste.getClassName().equals(EditWithMinOpsPublicTest.CLASS_NAME_EditWithMinOpsNaive)) {
					if (ste.getMethodName().equals(EditWithMinOpsPublicTest.METHOD_NAME_computeEditOps)) {
						stackDepthNaive++;
					}
				}
				if (ste.getClassName().equals(EditWithMinOpsPublicTest.CLASS_NAME_EditWithMinOpsDP)) {
					if (ste.getMethodName().equals(EditWithMinOpsPublicTest.METHOD_NAME_computeEditOps)) {
						stackDepthDP++;
					}
				}
			}
			stackTraceLogNaive.add(stackDepthNaive);
			stackTraceLogDP.add(stackDepthDP);
		}

		private int getMinStackTraceDepth(boolean useDP) {
			boolean first = true;
			int min = 0;
			for (Integer i : useDP ? stackTraceLogDP : stackTraceLogNaive) {
				min = (first || i < min) ? i : min;
				first = false;
			}
			return min;
		}

		@Override
		public EditOp[] append(EditOp[] es, EditOp e) {
			if (es == null) {
				return new EditOp[]{e};
			}
			EditOp[] r = Arrays.copyOf(es, es.length + 1);
			r[r.length - 1] = e;
			return r;
		}
	}
}