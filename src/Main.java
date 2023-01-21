import AOP.AOPBrowser;
import adapter.*;
import proxy.Browser;
import proxy.BrowserProxy;
import proxy.IBrowser;
import singleton.Aclazz;
import singleton.Bclazz;
import singleton.SocketClient;

import java.lang.ref.Cleaner;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args)



    {
        /* singleton practice
        Aclazz aclazz=new Aclazz();
        Bclazz bclazz=new Bclazz();

        SocketClient aClient=aclazz.getSocketClient();
        SocketClient bClient=bclazz.getSocketClient();


        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

         */

        /*adapter 클래스 연습
        HairDryer hairDryer=new HairDryer();

        Vaccume vaccume=new Vaccume();
        //connect(vaccume);--> 110v이 아니라 불가
        Elect_110v adapter=new SocketAdapter(vaccume); // -> 선언 시 바로 해당 클래스를 호출 하는 것이 아닌 adapter클래스를 활용해서 변환 후 초기화
        connect(adapter);

        //실습 내용 220v-> 110v 로 변환
        AirConditioner airConditioner=new AirConditioner();
        Elect_220v adapter2=new SocketAdapter(airConditioner);
        powerON(airConditioner);
        powerON(adapter2);
*/

        Browser browser=new Browser("www.naver.com");
/*
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        Browser loading html from: www.naver.com
        Browser loading html from: www.naver.com
        Browser loading html from: www.naver.com
        Browser loading html from: www.naver.com*/

        /*프록시를 통한 호출
        IBrowser browser1=new BrowserProxy("www.naver.com");
        browser1.show();
        browser1.show();browser1.show();browser1.show();

         */


        //AOP 일괄적으로 한 패키지에 있는 메소드들을 불러올 수 있는 형태


        //시간 체크를 위해서
        AtomicLong start=new AtomicLong();
        AtomicLong end=new AtomicLong();


        IBrowser browser2=new AOPBrowser("www.google.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis()); //현재의 시간을 입력
                },
                ()->{
                    long now=System.currentTimeMillis();
                    end.set(now-start.get()); //종료된 시간을 가져옴

                }
                );

        browser2.show(); //첫번째는 1.5초가 걸리고
        System.out.println(end.get());

        browser2.show(); //두번째는 이미 캐쉬에 저장되어 있으므로 0초가 걸린다.
        System.out.println(end.get());


    }

    //220 콘센트
    public static void  powerON(Elect_220v elect220v){
        elect220v.connect();
    }
    //110 콘센트
    public static void connect(Elect_110v elect_110v){
        elect_110v.powerOn();
    }


}