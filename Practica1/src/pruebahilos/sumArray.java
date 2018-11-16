package pruebahilos;

public class sumArray {
	private int sum;
	
	synchronized int sumArray(int nums[]) {
		sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			System.out.println("Total acumulado de "+Thread.currentThread().getName()+" es "+sum);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("Hilo interrumpido");
		}
		return sum;
	}

}
