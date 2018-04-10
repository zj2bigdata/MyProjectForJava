package sun.dao;

import sun.entity.Admin;

public interface AdminDao {
	Admin findByCode(String code);
}
