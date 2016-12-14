meal_cost = float(input())
tip = int(input())
tax = int(input())

#Write your calculation code here.
tip_percent = meal_cost * tip / 100
tax_percent = meal_cost * tax / 100

total_cost = round(meal_cost + tip_percent + tax_percent)
#cast the result of the rounding operation to an int and save it as totalCost
#Print your result
print("The total meal cost is " + str(total_cost)  + " dollars." )
