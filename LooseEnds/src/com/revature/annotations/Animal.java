package com.revature.annotations;

public class Animal {
	@Deprecated
	int eyeballs = 0;

	public void printEyeballs() {
		System.out.print("I'm a basic animal");
	}

}

//Annotations are keywords preceded by an @. Goes over classes, methods, variables
@Deprecated
class Bird extends Animal {
	
	//Override: overriding a parent method
	@Override
	public void printEyeballs() {
		System.out.println("Probably 2");
	}
	
	//Deprecated: phased out, shouldn't be used
	@Deprecated
	public void printEyes() {
		System.out.print("I'm a basic animal");
	}

}

@MyAnnotation(AString = "AString")
class UsesBird {
	
	//Suppression Warnings: prevents some IDE warnings
	@SuppressWarnings("deprecation")
	public void useBird() {
		Bird b = new Bird();
		b.printEyes();
	}
}

//You can make your own too
@interface MyAnnotation
{
	String AString() default "A default value";
}