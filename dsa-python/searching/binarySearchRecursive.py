def binarySearchRecursive(arr,target,start,end):
    mid = (start+end) // 2
    if(start <= end):  
      if(target < arr[mid]):
          return binarySearchRecursive(arr,target,start,mid-1)
      elif (target > arr[mid]):
          return binarySearchRecursive(arr,target,mid+1,end)
      elif(target == arr[mid]):
          return target,mid
    else:    
      return -1            

arr = [1,2,3,4,5];
n = len(arr)
result = binarySearchRecursive(arr,11,0,n-1)

if(result!=-1):
    el,i = result
    print("The element {0} is found at index {1}!".format(el,i))
else:
    print("The target element is not in the array!")    
    