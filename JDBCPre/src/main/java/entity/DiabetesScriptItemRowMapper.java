package entity;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wy on 2018/1/26.
 */
public class DiabetesScriptItemRowMapper implements WyRowMapper {
    @Override
    public List getList(ResultSet rs) throws SQLException {
        List<DiabetesScriptItem> list= new ArrayList<>();
        int count = 0;
        while (rs.next()) {
            DiabetesScriptItem record = new DiabetesScriptItem();
            record.setRecord_id(rs.getString("RECORD_ID"));
            record.setBill_id(rs.getString("BILL_ID"));
            record.setSub_num(rs.getDouble("SUB_NUM"));
            record.setMedical_item_code(rs.getString("MEDICAL_ITEM_CODE"));
            record.setTrade_name(rs.getString("TRADE_NAME"));
            record.setItem_code(rs.getString("ITEM_CODE"));
            record.setItem_name(rs.getString("ITEM_NAME"));
            record.setBill_item_code(rs.getString("BILL_ITEM_CODE"));
            record.setPrimary_pay_percent(rs.getDouble("PRIMARY_PAY_PERCENT"));
            record.setLimit_price(rs.getDouble("LIMIT_PRICE"));
            record.setSingle_price(rs.getDouble("SINGLE_PRICE"));
            record.setQuantity(rs.getDouble("QUANTITY"));
            record.setTotal_costs(rs.getDouble("TOTAL_COSTS"));
            record.setTotal_medicare_payments(rs.getDouble("TOTAL_MEDICARE_PAYMENTS"));
            record.setPart_medicare_payments(rs.getDouble("PART_MEDICARE_PAYMENTS"));
            record.setTotal_payments(rs.getDouble("TOTAL_PAYMENTS"));
            record.setPart_payments(rs.getDouble("PART_PAYMENTS"));
            record.setPrice(rs.getDouble("PRICE"));
            record.setCentral_dept_code(rs.getString("CENTRAL_DEPT_CODE"));
            record.setCentral_dept_name(rs.getString("CENTRAL_DEPT_NAME"));
            record.setUnits_name(rs.getString("UNITS_NAME"));
            record.setPayments_id(rs.getString("PAYMENTS_ID"));
            record.setMedicare_registration_id(rs.getString("MEDICARE_REGISTRATION_ID"));
            record.setUse_days(rs.getDouble("USE_DAYS"));
            record.setUse_desc(rs.getString("USE_DESC"));
            record.setBilling_date(rs.getDate("BILLING_DATE"));
            list.add(record);
        }
        return list;
    }


}
