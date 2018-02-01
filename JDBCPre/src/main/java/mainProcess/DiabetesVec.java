package mainProcess;

import java.util.Date;

/**
 * Created by wy on 2018/1/25.
 */
public class DiabetesVec {
    public String medicareRegisterationID ;
    public Date billingDate;
    public int billingCount;
    public int relateScore;
    public double relatePercent;
    public TrainingVec trainingVec;
    public StatFeature statFeature;

    public DiabetesVec() {
        this.trainingVec = new TrainingVec();
        this.statFeature = new StatFeature();
    }

    public String getMedicareRegisterationID() {
        return medicareRegisterationID;
    }

    public void setMedicareRegisterationID(String medicareRegisterationID) {
        this.medicareRegisterationID = medicareRegisterationID;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public int getBillingCount() {
        return billingCount;
    }

    public void setBillingCount(int billingCount) {
        this.billingCount = billingCount;
    }

    public TrainingVec getTrainingVec() {
        return trainingVec;
    }

    public void setTrainingVec(TrainingVec trainingVec) {
        this.trainingVec = trainingVec;
    }

    public StatFeature getStatFeature() {
        return statFeature;
    }

    public void setStatFeature(StatFeature statFeature) {
        this.statFeature = statFeature;
    }

    public int getRelateScore() {
        return relateScore;
    }

    public void setRelateScore(int relateScore) {
        this.relateScore = relateScore;
    }

    public double getRelatePercent() {
        return relatePercent;
    }

    public void setRelatePercent(double relatePercent) {
        this.relatePercent = relatePercent;
    }
}
