package sun.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.dao.LineMapper;
import sun.pojo.Line;
import sun.utils.DataUtils;

@Service
@Transactional
public class LineDaoImpl {
	@Resource
	private LineMapper lineMapper;
	public void setShopMapper(LineMapper lineMapper) {
		this.lineMapper = lineMapper;
	}
	@Transactional(readOnly=true)
	public String findAll() {
		List<Line> list=lineMapper.findAll();
		return DataUtils.listToJson(list);
	}

	public String addLine(Line l) {
		lineMapper.addLine(l);
		return "{\"result\":"+true+"}";
	}
	

	public String updateLine(Line l) {
		lineMapper.updateLine(l);
		return "{\"result\":"+true+"}";
	}

	public String findById(String id) {
		Line line=lineMapper.findById(id);
		return DataUtils.pojoToJson(line);
	}
	

	public String deleteLine(String id) {
		lineMapper.deleteLine(id);
		return "{\"result\":"+true+"}";
	}
	
}
