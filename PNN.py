Non_Zero=[]
for i in numbers:
 if i != 0:
  Non_Zero.append(i)
Zero_count = Numbers.count(0)
result= Non_Zero + (0) *Zero_count
print(result)

