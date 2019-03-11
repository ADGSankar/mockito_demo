 package com.example.mockito.mockito_demo;

public class SomeBusinessImpl {

	private DataService1 dataService;
	
	public SomeBusinessImpl(DataService1 dataService) {
		super();
		this.dataService = dataService;
	}



	int findGreatestFromAllData()
	{
		int[] data=dataService.retriveAllData();
		int greatest=Integer.MIN_VALUE;
		for (int i : data) {
			if(i>greatest)
			{
				greatest=i;
			}
		}
		return greatest;
	}
	
	
}

