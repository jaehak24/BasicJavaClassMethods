package StarategyPattern;

public class Encoder {
    //그때그때마다 전략을 주입받아야 함
    private IEncodingStrategy encodingStrategy;

    public String getMessage(String msg){
        return this.encodingStrategy.encode(msg);
    }
    public void setEncodingStrategy(IEncodingStrategy encodingStrategy){
        this.encodingStrategy=encodingStrategy;
    }
}
