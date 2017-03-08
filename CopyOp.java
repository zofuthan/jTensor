// Wrapper for a unary function
public abstract class CopyOp{
	public abstract double execute(double input);

	public static final CopyOp identity = new CopyOp(){
		public double execute(double input){
			return input;
		}
	};
}