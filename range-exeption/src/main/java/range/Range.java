package range;

public class Range {
private static final String ERROR_MESSAGE = "max less or equal";
private int min;
private int max;
private Range(int min, int max) {
    this.min = min;
    this.max = max;
}
public static Range getRange (int min, int max) {
    if ( (max <= min)) {
        throw new IllegalArgumentException(ERROR_MESSAGE);

    }
return new Range(min, max);
}


}
