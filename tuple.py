a = (1,2,'a',5.5,10,'python')
print (a[0])
#a[0] = 30
b=list(a) # conversion from tuple to List 
print(b)
b[0] = 30 # modify the list
a=tuple(b)  # convert back to tuple
print(a)
c=("java",)
a = a+c
print(a)
