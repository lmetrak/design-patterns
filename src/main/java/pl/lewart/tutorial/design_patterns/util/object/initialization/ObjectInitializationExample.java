package pl.lewart.tutorial.design_patterns.util.object.initialization;

public class ObjectInitializationExample {
	
	public static void main(String[] arguments) {

		
		ObjectInitialization obj1 = new ObjectInitialization();
		obj1.setObjectName("Kowalsky");
		
		ObjectInitialization obj2 = new ObjectInitialization(obj1);
		System.out.println("ObjectInitialization - obj1.objectName: " + obj1.getObjectName());
		System.out.println("ObjectInitialization - obj2.objectName: " + obj2.getObjectName());
		obj2.setObjectName("Nowak");
		
		System.out.println("ObjectInitialization - obj1.objectName: " + obj1.getObjectName());
		System.out.println("ObjectInitialization - obj2.objectName: " + obj2.getObjectName());
		
	}
}
