import models.SomeObject;
import org.junit.Test;

import java.util.Collections;

import static junit.framework.TestCase.assertSame;

public class SomeObjectHelperTest {
    SomeObjectHelper someObjectHelper = new SomeObjectHelper();

    @Test
    public void getObjectsWithValidIdShouldReturnListOfThatObject() {
        assertSame(someObjectHelper.getObjects(1).get(0).getValue(), Collections.singletonList(new SomeObject(1, 1)).get(0).getValue());
    }

    @Test
    public void getObjectsWithInvalidIdShouldReturnEmptyList() {
        assertSame(someObjectHelper.getObjects(-1), Collections.<SomeObject>emptyList());
    }
}
