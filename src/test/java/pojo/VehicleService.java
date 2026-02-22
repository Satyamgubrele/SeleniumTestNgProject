package pojo;

public class VehicleService {

    private int serviceId;
    private String vehicleNumber;
    private String ownerName;
    private String serviceType;
    private boolean serviceComplete;

    public VehicleService(int serviceId, String vehicleNumber, String ownerName, String serviceType, boolean serviceComplete) {
        this.serviceId = serviceId;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.serviceType = serviceType;
        this.serviceComplete = serviceComplete;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isServiceComplete() {
        return serviceComplete;
    }

    public void setServiceComplete(boolean serviceComplete) {
        this.serviceComplete = serviceComplete;
    }
}
