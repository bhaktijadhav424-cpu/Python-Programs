def longest_run(numbers):
    count = 1
    max_count = 1
    for i in range(1,len(numbers)):
        if numbers[i] == numbers[i - 1]:
            count += 1
        else:
              count = 1
        if count > max_count:
                max_count = count
    return max_count
numbers = [1,1,2,2,2,3,3,1,1,1,1]
print(longest_run(numbers))
numbers = [7,7,7,7]
print(longest_run(numbers))


# 4
# 4
