# taking input
string = input().lower()

# creating list of alphabets
alphabets = []
for i in string:
	if i.islower() and i not in alphabets:
		alphabets.append(i)

# printing
if len( alphabets ) == 26:
	print( "YES" )
else:
	print( "NO" )
