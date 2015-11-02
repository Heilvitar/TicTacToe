import junit.framework.Test;
import junit.framework.TestSuite;

public class SeleniumTest {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(Player1Turn.class);
    suite.addTestSuite(Player2Turn.class);
    suite.addTestSuite(ScroogeShow.class);
    suite.addTestSuite(ThiefShow.class);
    suite.addTestSuite(Player1Win.class);
    suite.addTestSuite(Player2Win.class);
    suite.addTestSuite(Tie.class);
    suite.addTestSuite(ResetGame.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
