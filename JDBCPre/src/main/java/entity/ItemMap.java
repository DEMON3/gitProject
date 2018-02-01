package entity;

public class ItemMap {
    String itemId;
    String itemCode;
    String itemName;
    int relateFlag;
    int relateScore;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    public int getRelateFlag() {
        return relateFlag;
    }

    public void setRelateFlag(int relateFlag) {
        this.relateFlag = relateFlag;
    }

    public int getRelateScore() {
        return relateScore;
    }

    public void setRelateScore(int relateScore) {
        this.relateScore = relateScore;
    }
}
