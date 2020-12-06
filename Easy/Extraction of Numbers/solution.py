# taking inputs
numberWords = int( input() )
string = input()

# seperating digits and printing
digits = []
for i in string:
	if i.isdigit():
		print( i, end = " ")
