package farm.entities;

/**
 * Created by scheffs on 3/10/2016.
 */
public class FarmEquip {

    private int productId;
    private String productName;
    private String model;
    private int yearModel;
    private String description;

    //// TODO: 3/10/2016  need to add daos to persistence folder

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
