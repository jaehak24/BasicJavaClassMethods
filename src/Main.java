import adapter.*;
import singleton.Aclazz;
import singleton.Bclazz;
import singleton.SocketClient;

import java.lang.ref.Cleaner;

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

        //adapter 클래스 연습
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