package hello.parenttest;

import org.springframework.stereotype.Component;

@Component
public class Child1 extends AbstractP<Child1DTO> {

	@Override
	public void cTest(Child1DTO t) {
		System.out.println("This's the Child1's cTest name:" + t.getName());
	}
}
