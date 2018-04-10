package com.dao;

import java.util.List;
import com.pojo.Category;

public interface CategoryMapper {
	List<Category> many2Many();
}
