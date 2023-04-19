def linearSearch(arr,target):
    for i in range(0,len(arr)):
        element = arr[i]
        if(target == element):
            return element,i
    return -1
    
arr = [1,2,3,4,5,6]

result = linearSearch(arr,4)
if(result != -1):
    el,i = result
    print(f"The element {el} is found at index {i}",el,i)
else:
    print("Element not found")