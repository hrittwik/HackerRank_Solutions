#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the factorial function below.
def factorial(n):
    if( n >= 2 and n <= 12 ):
        if n != 0:
            n = n * factorial(n-1)
    return n
    
    
if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')


    n = int(input())

    result = factorial(n)

    print(result)
    #fptr.write(str(result) + '\n')

    #fptr.close()
