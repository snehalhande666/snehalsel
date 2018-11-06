package com.finsoft.core;

public class MaxValue {
	public static int findMax(int arr[])
	{
		/*int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
	}
		return max;

	}  */
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(max<arr[i])
			max=arr[i];
		}
	return max;
}
}
