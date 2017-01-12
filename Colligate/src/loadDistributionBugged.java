public class loadDistributionBugged {

	static int maxLoad(int[] cabinets, int numberOfWorkers) {
		if (numberOfWorkers > cabinets.length)
			return -1;

		int i, x;
		int low = -1;
		int high = 0;
		int required = 1, currentCabinets = 0;

		for (i = 0; i < cabinets.length; ++i) {
			//if (low < cabinets[i])
				low = cabinets[0];   // set the minimum load of given loads
			high += cabinets[i]; 
			
		}
//			System.out.print("dscsk="+high+" low=="+low);

		int j=1;

		while (low < high) {
			
		
			x = low + (high - low) / 2; 
			
			//System.out.println(i+"x = "+x+" low=="+low);
			required = 1;
			currentCabinets = 0;
			for (i = 0; i < cabinets.length; ++i) {
				if (currentCabinets + cabinets[i] < x) {
					currentCabinets += cabinets[i];
				} else {
					++required; //If current load is raised above our current optimum then start assigning work to next worker
					currentCabinets = cabinets[i];
					 //System.out.print(""+required);
				}
			}
				//+
			
			//System.out.print("high="+high+" ");

			if (required <= numberOfWorkers) 
				high = x-1;
			    
			else {
				low=x+1;
            } 
			     
		}

		return high;
	}

	public static void main(String[] args) {
		int cabinets[] = { 12, 34, 67, 90 }; // work to be assigned to workers
		int numberOfWorkers = 2;
		System.out.println("The maximum load for a worker after distribution is "+ maxLoad(cabinets, numberOfWorkers));
	}

}
