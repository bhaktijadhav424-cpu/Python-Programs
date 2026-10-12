def analyze_marks(*args):

    total = 0
    count = 0
    highest = None
    passing_count = 0

    for marks in args:

        total = total + marks
        count = count + 1

        if highest is None or marks > highest:
            highest = marks

        if marks >= 40:
            passing_count = passing_count + 1

    if count == 0:
        return 0, 0, 0, 0

    average = total / count

    return total, average, highest, passing_count


result = analyze_marks(35, 72, 80, 45, 90, 30)

print("Total:", result[0])
print("Average:", result[1])
print("Highest:", result[2])
print("Passing count:", result[3])


# Output= Total=352
#Average= 58.6666666666664
#Highest = 90
#Passing_Count =4
