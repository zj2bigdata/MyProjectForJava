package hw;

public class LoginService {
	private AdminDAO adao;
	public LoginService() {
		System.out.println("LoginService()");
	}
	public void setAdao(AdminDAO adao) {
		System.out.println("setAdao()");
		this.adao = adao;
	}
	public void f2(){
		adao.f1();
	}
}
