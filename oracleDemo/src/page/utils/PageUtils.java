package page.utils;

import page.page.Page;

public final class PageUtils {
	public PageUtils(){}
	public static final void setPage(Page p){
		int pageSize=p.getPageSize();// ÿҳ��ʾ��¼��
		int rowCount=p.getRowCount();// �ܼ�¼��
		// ͨ���ܼ�¼����ÿҳ��ʾ��¼���������ҳ��
//		int pageCount=rowCount/pageSize;
//		if(rowCount%pageSize!=0){
//			pageCount+=1;
//		}
		int pageCount=(int) Math.ceil((double)rowCount/(double)pageSize);
		int pageNow=p.getPageNow();//��ǰҳ��
		if(pageNow<1){
			pageNow=1;
		}else if(pageNow>pageCount){
			pageNow=pageCount;
		}
		// ��ʼ��ȡ��¼������ǰҳ��*ÿҳ��ʾ��¼��-ÿҳ��ʾ��¼��+1
		int start=pageNow*pageSize-pageSize+1;
		// ������ȡ��¼������ǰҳ��*ÿҳ��ʾ��¼��
		int end=pageSize*pageNow;
		p.setPageCount(pageCount);
		p.setPageNow(pageNow);
		p.setStart(start);
		p.setEnd(end);
	}
}
