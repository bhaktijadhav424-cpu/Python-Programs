def salary_details(salary):
    b = [] 
    for i in salary:
        if i > 50000:
            b.append(i)
            highest = b[0]
            lowest = b[0]
            total = 0
            for i in b:
                if i > highest:
                    highest = i
                    if i < lowest:
                        lowest = i
                        total = total + i
                        average = total / len(b)
                        return highest.lowest.average
                    print( salary_details ([40,000,55000,60,000,45,000 ,75,000, 80,000]))