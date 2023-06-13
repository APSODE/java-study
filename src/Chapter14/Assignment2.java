package Chapter14;

public class Assignment2 {
    public static void main(String[] args) {
        CellPhone test1 = new CellPhone();
        CellPhone test2 = new CellPhone("iPhone 15 Pro Max", "apple", "Silver", "장착");
        CellPhone test3 = new CellPhone();

        CellPhone[] test_list = {test1, test2};
        for (CellPhone test_object : test_list) {
            String test_string = createObjectDataString(test_object);
            System.out.println(test_string);
        }

        test3.setModelName("test cell phone name");
        test3.setManufacturer("test manufacturer");
        test3.setColor("test unique color");
        test3.setCamera("미장착");
        String test_string = createObjectDataString(test3);
        System.out.println(test_string);
    }

    public static String createObjectDataString(CellPhone cellPhone) {
        String data_string = "";
        data_string += "모델명 : " + cellPhone.getModelName() + "\n";
        data_string += "제조사 : " + cellPhone.getManufacturer() + "\n";
        data_string += "색상 : " + cellPhone.getColor() + "\n";
        data_string += "카메라 장착여부 : " + cellPhone.getCamera() + "\n";

        return data_string;
    }
}

class CellPhone {
    private String model_name;
    private String manufacturer;
    private String color;
    private String camera;

    public CellPhone() {
        this.model_name = "NEXUS ONE";
        this.manufacturer = "HTC";
        this.color = "Black";
        this.camera = "장착";
    }

    public CellPhone(String model_name, String manufacturer, String color, String camera) {
        this.model_name = model_name;
        this.manufacturer = manufacturer;
        this.color = color;
        this.camera = camera;
    }


    public String getModelName() {
        return model_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
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
}
