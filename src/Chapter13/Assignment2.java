package Chapter13;

public class Assignment2 {
    public static void main(String[] args) {
        CellPhone testPhone = new CellPhone();
        testPhone.setModelName("NEXUS ONE");
        testPhone.setManufacturer("HTC");
        testPhone.setColor("Black");
        testPhone.setCamera("장착");
        testPhone.setPower(true);

        System.out.println("모델명 : " + testPhone.getModelName());
        System.out.println("제조사 : " + testPhone.getManufacturer());
        System.out.println("색상 : " + testPhone.getColor());
        System.out.println("카메라 장착여부 : " + testPhone.getCamera());
        System.out.println("전원 : " + testPhone.isPower());
    }
}

class CellPhone {
    private String modelName;
    private String manufacturer;
    private String color;
    private String camera;
    private boolean power;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
