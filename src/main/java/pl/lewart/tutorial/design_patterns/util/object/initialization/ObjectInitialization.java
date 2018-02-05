package pl.lewart.tutorial.design_patterns.util.object.initialization;

public class ObjectInitialization {

	private String objectName;
	private static String staticString;
	
	protected boolean	_boolean; //false
	protected byte _byte; //0
	protected short _short; //0
	protected int	_int; // 0
	protected long _long; // 0L
	protected char _char; // \u0000
	protected float _float; //0.0f
	protected double _double; // 0.0d
	protected Object _object; // null
	
	{
		staticString = "first";
		System.out.println("#FIRST_INITIALIZATION");
	}
	{
		staticString = "second";
		System.out.println("#SECOND_INITIALIZATION");
	}
	
	public ObjectInitialization() {
		
		System.out.println("#FOURTH_INITIALIZATION - constructor without argument");
		System.out.println("#staticString: " + staticString);
		System.out.println("example of default fields initialization: " + this.toString());
	}
	public ObjectInitialization(ObjectInitialization objectInitializationExample) {
		//this constructor shows access to private field from other the same object

		System.out.println("#FOURTH_INITIALIZATION - constructor with argument");
		System.out.println("#staticString: " + staticString);
		this.objectName = objectInitializationExample.objectName;
		System.out.println("objectName: " + this.objectName);
		
	}
	
	{
		staticString = "third";
		System.out.println("#THIRD_INITIALIZATION");
	}

	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	
	@Override
	public String toString() {
		return "ObjectInitializationExample [_boolean=" + _boolean + ", _byte=" + _byte + ", _short=" + _short
				+ ", _int=" + _int + ", _long=" + _long + ", _char=" + _char + ", _float=" + _float + ", _double="
				+ _double + ", _object=" + _object + "]";
	}
	
}
