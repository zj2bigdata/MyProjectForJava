package sun.dao;

import java.util.List;

import sun.entity.Cost;

public interface CostDao {
	List<Cost> findAll();
	void addCost(Cost c);
	void updateCost(Cost c);
	Cost findById(String id);
	void deleteCost(String id);
}
