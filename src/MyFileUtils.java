
public class MyFileUtils {
    public int Subtract10(int number) throws Exception{
        if(number < 10){
            throw new Exception("Error!");
        }
        return number - 10;
    }    
}