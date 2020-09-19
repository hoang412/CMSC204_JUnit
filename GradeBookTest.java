import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1, g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(20);
		g1.addScore(71);
		g1.addScore(90);
		
		g2.addScore(55);
		g2.addScore(49);
		g2.addScore(100);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		
		assertEquals(3, g1.getScoreSize(), .001);
		assertEquals(3, g2.getScoreSize(), .001);
		
		
	}

	@Test
	void testSum() {
		assertEquals(181, g1.sum(), .0001);
		assertEquals(204, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(20, g1.minimum(), .001);
		assertEquals(49, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(161, g1.finalScore(), .001);
		assertEquals(155, g2.finalScore(), .001);
	}

	@Test
	void testToString() {
	assertTrue(g2.toString().equals("55.0 49.0 100.0"));
	assertTrue(g1.toString().equals("20.0 71.0 90.0"));
	}

}
