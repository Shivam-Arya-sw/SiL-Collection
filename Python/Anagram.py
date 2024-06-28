def are_anagram(s1="",s2=""):
    s1=s1.lower()
    s2=s2.lower()
    if len(s1)!=len(s2):
        return False
    else:
        s1=sorted(s1)
        s2=sorted(s2)
        
        return s1==s2


s1 = input("Enter the first word: ")
s2 = input("Enter the second word: ")    
if are_anagram(s1, s2):
    print("ANAGRAM")
else:
    print("NOT ANAGRAM")