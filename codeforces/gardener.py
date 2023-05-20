t= int(input())
while t:
    s = str(input())
    i =0
    j = len(s) -1

    while i < j:
        if s[:i+1] >= s[i+1:j] <= s[j:]:
            print(s[:i+1],end=" ")
            print(s[i+1:j],end=" ")
            print(s[j:])
            break
        
        elif s[:i+1] < s[i+1:j] > s[j:]:
            print(s[:i+1],end=" ")
            print(s[i+1:j],end=" ")
            print(s[j:])
            break
        elif s[:i+1] > s[i+1:j] > s[j:]:
            j -=1
        elif s[:i+1] < s[i+1:j] < s[j:]:
            i +=1
        else:
            i += 1
            j -= 1
    t -= 1
