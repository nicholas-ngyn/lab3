import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {10, 100, 1000};
    ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{1000,100,10}, input2);
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {6.0, 10.0, 3.0};
    double result = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(8.0, result, 0.0);
  }
}
