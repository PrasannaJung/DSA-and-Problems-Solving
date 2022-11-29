# return the indices of two elements such that they sum upto the given target

def sumsTarget(nums,target):
  for i in range(len(nums)):
    for j in range(i+1,len(nums)):
      if(nums[i]+nums[j] == target):
        return [i,j]


sumsTarget([3,2,4],6)        