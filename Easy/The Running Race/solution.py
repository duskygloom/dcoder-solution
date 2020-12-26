# taking inputs
info = input().split()

# splitting info
alex = int(info[1])
ryan = int(info[2])

# printing
if alex < ryan:
    print("Ryan")
elif alex > ryan:
    print("Alex")
else:
    print("Draw")
