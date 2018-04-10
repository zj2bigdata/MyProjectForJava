package com.dao;

import java.util.List;
import com.pojo.Product;

public  interface ProductMapper {
	List<Product> many2One();
}
