package serverwofacade;

public class ServerWFacade {
    public static void main(String[] args) {
        ScheduleServerFacade facadeServer = new ScheduleServerFacade();
        facadeServer.StartServer();
        System.out.println("----Server has been started----");
        facadeServer.StopServer();
        System.out.println("----Server has been stoped----");
    }
}