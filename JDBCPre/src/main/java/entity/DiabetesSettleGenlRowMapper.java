package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wy on 2018/1/26.
 */
public class DiabetesSettleGenlRowMapper implements WyRowMapper {

    public List getList(ResultSet rs) throws SQLException {
        List<DiabetesSettleGenl> list= new ArrayList<DiabetesSettleGenl>();
        int count = 0;
        while (rs.next()) {
            DiabetesSettleGenl record = new DiabetesSettleGenl();
            record.setPayments_id(rs.getString("PAYMENTS_ID"));
            record.setMedicare_registration_id(rs.getString("MEDICARE_REGISTRATION_ID"));
            record.setBilling_adress(rs.getString("BILLING_ADRESS"));
            record.setBilling_year(rs.getString("BILLING_YEAR"));
            record.setInsurance_type(rs.getString("INSURANCE_TYPE_CODE"));
            record.setMedicare_type_code(rs.getString("MEDICARE_TYPE_CODE"));
            record.setMedicare_type_name(rs.getString("MEDICARE_TYPE_NAME"));
            record.setMedicare_type_desc(rs.getString("MEDICARE_TYPE_DESC"));
            record.setTreatment_type(rs.getString("TREATMENT_TYPE"));
            record.setDisease_code(rs.getString("DISEASE_CODE"));
            record.setInstitution_code(rs.getString("INSTITUTION_CODE"));
            record.setTreatment_instution_code(rs.getString("TREATMENT_INSTUTION_CODE"));
            record.setStart_date(rs.getString("START_DATE"));
            record.setEnd_date(rs.getString("END_DATE"));
            record.setTotal_costs(rs.getDouble("TOTAL_COSTS"));
            record.setTotal_medicare_payments(rs.getDouble("TOTAL_MEDICARE_PAYMENTS"));
            record.setPart_medicare_payments(rs.getDouble("PART_MEDICARE_PAYMENTS"));
            record.setPart_pay(rs.getDouble("PART_PAY"));
            record.setTotal_pay(rs.getDouble("TOTAL_PAY"));
            record.setMedicare_range(rs.getDouble("MEDICARE_RANGE"));
            record.setShould_pay(rs.getDouble("SHOULD_PAY"));
            record.setReal_pay(rs.getDouble("REAL_PAY"));
            record.setPostpone(rs.getDouble("POSTPONE"));
            record.setAllowance_postpone(rs.getString("ALLOWANCE_POSTPONE"));
            record.setInp_billing_count(rs.getInt("INP_BILLING_COUNT"));
            record.setYear_billing_count(rs.getInt("YEAR_BILLING_COUNT"));
            record.setBilling_date(rs.getDate("BILLING_DATE"));
            record.setMedicare_serial_id(rs.getString("MEDICARE_SERIAL_ID"));
            record.setInsured_id(rs.getString("INSURED_ID"));
            record.setRegistration_id(rs.getString("REGISTRATION_ID"));
            record.setPerson_type(rs.getString("PERSON_TYPE"));
            record.setStat_person_type(rs.getString("STAT_PERSON_TYPE"));
            record.setObject_type(rs.getString("OBJECT_TYPE"));
            record.setSpecial_type(rs.getString("SPECIAL_TYPE"));
            record.setPeople_type(rs.getString("PEOPLE_TYPE"));
            record.setOrganization_id(rs.getString("ORGANIZATION_ID"));
            record.setOrganization_type(rs.getString("ORGANIZATION_TYPE"));
            record.setInstitution_bill_id(rs.getString("INSTITUTION_BILL_ID"));
            record.setMedicare_pay_type(rs.getString("MEDICARE_PAY_TYPE"));
            record.setTreatment_anency_code(rs.getString("TREATMENT_ANENCY_CODE"));
            record.setAllowance_should_pay(rs.getDouble("ALLOWANCE_SHOULD_PAY"));
            record.setAllowance_real_pay(rs.getDouble("ALLOWANCE_REAL_PAY"));
            record.setAgency_id(rs.getString("AGENCY_ID"));
            record.setToll_agency_id(rs.getString("TOLL_AGENCY_ID"));
            record.setAgency_type(rs.getString("AGENCY_TYPE"));
            record.setStat_person_type_detail(rs.getString("STAT_PERSON_TYPE_DETAIL"));
            record.setEconomic_type(rs.getString("ECONOMIC_TYPE"));
            record.setOriginal_bill_id(rs.getString("ORIGINAL_BILL_ID"));
            record.setReplace_by_bill_id(rs.getString("REPLACE_BY_BILL_ID"));
            record.setYear_end_clear(rs.getString("YEAR_END_CLEAR"));
            record.setMedicare_settle_check_person(rs.getString("MEDICARE_SETTLE_CHECK_PERSON"));
            record.setMedicare_settle_check_date(rs.getDate("MEDICARE_SETTLE_CHECK_DATE"));
            record.setSettle_person(rs.getString("SETTLE_PERSON"));
            record.setHospital_payments(rs.getDouble("HOSPITAL_PAYMENTS"));
            record.setMix_people_range(rs.getString("MIX_PEOPLE_RANGE"));
            record.setBilling_time(rs.getDate("BILLING_TIME"));
            record.setBilling_month(rs.getString("BILLING_MONTH"));
            list.add(record);
        }
        return list;
    }


}
