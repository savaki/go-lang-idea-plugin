package ro.redeul.google.go.formatter;

/**
 * Top level file formatter test cases.
 * <br/>
 * <p/>
 * Created on Dec-29-2013 22:27
 *
 * @author <a href="mailto:mtoader@gmail.com">Mihai Toader</a>
 */
public class GoStatementsFormatterTest extends GoFormatterTestCase {

  @Override
  protected String getRelativeTestDataPath() {
    return super.getRelativeTestDataPath() + "statements/";
  }

  public void testEmptyBlocks() throws Exception { _test(); }

  public void testShortVar() throws Exception { _test(); }
}
