package ProxyPattern.้ๆไปฃ็;

public class Main01 {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy01 proxy = new Proxy01(host);
        proxy.rent();
    }
}
