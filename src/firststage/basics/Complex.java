package firststage.basics;

public class Complex extends NTupel {
	
	private double absoluteValue, phase;
	
	public Complex(){
		super(new Double[]{0.0,0.0});  //new NTupel();
	}
	
	public Complex(double real, double imag){
		super(new Double[]{real,imag});
	}
	
	public double getReal(){
		return this.getValueAt(0);
		//return super.getValueAt(0);	
	}
	
	public double getImag(){
		return this.getValueAt(1);	
	}
	
	public void setReal(double newReal){
		this.setValueAt(0, newReal);
	}
	

	public void setImag(double newImag){
		this.setValueAt(1, newImag);
	}
	
	public double getAbsoluteValue(){
		return this.squareSumRoot();
	}
	
	public double getPhase(){
		/**
		 * Berechnet die Phase der Komplexen Zahl
		 */
		return Math.atan2(getImag(), getReal());
	}
	
	public static Complex add (Complex c1, Complex c2){
		NTupel sum = NTupel.add(c1,c2);
		return new Complex(sum.getValueAt(0),sum.getValueAt(1));
	}
	
	
	
	public static Complex multiply(Complex c1, Complex c2){
		double newAbsoluteValue = c1.getAbsoluteValue()*c2.getAbsoluteValue();
		double newPhase = c1.getPhase()+c2.getPhase();
		return new Complex(newAbsoluteValue*Math.cos(newPhase),
				newAbsoluteValue*Math.sin(newPhase));
	}
	
	public static Complex divide(Complex c1, Complex c2){
		double newAbsoluteValue = c1.getAbsoluteValue()/c2.getAbsoluteValue();
		double newPhase = c1.getPhase()-c2.getPhase();
		return new Complex(newAbsoluteValue*Math.cos(newPhase),
				newAbsoluteValue*Math.sin(newPhase));
	}

	public Complex(int tupDim, double absoluteValue, double phase) {
		super(tupDim);
		this.absoluteValue = absoluteValue;
		this.phase = phase;
	}
	
	@Override
	public String toString(){
		String result = this.getClass().getSimpleName();
		Double r = getReal();
		Double i = getImag();
		result = result.concat(" Realteil: ").concat(r.toString());
		result = result.concat(" Imaginärteil: ").concat(i.toString());
		
		return result;
	}

}
