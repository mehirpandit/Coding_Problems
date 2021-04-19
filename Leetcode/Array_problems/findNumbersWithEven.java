//Find Numbers with Even Number of Digits

public int findNumbers(int[] nums) {
	int sol = 0;                            
	for(int n : nums)                       
		if(getNumberOfDigits(n) % 2 == 0)  
			sol++;                          
	return sol;                             
}

public int getDigits(int num) {
	int count = 1;                          
	while((num /= 10) != 0)                 
		count++;                            
	return count;
}


/*

public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++) {
            if(Integer.toString(nums[i]).length()%2==0) res++;
        }
        return res;
    }


*/
