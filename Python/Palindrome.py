def is_palindrome(s):
    s = s.replace(" ", "").lower()
    return s == s[::-1]

inp = input("Enter a string: ")
if is_palindrome(inp):
    print( inp,"is a palindrome.")
else:
    print(inp,"is not a palindrome.")
