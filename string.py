a= "Hello world"
print (a)

b = """ this is a
      Docstring """
      
print (b)

# string slicing
a= "Hello world"
print (a[0:8]) # 0 to n-1
print (a[:8])
print (a[2:])
print (a[2:8])
print (a[-8:-2])
#spliting
a= "Hello, world"
b=a.split(",")
print(b)
#cancatenation
a= "hello" 
b = "world"
print(a+b)   #helloworld
print(a+" "+b)  #hello world

#format
a= "hello" 
b = 22
y = "{}{}"
print(y.format(a,b)) # hello22 
#Escape charector:
#String with in the string
y = " This is a \"python\" hands on"
print(y)
#string methods
a= 'hello world'
y=a.upper()
print(y)
a= "     python    "
y=a.strip()
print(y,"is good programming")

a = "hello world"
y= a.find("world")
print(y)

count = 0
for i in "python program":
    if(i=='p'):
       count = count + 1
print(count)
  
    

