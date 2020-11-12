package ayoboga.com;

public class Test {
    private long visibleOnlyInThisClass;
    double visibleFromEntirePackage;

    void setLong (long val) {
        visibleOnlyInThisClass = val;
    }

    long getLong () {
        return visibleOnlyInThisClass;
    }
}
