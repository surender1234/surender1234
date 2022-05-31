a = [1,2,"a",5.5,10,"python"]
print (a)
print(a[1])

#a = (1,2,"a",5.5,10,"python")
#print (a)
#print(a[1])

a[2] = 45
print (a)
a.append(22)
print (a)

a = [1,2,'a',5.5,10,'python']
for i in a:
    print(i)
 
a = [1,2,'a',5.5,10,'python']
for i in range(len(a)):
    print(i,a[i]) 
    

new_list = []
a = ['c','c++','java','python', 'program']

for i in a:
  if "p" in i:
     new_list.append(i)
     
print(new_list)  
print(a)
a.sort()
print(a)

  
