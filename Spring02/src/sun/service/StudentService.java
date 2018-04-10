package sun.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//业务类,即目标
@Service
public class StudentService {
	
	public void sleep(){
		System.out.println("sleeping");
	}
	
	public void launch(){
		System.out.println("launching");
		throw new RuntimeException("捕捉到了异常");
	}
}
