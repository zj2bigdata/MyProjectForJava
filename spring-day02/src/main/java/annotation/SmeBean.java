package annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sb1")
@Scope("prototype")
public class SmeBean {

	public SmeBean() {
		System.out.println("SmeBean()");
	}
	
}
