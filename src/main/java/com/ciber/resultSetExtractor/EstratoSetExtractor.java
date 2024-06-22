package com.ciber.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ciber.entities.Estrato;
import com.ciber.rowMapper.EstratoRowMapper;

public class EstratoSetExtractor implements ResultSetExtractor<List<Estrato>>{

	@Override
	public List<Estrato> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Estrato> list = new ArrayList<Estrato>();
		while (rs.next()) {
			list.add(new EstratoRowMapper().mapRow(rs, (rs.getRow() - 1)));
		}
		
		return list;
	}

}