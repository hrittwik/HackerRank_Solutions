testcase = int(input())

for i in range(0, testcase):
    string = input().strip()
    string_list = list(string)
    #print(string_list)
    even_char = ""
    odd_char = ""
    for j in range(0, len(string_list)):
        if(j % 2 == 0):
            even_char += string_list[j]
        else:
            odd_char += string_list[j]

    print(even_char + " " + odd_char)
