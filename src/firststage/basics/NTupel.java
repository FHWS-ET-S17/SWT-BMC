package firststage.basics;

public class NTupel {

	private int tupDim;
	private Double tupValues[];

	public NTupel(int tupDim) {
		this.tupDim = tupDim;
		tupValues = new Double[tupDim];
	}

	public Double getValueAt(int index) {
		if (index < 0 || index > getTupDim() - 1)
			return null;
		else 
			return tupValues[index];
	}
	
	public void setValueAt(int index, double newValue){
		if (index < 0 || index >= tupDim) return;
		tupValues[index]= newValue;
	
	}

	public void setTupValues(Double[] tupValues) {
		//TODO Überprüfung von tupDim
		this.tupValues = tupValues;
		this.tupDim=this.tupValues.length;
	}
	
	
	public int getTupDim() {
		return tupDim;
	}

	public NTupel(Double tupValues[]) {
		tupDim = tupValues.length;
		/*
		 * this.tupValues = new Double[tupDim]; for (int i=0; i<tupDim; i++){
		 * this.tupValues[i]= tupValues[i]; }
		 */
		this.tupValues = tupValues.clone();
		// this.tupValues=tupValues;
	}

	// int add (int i1, int i2);
	public static NTupel add(NTupel oneT, NTupel anotherT) {
		if (oneT.getTupDim() == anotherT.getTupDim()) {
			NTupel result = new NTupel(oneT.getTupDim());
			for (int i = 0; i < result.tupDim; i++) {
				// Zugriff auf Instanzvariable über getter zu bevorzugen
				result.tupValues[i] = oneT.getValueAt(i) + 
						anotherT.tupValues[i];
			}
			return result;
		}
		return null;
	}
	
	public double squareSumRoot(){
		double sum=0;
		for (int i=0; i<tupDim; i++){
			//sum = sum + this.tupValues[i]*this.tupValues[i];
			sum = sum + Math.pow(this.tupValues[i],2.0);
		}
		return Math.pow(sum, 0.5);
	}

	public static void main(String[] args) {
		NTupel tup1 = new NTupel(3);
		System.out.println("tupDim: Erwartet 3, geliefert: " +
					tup1.getTupDim());
		tup1 = new NTupel(new Double[] { 3.5, 4.3 });
		System.out.println("tupDim: Erwartet 2, geliefert: " +
				tup1.getTupDim());

	}

}
