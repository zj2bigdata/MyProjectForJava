package sun.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//ҵ����,��Ŀ��
@Service
public class StudentService {
	
	public void sleep(){
		System.out.println("sleeping");
	}
	
	public void launch(){
		System.out.println("launching");
		throw new RuntimeException("��׽�����쳣");
	}
}
