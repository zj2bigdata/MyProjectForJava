package sun.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import sun.pojo.Line;

@Repository
public interface LineMapper {
	List<Line> findAll();
	void addLine(Line l);
	void updateLine(Line l);
	Line findById(String id);
	void deleteLine(String id);
}
