

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/**
		 * First we create an experiment object.
		 * This object automatically writes outputs in the current location
		 */
		Experiment ex = new Experiment();
		double total_util = 3.5;
		int total_vms = 10;
		ex.RandomComponents(true, total_util, total_vms);	

	}

}
