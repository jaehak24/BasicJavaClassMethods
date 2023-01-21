import FacadePattern.Ftp;
import FacadePattern.Reader;
import FacadePattern.SftpClient;
import FacadePattern.Writer;
import Observer.Button;
import Observer.IButtonListener;
import StarategyPattern.*;

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

        //Browser browser=new Browser("www.naver.com");
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


        /*AOP 일괄적으로 한 패키지에 있는 메소드들을 불러올 수 있는 형태


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
        */

        /* decorator 클래스 사용
        ICar audi=new Audi(1500);
        audi.showPrice();

        //각각의 등급을 설정

        //a3
        ICar audi3=new A3(audi,"A3");
        audi3.showPrice();

        //a4
        ICar audi4=new A4(audi,"A4");
        audi4.showPrice();
        //a5
        ICar audi5=new A5(audi,"A5");
        audi5.showPrice();
        */

        //Observer Pattern 연습
        /*
        Button button=new Button("버튼");
        button.addButtonListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event); //이벤트가 생기면 전달받는 형태
            }
        });

        button.click("메시지 전달: click 1");
        button.click("메시지 전달: click 2");
        button.click("메시지 전달: click 3");
         */

        //Facade 패턴 연습
        /*
        Facade를 적용하지 않은 코드
        //클라이언트 생성

        Ftp ftpClient=new Ftp("www.naver.com",8080, "/home/etc" );
        ftpClient.connect();
        ftpClient.moveDirectory();



        //파일을 읽어오기
        Reader reader=new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();


        //파일을 쓰기
        Writer writer=new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite();

        //모든 연결 종료
        reader.fileDisConnect();
        writer.fileDisconnect();
        ftpClient.disconnect();

        //다음과 같이 간결한 코드로 변경
        SftpClient sftpClient=new SftpClient("www.fow.kr",2020,"/home/etc","test.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();

        */
        Encoder encoder=new Encoder();

        //base64 전략
        IEncodingStrategy base64=new Base64Strategy();

        //normal
        IEncodingStrategy normal=new NormalStrategy();

        //append
        IEncodingStrategy append=new AppendStrategy();

        String msg="Hello world";

        encoder.setEncodingStrategy(base64);
        String base64result=encoder.getMessage(msg);
        System.out.println(base64result);

        encoder.setEncodingStrategy(normal);
        String normalResult=encoder.getMessage(msg);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(append);
        String appendResult=encoder.getMessage(msg);
        System.out.println(appendResult);



    }

    /*220 콘센트
    public static void  powerON(Elect_220v elect220v){
        elect220v.connect();
    }
    */

    /*110 콘센트
    public static void connect(Elect_110v elect_110v){
        elect_110v.powerOn();
    }

     */


}