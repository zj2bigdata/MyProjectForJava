package sun.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//������:���������淽������
@Component
@Aspect
public class StudentSleepAspect {
	
	//���淽��
//	@Pointcut("execution(* sun.service.StudentService.*(..))")
//	public void pointCut(){
//		
//	}
	//�����������
	@Before("execution(* sun.service.*.*sleep*(..))")
	public void sharp(){
		System.out.println("shrpping");
	}
	@AfterReturning("execution(* sun.service.*.*sleep*(..))")
	public void dream(){
		System.out.println("dreaming");
	}
	
}
