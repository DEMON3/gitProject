package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemMapInstitutionRowMapper implements WyRowMapper {
    @Override
    public List getList(ResultSet rs) throws SQLException {
        List<ItemMap> list= new ArrayList<>();
        int count = 0;
        while (rs.next()) {
            ItemMap record = new ItemMap();
            record.setItemCode(rs.getString("item_code"));
            record.setItemName(rs.getString("item_name"));
            record.setBillItemCode(rs.getString("bill_item_code"));
            record.setRelateFlag(rs.getInt("relate_flag"));
            list.add(record);
        }
        return list;
    }
}