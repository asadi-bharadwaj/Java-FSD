package com.ecommerce.dao;

import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ecommerce.entity.Eproduct;
import org.springframework.jdbc.core.RowMapper;    

public class EproductDAO {
	JdbcTemplate template;    
	public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }    
	public List<Eproduct> getProducts(){    
        return template.query("select * from eproduct",new RowMapper<Eproduct>(){    
            public EProduct mapRow(ResultSet rs, int row) throws SQLException {    
                    EProduct e=new EProduct();    
                e.setId(rs.getInt(1));    
                e.setName(rs.getString(2));    
                e.setPrice(rs.getBigDecimal(3));    
                e.setDateAdded(rs.getDate(4));    
                return e;    
            }    
        });    
    }    

}
