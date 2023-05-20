n, k = map(int,input().split())
m=1;
a = [0]*(n+1)
for i in range(1,n+1):
    if i%2 !=0:
        a[m]=i;
        m+=1


for i in range(1,n+1):
    if i%2 ==0:
        a[m]=i;
        m+=1

print(a[k])
