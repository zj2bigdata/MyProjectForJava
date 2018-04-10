package com.service;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.ShopDao;

@Service
public class ShopService {
	@Resource
	private ShopDao sd;
	@Transactional(readOnly=true)
	public List<Map<String,Object>> queryAll(){
		return sd.queryAll();
	}
	@Transactional
	public void delete(Integer... is){
		for(Integer i:is){
			sd.delete(i);
		}
	}
	
}
