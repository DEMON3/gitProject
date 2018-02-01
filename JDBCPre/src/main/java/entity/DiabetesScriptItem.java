package entity;

import java.util.Date;

public class DiabetesScriptItem {
    public String record_id;    //	记录ID
    public String bill_id;    //	费用ID
    public Double sub_num;    //	顺序号
    public String medical_item_code;    //	医疗项目编码
    public String trade_name;    //	商品名
    public String item_code;    //	医院项目编码
    public String item_name;    //	医院项目名称
    public String bill_item_code;    //	结算项目编号
    public Double primary_pay_percent;    //	首先支付比例
    public Double limit_price;    //	限价
    public Double single_price;    //	单价
    public Double quantity;    //	数量
    public Double total_costs;    //	总金额
    public Double total_medicare_payments;    //	全额统筹
    public Double part_medicare_payments;    //	部分统筹
    public Double total_payments;    //	金额支付
    public Double part_payments;    //	部分支付
    public Double price;    //	参考限价金额
    public String central_dept_code;    //	中心科室编码
    public String central_dept_name;    //	中心科室名称
    public String units_name;    //	计量单位
    public String payments_id;    //	结算号ID
    public String medicare_registration_id;    //	医疗统筹登记号
    public Double use_days;    //	用药天数
    public String use_desc;    //	用药说明
    public Date billing_date;      //結算日期


    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }

    public String getBill_id() {
        return bill_id;
    }

    public void setBill_id(String bill_id) {
        this.bill_id = bill_id;
    }


    public String getMedical_item_code() {
        return medical_item_code;
    }

    public void setMedical_item_code(String medical_item_code) {
        this.medical_item_code = medical_item_code;
    }

    public String getTrade_name() {
        return trade_name;
    }

    public void setTrade_name(String trade_name) {
        this.trade_name = trade_name;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getBill_item_code() {
        return bill_item_code;
    }

    public void setBill_item_code(String bill_item_code) {
        this.bill_item_code = bill_item_code;
    }

    public Double getPrimary_pay_percent() {
        return primary_pay_percent;
    }

    public void setPrimary_pay_percent(Double primary_pay_percent) {
        this.primary_pay_percent = primary_pay_percent;
    }

    public Double getLimit_price() {
        return limit_price;
    }

    public void setLimit_price(Double limit_price) {
        this.limit_price = limit_price;
    }

    public Double getSingle_price() {
        return single_price;
    }

    public void setSingle_price(Double single_price) {
        this.single_price = single_price;
    }

    public Double getTotal_costs() {
        return total_costs;
    }

    public void setTotal_costs(Double total_costs) {
        this.total_costs = total_costs;
    }

    public Double getTotal_medicare_payments() {
        return total_medicare_payments;
    }

    public void setTotal_medicare_payments(Double total_medicare_payments) {
        this.total_medicare_payments = total_medicare_payments;
    }

    public Double getPart_medicare_payments() {
        return part_medicare_payments;
    }

    public void setPart_medicare_payments(Double part_medicare_payments) {
        this.part_medicare_payments = part_medicare_payments;
    }

    public Double getTotal_payments() {
        return total_payments;
    }

    public void setTotal_payments(Double total_payments) {
        this.total_payments = total_payments;
    }

    public Double getPart_payments() {
        return part_payments;
    }

    public void setPart_payments(Double part_payments) {
        this.part_payments = part_payments;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCentral_dept_code() {
        return central_dept_code;
    }

    public void setCentral_dept_code(String central_dept_code) {
        this.central_dept_code = central_dept_code;
    }

    public String getCentral_dept_name() {
        return central_dept_name;
    }

    public void setCentral_dept_name(String central_dept_name) {
        this.central_dept_name = central_dept_name;
    }

    public String getUnits_name() {
        return units_name;
    }

    public void setUnits_name(String units_name) {
        this.units_name = units_name;
    }

    public String getPayments_id() {
        return payments_id;
    }

    public void setPayments_id(String payments_id) {
        this.payments_id = payments_id;
    }

    public String getMedicare_registration_id() {
        return medicare_registration_id;
    }

    public void setMedicare_registration_id(String medicare_registration_id) {
        this.medicare_registration_id = medicare_registration_id;
    }

    public String getUse_desc() {
        return use_desc;
    }

    public void setUse_desc(String use_desc) {
        this.use_desc = use_desc;
    }

    public Double getSub_num() {
        return sub_num;
    }

    public void setSub_num(Double sub_num) {
        this.sub_num = sub_num;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUse_days() {
        return use_days;
    }

    public void setUse_days(Double use_days) {
        this.use_days = use_days;
    }

    public Date getBilling_date() {
        return billing_date;
    }

    public void setBilling_date(Date billing_date) {
        this.billing_date = billing_date;
    }
}