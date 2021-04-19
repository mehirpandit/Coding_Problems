//Find Numbers with Even Number of Digits

public int findNumbers(int[] nums) {
	int sol = 0;                            // Solution variable initialised to 0
	for(int n : nums)                       // Iterate over each number
		if(getNumberOfDigits(n) % 2 == 0)   // Call getNumberOfDigits which return the total number of digits in the number
			sol++;                          // if even number of digits are returned we increment sol by 1
	return sol;                             
}

public int getNumberOfDigits(int num) {
	int count = 1;                          // Initialise count to 1, not 0 cause we are dividing num/10 in while loop
	while((num /= 10) != 0)                 // Iterate until number is 0
		count++;                            // Increment count until number is 0
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
