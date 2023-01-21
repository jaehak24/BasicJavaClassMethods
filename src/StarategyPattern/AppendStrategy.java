package StarategyPattern;

public class AppendStrategy implements IEncodingStrategy{

    @Override
    public String encode(String text) {
        return "abc"+text;
    }
}
