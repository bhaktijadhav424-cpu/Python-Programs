def second_largest(numbers):
    largest = None
    second = None

    for num in numbers:

        if largest is None or num > largest:
            second = largest
            largest = num

        elif num != largest and (second is None or num > second):
            second = num

    return second


numbers = [12, 35, 1, 10, 34, 35]

result = second_largest(numbers)

if result is None:
    print("Second largest element does not exist")
else:
    print("Second largest distinct element:", result)

    # Output= 34
    