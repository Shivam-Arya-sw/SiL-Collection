def is_lucky_number(n):
    count=2
    while count<=n:
        if n%count==0:
            return False
        n-=n//count
        count+=1
    return True
    
num=int(input("Enter the number: "))
if is_lucky_number(num):
    print(num," is a lucky number.")
else:
    print(num," is not a lucky number.")