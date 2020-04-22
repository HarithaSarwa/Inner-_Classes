package inner_class_example;

public class Person_Outer {
	public void outerMethod() {
		JobPrivateInner i = new JobPrivateInner();
		i.innerPrivateMethod();
	}

	private class JobPrivateInner {
		public void innerPrivateMethod() { // method cannot access from main so create a public method
			System.out.println("Hello from innerprivate method");
		}
	}

	public class EducationPublicInner {
		public void innerPublicMethod() {
			System.out.println("Hello from inner public method");
		}
	}

	public static class FamilyPublicInnerStatic {

		public static void staticInnerMethod() {
			System.out.println("Hello from static method of inner class");
		}

		public void nonStaticInnerMethod() {
			System.out.println("Hello from non static inner method of static inner class");
		}
	}
}
