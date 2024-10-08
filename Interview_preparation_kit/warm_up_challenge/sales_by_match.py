#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'sockMerchant' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER_ARRAY ar
#

def sockMerchant(n, ar):
    # Write your code here

    count_dict = {}
    
    # Count occurrences of each element
    for elem in ar:
        if elem in count_dict:
            count_dict[elem] += 1
        else:
            count_dict[elem] = 1


    pair_count = 0

    # Calculate the number of pairs for each color
    for count in count_dict.values():
        pair_count += count // 2 
        return pair_count
            
    
if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    #fptr.write(str(result) + '\n')

    #fptr.close()