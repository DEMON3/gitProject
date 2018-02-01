package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemMapRowMapper implements WyRowMapper {
    @Override
    public List getList(ResultSet rs) throws SQLException {
        List<ItemMap> list= new ArrayList<>();
        int count = 0;
        while (rs.next()) {
            ItemMap record = new ItemMap();
            record.setItemId(rs.getString("item_id"));
            record.setItemCode(rs.getString("item_code"));
            record.setItemName(rs.getString("item_name"));
            record.setRelateFlag(rs.getInt("relate_flag"));
            record.setRelateScore(rs.getInt("relate_score"));
            list.add(record);
        }
        return list;
    }
}
