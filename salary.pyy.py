def salary_details(salary):
    b = []
    for i in salary:
        if i > 50000:
            b.append(i)

    if len(b) == 0:
        print("50k peksha jast salary konalach nahi")
        return

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

    print("Filtered Salary:", b)
    print("Highest:", highest)
    print("Lowest:", lowest)
    print("Average:", average)

salary_details([45000, 60000, 75000, 90000, 40000, 55000])