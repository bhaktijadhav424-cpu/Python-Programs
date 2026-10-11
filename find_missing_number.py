def find_missing(numbers, n):
    total = n * (n + 1) // 2
    for num in numbers:
        total = total - num
    return total
numbers = [1,2,4,6,3,7,8]
n = 8
print("Using Sum Formula:",find_missing(numbers, n))
numbers = [2,3,4,5]
n = 5
print("Additional Test Case:",find_missing(numbers, n))
def find_missing_xor(numbers, n):
    xor = 0
    for i in range(1, n + 1):
        xor = xor ^ i
    for num in numbers:
        xor = xor ^ num
    return xor
numbers = [1,2,4,6,3,7,8,]
n = 8
print("Using XOR",find_missing_xor(numbers,n))


 #Output =  
#Using Sum Formula : 5
#Additional Test case  1
#Using XOR : 5