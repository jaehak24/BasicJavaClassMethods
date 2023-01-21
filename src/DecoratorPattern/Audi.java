package DecoratorPattern;


//데코레이더 클래스의 뼈대가 되는 부분
public class Audi implements ICar{

    private int price;



    public Audi(int cost){
        this.price=cost;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("Audi의 가격은 "+this.price);


    }
}
