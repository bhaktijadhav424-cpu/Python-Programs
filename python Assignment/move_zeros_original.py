numbers = [0, 1, 0, 3, 12, 0, 5]
index = 0
for num in numbers:
    if num != 0:
        numbers[index] = num
        index += 1
while index < len(numbers):
            numbers[index] = 0
            index += 1
print(numbers)