public class garbageCollector {
	public static void main(String[] args) 
	{
		garbageCollector gc = new garbageCollector();
		gc = null; //non-referencing object gc so it will be garbage collected
		System.gc(); // requesting for garbage collection, but it is soley depend on JVM whether to garbage collect or not
	}
	
	public void finalize() 
	{
		// finalize() method is invoked by garbage collection thread before collecting object, so that necessary stuffs can be done by the object before garbage collected
		System.out.println("Garbage Collected!");
	}
}
