package Estrategy;

public class Controler {
    private Service<?> service;

    public Controler() {
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
