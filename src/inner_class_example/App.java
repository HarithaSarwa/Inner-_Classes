package inner_class_example;

public class App {

	public static void main(String[] args) {
		
		Person_Outer o = new Person_Outer();
		o.outerMethod();
		
		Person_Outer.EducationPublicInner i = o.new EducationPublicInner();
		i.innerPublicMethod();
		
		Person_Outer.FamilyPublicInnerStatic.staticInnerMethod();
		
		Person_Outer.FamilyPublicInnerStatic s = new Person_Outer.FamilyPublicInnerStatic();
		s.nonStaticInnerMethod();
	}

}
