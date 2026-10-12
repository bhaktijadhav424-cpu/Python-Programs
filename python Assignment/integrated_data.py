def process_numbers(numbers):
    total = 0
    count = 0
    largest = 0
    for num in numbers:
        if num >= 0 and num % 2 == 0:
                square = num * num
                print(square)
                total += square
                count +=  1
                if square > largest:
                    largest = square
            
    return total, count, largest
numbers = [-2,1,2,3,4,6,-8]
a, b, c = process_numbers(numbers)
print("Total:", a)
print("Count:", b)
print("largest:", c)


# Output= 
Total= 56
Count= 3
largest= 36
