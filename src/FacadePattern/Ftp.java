package FacadePattern;

public class Ftp {

    private String host;

    private int port;

    private String path;

    public Ftp(String host,int port, String path){
        this.host=host;
        this.path=path;
        this.port=port;
    }

    public void connect(){
        System.out.println("FTP Host: "+host+"PORT NO- "+port+" 로 연결합니다.");

    }
    public void moveDirectory(){
        System.out.println("FTP Path: "+path+"로 이동합니다.");
    }


    public void disconnect(){
        System.out.println("FTP 연결을 종료합니다.");
    }

}
