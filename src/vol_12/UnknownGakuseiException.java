package vol_12;

public class UnknownGakuseiException extends RuntimeException{
    public UnknownGakuseiException() {
        super("不正な学籍番号");
    }
}
