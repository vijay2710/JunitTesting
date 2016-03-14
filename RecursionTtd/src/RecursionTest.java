import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursionTest {
@Test
public void factorial1() {
	Factorial f = new Factorial();
	int result = f.calculate(0);
	assertEquals(1, result);
}
@Test
public void factorial2() {
	Factorial f = new Factorial();
	int result = f.calculate(0);
	assertEquals(2, result);
}
@Test
public void factorial3() {
	Factorial f = new Factorial();
	int result = f.calculate(0);
	assertEquals(6, result);
}
}
