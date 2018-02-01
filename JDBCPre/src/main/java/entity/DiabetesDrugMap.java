package entity;

import java.io.Serializable;

/**
 * Created by wy on 2018/1/25.
 */
public class DiabetesDrugMap implements Serializable {
    String drugCode;
    String itemCode;
    String itemName;
    String billItemCode;

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBillItemCode() {
        return billItemCode;
    }

    public void setBillItemCode(String billItemCode) {
        this.billItemCode = billItemCode;
    }
}
