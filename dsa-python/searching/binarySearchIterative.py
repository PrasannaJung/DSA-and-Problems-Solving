def binarySearchIterative(arr,target):
    start = 0
    end = len(arr) - 1
    while(start <= end):
        mid = (start + end) // 2;
        if(target < arr[mid]):
            end = mid - 1
        elif (target > arr[mid]):
            start = mid + 1;
        elif (target == arr[mid]):
            return target,mid
    return -1


arr = [1,2,3,4,5];

result = binarySearchIterative(arr,5)

if(arr!=-1):
    el,i = result
    print("The element {0} is found at index {1} ".format(el,i))
else:
    print("Element not found")    
    