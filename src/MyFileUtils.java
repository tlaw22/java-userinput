import com.tlaw.now.FooRuntimeException;

public class MyFileUtils {
    public int Subtract10(int number) throws FooRuntimeException {
        if (number < 10) {
            throw new FooRuntimeException("Error! - Get to fixing this shit");
        }
        return number - 10;
    }
}