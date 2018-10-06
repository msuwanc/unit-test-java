import models.SomeObject;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SomeObjectHelper someObjectHelper = new SomeObjectHelper();

        List<SomeObject> someObjects = someObjectHelper.getObjects(1);

        for (SomeObject someObject: someObjects) {
            System.out.println(someObject.getValue());
        }
    }
}
