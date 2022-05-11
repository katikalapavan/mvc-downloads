package client;

import org.springframework.beans.factory.annotation.Autowired;

public class First {
	@Autowired
	private Second second;

	@Autowired
 	public First() {
	}

	@Autowired
	public First(Second second) {
		this.second = second;
	}
	
	@Autowired
	public void setSecond(Second second) {
		this.second = second;
	}
	
	@Autowired
	public void someInitMethod(Second second) {
		this.second = second;
	}
	@Autowired
	public void test() {
		second.invoke();
	}
}
