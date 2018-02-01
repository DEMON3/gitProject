package entity;

import java.util.Date;

public class DiabetesSettleGenl {
    public String payments_id; 	//结算号ID
    public String medicare_registration_id; 	//医疗统筹登记号
    public String billing_adress; 	//结算地点
    public String billing_year; 	//结算年度
    public String insurance_type; 	//险种标志
    public String medicare_type_code; 	//医保类型编码
    public String medicare_type_name; 	//医疗统筹类别
    public String medicare_type_desc; 	//医疗统筹类别明细
    public String treatment_type; 	//就医类别
    public String disease_code; 	//疾病编码
    public String institution_code; 	//医院编码
    public String treatment_instution_code; 	//就医医院编码
    public String start_date; 	//起始日期
    public String end_date; 	//终止日期
    public Double total_costs; 	//实际发生费用总额
    public Double total_medicare_payments; 	//全额统筹
    public Double part_medicare_payments; 	//部分统筹
    public Double part_pay; 	//部分支付
    public Double total_pay; 	//全额支付
    public Double medicare_range; 	//本次纳入统筹范围
    public Double should_pay; 	//应支出
    public Double real_pay; 	//实支出
    public Double postpone; 	//暂缓
    public String allowance_postpone; 	//补助暂缓
    public Integer inp_billing_count; 	//本次住院结算次数
    public Integer year_billing_count; 	//本年结算次数
    public Date billing_date; 	//结算日期
    public String medicare_serial_id; 	//报销单据自动流水号
    public String insured_id; 	//人员ID
    public String registration_id; 	//人员登记ID
    public String person_type; 	//待遇人员类别
    public String stat_person_type; 	//统计人员类别
    public String object_type; 	//优抚对象类别
    public String special_type; 	//孤寡类别
    public String people_type; 	//人群类别
    public String organization_id; 	//组织ID
    public String organization_type; 	//单位性质
    public String institution_bill_id; 	//医院结算号
    public String medicare_pay_type; 	//社保医院结算类别
    public String treatment_anency_code; 	//就医地机构编号
    public Double allowance_should_pay; 	//补助应支
    public Double allowance_real_pay; 	//补助实支
    public String agency_id; 	//经办机构ID
    public String toll_agency_id; 	//收缴机构ID
    public String agency_type; 	//组织类别
    public String stat_person_type_detail; 	//统计人员类别明细
    public String economic_type; 	//经济类型
    public String original_bill_id; 	//本条冲销哪条
    public String replace_by_bill_id; 	//本条被哪条冲销
    public String year_end_clear; 	//年终清算号
    public String medicare_settle_check_person; 	//社保医院结算审核人
    public Date medicare_settle_check_date; 	//社保医院结算审核日期
    public String settle_person; 	//经办人
    public Double hospital_payments; 	//医院负担金额
    public String mix_people_range; 	//混算待遇人员类别范围
    public Date billing_time; 	//病人结算时间到秒
    public String billing_month; 	//结算月份格式201001


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

    public String getBilling_adress() {
        return billing_adress;
    }

    public void setBilling_adress(String billing_adress) {
        this.billing_adress = billing_adress;
    }

    public String getBilling_year() {
        return billing_year;
    }

    public void setBilling_year(String billing_year) {
        this.billing_year = billing_year;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public String getMedicare_type_code() {
        return medicare_type_code;
    }

    public void setMedicare_type_code(String medicare_type_code) {
        this.medicare_type_code = medicare_type_code;
    }

    public String getMedicare_type_name() {
        return medicare_type_name;
    }

    public void setMedicare_type_name(String medicare_type_name) {
        this.medicare_type_name = medicare_type_name;
    }

    public String getMedicare_type_desc() {
        return medicare_type_desc;
    }

    public void setMedicare_type_desc(String medicare_type_desc) {
        this.medicare_type_desc = medicare_type_desc;
    }

    public String getTreatment_type() {
        return treatment_type;
    }

    public void setTreatment_type(String treatment_type) {
        this.treatment_type = treatment_type;
    }

    public String getDisease_code() {
        return disease_code;
    }

    public void setDisease_code(String disease_code) {
        this.disease_code = disease_code;
    }

    public String getInstitution_code() {
        return institution_code;
    }

    public void setInstitution_code(String institution_code) {
        this.institution_code = institution_code;
    }

    public String getTreatment_instution_code() {
        return treatment_instution_code;
    }

    public void setTreatment_instution_code(String treatment_instution_code) {
        this.treatment_instution_code = treatment_instution_code;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
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

    public Double getPart_pay() {
        return part_pay;
    }

    public void setPart_pay(Double part_pay) {
        this.part_pay = part_pay;
    }

    public Double getTotal_pay() {
        return total_pay;
    }

    public void setTotal_pay(Double total_pay) {
        this.total_pay = total_pay;
    }

    public Double getMedicare_range() {
        return medicare_range;
    }

    public void setMedicare_range(Double medicare_range) {
        this.medicare_range = medicare_range;
    }

    public Double getShould_pay() {
        return should_pay;
    }

    public void setShould_pay(Double should_pay) {
        this.should_pay = should_pay;
    }

    public Double getReal_pay() {
        return real_pay;
    }

    public void setReal_pay(Double real_pay) {
        this.real_pay = real_pay;
    }

    public Double getPostpone() {
        return postpone;
    }

    public void setPostpone(Double postpone) {
        this.postpone = postpone;
    }

    public String getAllowance_postpone() {
        return allowance_postpone;
    }

    public void setAllowance_postpone(String allowance_postpone) {
        this.allowance_postpone = allowance_postpone;
    }

    public Integer getInp_billing_count() {
        return inp_billing_count;
    }

    public void setInp_billing_count(Integer inp_billing_count) {
        this.inp_billing_count = inp_billing_count;
    }

    public Integer getYear_billing_count() {
        return year_billing_count;
    }

    public void setYear_billing_count(Integer year_billing_count) {
        this.year_billing_count = year_billing_count;
    }



    public String getMedicare_serial_id() {
        return medicare_serial_id;
    }

    public void setMedicare_serial_id(String medicare_serial_id) {
        this.medicare_serial_id = medicare_serial_id;
    }

    public String getInsured_id() {
        return insured_id;
    }

    public void setInsured_id(String insured_id) {
        this.insured_id = insured_id;
    }

    public String getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(String registration_id) {
        this.registration_id = registration_id;
    }

    public String getPerson_type() {
        return person_type;
    }

    public void setPerson_type(String person_type) {
        this.person_type = person_type;
    }

    public String getStat_person_type() {
        return stat_person_type;
    }

    public void setStat_person_type(String stat_person_type) {
        this.stat_person_type = stat_person_type;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public String getSpecial_type() {
        return special_type;
    }

    public void setSpecial_type(String special_type) {
        this.special_type = special_type;
    }

    public String getPeople_type() {
        return people_type;
    }

    public void setPeople_type(String people_type) {
        this.people_type = people_type;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getOrganization_type() {
        return organization_type;
    }

    public void setOrganization_type(String organization_type) {
        this.organization_type = organization_type;
    }

    public String getInstitution_bill_id() {
        return institution_bill_id;
    }

    public void setInstitution_bill_id(String institution_bill_id) {
        this.institution_bill_id = institution_bill_id;
    }

    public String getMedicare_pay_type() {
        return medicare_pay_type;
    }

    public void setMedicare_pay_type(String medicare_pay_type) {
        this.medicare_pay_type = medicare_pay_type;
    }

    public String getTreatment_anency_code() {
        return treatment_anency_code;
    }

    public void setTreatment_anency_code(String treatment_anency_code) {
        this.treatment_anency_code = treatment_anency_code;
    }

    public Double getAllowance_should_pay() {
        return allowance_should_pay;
    }

    public void setAllowance_should_pay(Double allowance_should_pay) {
        this.allowance_should_pay = allowance_should_pay;
    }

    public Double getAllowance_real_pay() {
        return allowance_real_pay;
    }

    public void setAllowance_real_pay(Double allowance_real_pay) {
        this.allowance_real_pay = allowance_real_pay;
    }

    public void setHospital_payments(Double hospital_payments) {
        this.hospital_payments = hospital_payments;
    }

    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }

    public String getToll_agency_id() {
        return toll_agency_id;
    }

    public void setToll_agency_id(String toll_agency_id) {
        this.toll_agency_id = toll_agency_id;
    }

    public String getAgency_type() {
        return agency_type;
    }

    public void setAgency_type(String agency_type) {
        this.agency_type = agency_type;
    }

    public String getStat_person_type_detail() {
        return stat_person_type_detail;
    }

    public void setStat_person_type_detail(String stat_person_type_detail) {
        this.stat_person_type_detail = stat_person_type_detail;
    }

    public String getEconomic_type() {
        return economic_type;
    }

    public void setEconomic_type(String economic_type) {
        this.economic_type = economic_type;
    }

    public String getOriginal_bill_id() {
        return original_bill_id;
    }

    public void setOriginal_bill_id(String original_bill_id) {
        this.original_bill_id = original_bill_id;
    }

    public String getReplace_by_bill_id() {
        return replace_by_bill_id;
    }

    public void setReplace_by_bill_id(String replace_by_bill_id) {
        this.replace_by_bill_id = replace_by_bill_id;
    }

    public String getYear_end_clear() {
        return year_end_clear;
    }

    public void setYear_end_clear(String year_end_clear) {
        this.year_end_clear = year_end_clear;
    }

    public String getMedicare_settle_check_person() {
        return medicare_settle_check_person;
    }

    public void setMedicare_settle_check_person(String medicare_settle_check_person) {
        this.medicare_settle_check_person = medicare_settle_check_person;
    }

    public Date getMedicare_settle_check_date() {
        return medicare_settle_check_date;
    }

    public void setMedicare_settle_check_date(Date medicare_settle_check_date) {
        this.medicare_settle_check_date = medicare_settle_check_date;
    }

    public String getSettle_person() {
        return settle_person;
    }

    public void setSettle_person(String settle_person) {
        this.settle_person = settle_person;
    }

    public Double getHospital_payments() {
        return hospital_payments;
    }

    public String getMix_people_range() {
        return mix_people_range;
    }

    public void setMix_people_range(String mix_people_range) {
        this.mix_people_range = mix_people_range;
    }

    public Date getBilling_date() {
        return billing_date;
    }

    public void setBilling_date(Date billing_date) {
        this.billing_date = billing_date;
    }

    public Date getBilling_time() {
        return billing_time;
    }

    public void setBilling_time(Date billing_time) {
        this.billing_time = billing_time;
    }

    public String getBilling_month() {
        return billing_month;
    }

    public void setBilling_month(String billing_month) {
        this.billing_month = billing_month;
    }

}