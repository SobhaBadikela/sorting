package com.application.Sorting.service;

import org.springframework.stereotype.Service;


@Service
public class Sortingservice  {
	public static void bubblesort(int arr[])
    {
        int n = arr.length;
        int temp=0;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

	
	

}
