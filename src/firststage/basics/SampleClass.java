package firststage.basics;

public class SampleClass {

	private static int createdObjects=0;
	private double dynValue; 
	
	public SampleClass(double dynValue){
		double tmpValue = dynValue;
		this.dynValue = tmpValue;
		createdObjects++;
	}
	
	public void printObjects(){
		System.out.println("Erzeugte Objekte: " +
					createdObjects);
	}
	public void finalize(){
		createdObjects--;
		System.out.println("GC: " + this.dynValue);
	}
	
	public static void main(String[] args) {
		System.out.println("Erzeugte Objekte: " +
					createdObjects);
		SampleClass o1 = new SampleClass(1.0);
		SampleClass o2 = new SampleClass(2.0);
		SampleClass o3 = new SampleClass(3.0);

		
		System.out.println("Erzeugte Objekte: " +
				createdObjects);
		System.out.println("Objekte: " + o1.dynValue + "; " +
				o2.dynValue + "; " + o3.dynValue + "; " +
				createdObjects);
		o2=null;
		o3=null;
		for (int i=0; i< 1000; i++){
			System.gc();
			double x = 24.3 *12;
		}
		System.out.println("Erzeugte Objekte: " +
				createdObjects);
	}

}
