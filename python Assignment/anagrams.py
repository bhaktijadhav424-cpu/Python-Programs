def are_anagrams(first,second):
    first = first.replace(" "," ").lower()
    second = second.replace(" ", " ").lower()
    return sorted(first) == sorted(second)

first = "listen"
second = "silent"
print(are_anagrams(first,second))

first = "hello"
second = "world"
print(are_anagrams(first,second))

# True
# False
