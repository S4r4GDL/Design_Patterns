package Strategy;

public class Controller {
    private Service<?> service;

    public Controller() {
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
