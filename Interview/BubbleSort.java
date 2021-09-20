public class BubbleSort {
	public static void main(String[] args)
	{
		int arr[] = {6,8,9,4,5,7,8,4,3};
		System.out.println("Before Sorting ");
		for(int i : arr)
		{
			System.out.println(i);
		}
		bubbleSort(arr);
		System.out.println("After Sorting");
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

	private static void bubbleSort(int[] arr) {
		
		int temp = 0;
		for(int i=0; i<arr.length;i++){
			for(int j=1;j<(arr.length)-i;j++)
			{
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

}
