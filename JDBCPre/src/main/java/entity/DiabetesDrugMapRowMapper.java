package entity;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wy on 2018/1/26.
 */
public class DiabetesDrugMapRowMapper implements WyRowMapper{
    @Override
    public List getList(ResultSet rs) throws SQLException {
        List<DiabetesDrugMap> list= new ArrayList<>();
        int count = 0;
        while (rs.next()) {
            DiabetesDrugMap record = new DiabetesDrugMap();
            record.setDrugCode(rs.getString("DRUG_CODE"));
            record.setItemCode(rs.getString("item_code"));
            list.add(record);
        }
        return list;
    }
}
