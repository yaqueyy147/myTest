package com.witkey.familyTree.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.witkey.familyTree.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> testA() {
		String sql = "select * from t_user_base";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}

}
