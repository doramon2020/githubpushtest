package homework;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTest {
	private String str;
	private String haha;
	private First test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		test = new First();
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public void testSumIntInt() {
		int result = test.sum(-1, 1);
		assertEquals(0,result);
	}

	@Test
	public void testSumIntFloat() {
		float result = test.sum(-1, 1.0f);
		assertEquals(0,result,0.0001);//0.0001為可接受誤差
	}

	@Test
	public void testSumFloatFloat() {
		float result = test.sum(-1.0f, 1.0f);
		assertEquals(0,result,0.0001);
	}

	@Test
	public void testDozen() {
		int[] result = test.dozen(15);
		int dozen = result[0];
		int notdozen = result[1];
		assertEquals(1,dozen);
		assertEquals(3,notdozen);
	}

	@Test
	public void testTimeout() {
		int[] result = test.timeout(-1);
		int day = result[0];
		int hour = result[1];
		int min = result[2];
		int sec = result[3];
		int[] ans= {};
		assertArrayEquals(result,ans);
		
	}

	@Test
	public void testArea() {
		double area = test.area(5.0)[0];
		double circumference = test.area(5.0)[1];
		assertEquals(area,78.375,1);
		assertEquals(circumference,31.415,0.01);
	}

	@Test
	public void testSavemoney() {
		double result = test.savemoney(1000000);
		assertEquals(1221199.43,result,0.001);
	}
}
