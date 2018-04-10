package sun.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sun.dao.CostDao;
import sun.entity.Cost;
import sun.utils.DBUtils;

public class CostDaoImpl implements CostDao{

	@Override
	public List<Cost> findAll() {
		Connection con=null;
		try {
			List<Cost> costs=new ArrayList<Cost>();
			con=DBUtils.getConnection();
			String sql="select * from cost order by cost_id";
			Statement ste=con.createStatement();
			ResultSet rs=ste.executeQuery(sql);
			while(rs.next()){
				Cost cost=new Cost();
				cost.setCostId(rs.getInt("COST_ID"));
				cost.setName(rs.getString("NAME"));
				cost.setBaseDuration(rs.getInt("BASE_DURATION"));
				cost.setBaseCost(rs.getDouble("BASE_COST"));
				cost.setUnitCost(rs.getDouble("UNIT_COST"));
				cost.setStatus(rs.getString("STATUS"));
				cost.setDescr(rs.getString("DESCR"));
				cost.setCreatime(rs.getTimestamp("CREATIME"));
				cost.setStartime(rs.getTimestamp("STARTIME"));
				cost.setCostType(rs.getString("COST_TYPE"));
				costs.add(cost);
			}
			return costs;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("查询自费失败",e);
		}finally{
			DBUtils.closeConnection(con);
		}
	}

	@Override
	public void addCost(Cost c) {
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="insert into cost values(SEQ_COST.nextval,?,?,?,?,1,?,sysdate,null,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,c.getName());
			ps.setObject(2,c.getBaseDuration());
			ps.setObject(3,c.getBaseCost());
			ps.setObject(4,c.getUnitCost());
			ps.setString(5,c.getDescr());
			ps.setString(6,c.getCostType());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("增加资费失败!",e);
		}finally{
			DBUtils.closeConnection(con);
		}
		
	}
	
	@Override
	public void updateCost(Cost c) {
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="update cost set name=?,cost_type=?,BASE_DURATION=?,BASE_COST=?,UNIT_COST=?,DESCR=? where COST_ID=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(7,c.getCostId());
			ps.setString(1,c.getName());
			ps.setObject(3,c.getBaseDuration());
			ps.setObject(4,c.getBaseCost());
			ps.setObject(5,c.getUnitCost());
			ps.setString(6,c.getDescr());
			ps.setString(2,c.getCostType());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("修改资费失败!",e);
		}finally{
			DBUtils.closeConnection(con);
		}
	}

	@Override
	public Cost findById(String id) {
		Connection con=null;
		try {
			Cost cost=new Cost();
			con=DBUtils.getConnection();
			String sql="select * from cost where COST_ID=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				cost.setName(rs.getString("NAME"));
				cost.setBaseDuration(rs.getInt("BASE_DURATION"));
				cost.setBaseCost(rs.getDouble("BASE_COST"));
				cost.setUnitCost(rs.getDouble("UNIT_COST"));
				cost.setStatus(rs.getString("STATUS"));
				cost.setDescr(rs.getString("DESCR"));
				cost.setCreatime(rs.getTimestamp("CREATIME"));
				cost.setStartime(rs.getTimestamp("STARTIME"));
				cost.setCostType(rs.getString("COST_TYPE"));
			}
			return cost;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("查询自费失败",e);
		}finally{
			DBUtils.closeConnection(con);
		}
	}
	

	@Override
	public void deleteCost(String id) {
		Connection con=null;
		try {
			con=DBUtils.getConnection();
			String sql="delete from cost where COST_ID=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("删除自费失败",e);
		}finally{
			DBUtils.closeConnection(con);
		}
		
	}
	
}
