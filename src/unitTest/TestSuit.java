package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   ButtonTest.class,
   LightbulbTest.class,
   PushdownButtonTest.class
})
public class TestSuit {

}
