# taking input
info = input().split()

# splitting info
minimum = float(info[0])
user = float(info[1])

# printing
if user < minimum:
    print("No")
else:
    print("Yes")
