package sun.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EatAspect {
	//环绕切入
//	@Around("execution(* sun.service.*.*launch*(..))")
	public Object eat(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("eattingBefore");
		Object obj=pjp.proceed();
		System.out.println("eattingAfter");
		return obj;
	}
	@AfterThrowing(pointcut="execution(* sun.service.*.*launch*(..))",throwing="e")
	public void Thowsing(Exception e){
		System.out.println(e.getMessage());
	}
	
	@After("execution(* sun.service.*.*launch*(..))")
	public void finallyEat(){
		System.out.println("想干嘛干嘛!");
	}
}
