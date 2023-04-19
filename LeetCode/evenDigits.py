nums = [555,901,482,1771]

def numOfEvenDigits(arr):
    count = 0
    for num in arr:
        if(isEven(num)):
            count+=1
    return count

def isEven(num):
    digits = numOfDigits(num)
    return digits % 2 == 0

def numOfDigits(num):
    digits = 0
    while(num > 0):
        digits += 1
        num //= 10
    return digits   
        

totalEven = numOfEvenDigits(nums)        
print(totalEven)