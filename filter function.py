def add(a, b):
    return a + b
numbers = [1,2,3,4,5]
result = reduce(add, numbers)
print(result)

