package com.demo;

import java.util.List;

import page.dao.PageDao;
import page.page.Page;
import page.product.Product;
import page.utils.PageUtils;

public class TestPageProduct {
	public static void main(String[] args) {
		//1.初始化Page类
		Page p=new Page();
		//2.初始化Page的操作类
		PageDao pd=new PageDao();
		//3.利用Page操作类获取product表的总条数
		int count=pd.countProduct();
		//4.设置Page每一页数据条数
		p.setPageSize(3);
		//设置Page显示的当前页数
		p.setPageNow(3);
		//设置Page的数据总条数
		p.setRowCount(count);
		//利用Page的工具类设置 setPageCount(pageCount); setPageNow(pageNow);
		//setStart(start);setEnd(end);
		PageUtils.setPage(p);
		//5.利用list获取Page操作类.queryPage()方法的得到的数据集合
		List<Product> list=pd.qureyPage(p);
		//6.显示数据
		for(Product pr:list){
			System.out.println(pr.getProductId()+"--"+pr.getTitle());
		}
	}
}
