package Observer;

public class Button {
    private String name;
    IButtonListener buttonListener;

    public Button(String name){
        this.name=name;
    }

    //옵저버 패턴은 다음과 같이 인터페이스이스
    public void click(String message){
        buttonListener.clickEvent(message);

    }

    public void addButtonListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
