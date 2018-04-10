package com.demo;

import java.util.List;

import page.dao.PageDao;
import page.page.Page;
import page.product.Product;
import page.utils.PageUtils;

public class TestPageProduct {
	public static void main(String[] args) {
		//1.��ʼ��Page��
		Page p=new Page();
		//2.��ʼ��Page�Ĳ�����
		PageDao pd=new PageDao();
		//3.����Page�������ȡproduct���������
		int count=pd.countProduct();
		//4.����Pageÿһҳ��������
		p.setPageSize(3);
		//����Page��ʾ�ĵ�ǰҳ��
		p.setPageNow(3);
		//����Page������������
		p.setRowCount(count);
		//����Page�Ĺ��������� setPageCount(pageCount); setPageNow(pageNow);
		//setStart(start);setEnd(end);
		PageUtils.setPage(p);
		//5.����list��ȡPage������.queryPage()�����ĵõ������ݼ���
		List<Product> list=pd.qureyPage(p);
		//6.��ʾ����
		for(Product pr:list){
			System.out.println(pr.getProductId()+"--"+pr.getTitle());
		}
	}
}
