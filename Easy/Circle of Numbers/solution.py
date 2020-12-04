# taking input
userInput = input()
tempList = userInput.split()
total = int( tempList[0] )
member = int( tempList[1] )

# calculating and printing
required = total // 2
if member >= required:
  print( member - ( required ) )
else:
  print( member + ( required ) )
