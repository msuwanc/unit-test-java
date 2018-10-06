import models.SomeObject;

import java.util.Collections;
import java.util.List;

public class SomeObjectHelper {
    public List<SomeObject> getObjects(int id) {
        if(id < 0) {
            return Collections.emptyList();
        } else {
            return Collections.singletonList(new SomeObject(id, id));
        }
    }
}
