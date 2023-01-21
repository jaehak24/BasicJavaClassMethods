package StarategyPattern;

public class NormalStrategy implements IEncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
