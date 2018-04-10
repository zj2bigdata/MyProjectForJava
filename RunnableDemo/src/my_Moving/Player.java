package my_Moving;

public class Player implements Runnable{
	private Movie m;
	
	public Player(Movie m) {
		super();
		this.m = m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++){
			if(i%2==0){
				System.out.println("ÖÐ¹úÃÎ");
			}else{
				System.out.println("ÓÍìË´óÏº");
			}
		}
	}
	
}
