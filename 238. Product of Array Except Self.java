int zeroCount = 0;//1
        int product = 1;
        int[] res = new int[nums.length];
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                product = product*nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(zeroCount==1){
                res[i] = nums[i]==0?product:0; 
            }

            else if(zeroCount>1){
                res[i]=0;
            }
            else {
                res[i] = product/nums[i] ;

            }

        }

        return res;
