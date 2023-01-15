package vol_12;

public class Shinkyu {

    public void moveUp(String gakuseki) {
        if (gakuseki.length() != 8) {
            throw new UnknownGakuseiException();
        }
        // move up student to next degree.
    }

}
