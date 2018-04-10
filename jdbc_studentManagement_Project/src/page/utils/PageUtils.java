package page.utils;

import page.page.Page;

public final class PageUtils {
	public PageUtils(){}
	public static final void setPage(Page p){
		int pageSize=p.getPageSize();// 每页显示记录数
		int rowCount=p.getRowCount();// 总记录数
		// 通过总记录数和每页显示记录数计算出总页数
//		int pageCount=rowCount/pageSize;
//		if(rowCount%pageSize!=0){
//			pageCount+=1;
//		}
		int pageCount=(int) Math.ceil((double)rowCount/(double)pageSize);
		int pageNow=p.getPageNow();//当前页数
		if(pageNow<1){
			pageNow=1;
		}else if(pageNow>pageCount){
			pageNow=pageCount;
		}
		// 开始提取记录数：当前页数*每页显示记录数-每页显示记录数+1
		int start=pageNow*pageSize-pageSize+1;
		// 结束提取记录数：当前页数*每页显示记录数
		int end=pageSize*pageNow;
		p.setPageCount(pageCount);
		p.setPageNow(pageNow);
		p.setStart(start);
		p.setEnd(end);
	}
}
