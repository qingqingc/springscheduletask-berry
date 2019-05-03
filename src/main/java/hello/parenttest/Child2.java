package hello.parenttest;

import org.springframework.stereotype.Component;

@Component
public class Child2 extends AbstractP<Child2DTO> {

	@Override
	public void cTest(Child2DTO t) {
		System.out.println("This's the Child2's cTest gender:" + t.getGender());
		
	}

}
