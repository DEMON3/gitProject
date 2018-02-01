package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by wy on 2018/1/26.
 */
public interface WyRowMapper {

    List getList(ResultSet rs) throws SQLException;


}
