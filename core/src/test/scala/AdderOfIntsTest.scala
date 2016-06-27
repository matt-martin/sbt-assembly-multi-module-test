import org.junit.Test

class AdderOfIntsTest {
  @Test
  def testAddition() = {
    org.junit.Assert.assertEquals(3, AdderOfInts(1, 2).addTheInts())
  }
}
