array = [8,6,7,5,3,0,9,4,-2,2]

def kadane(array):
    maxEndingHere = array[0]
    maxSoFar=array[0]
    for num in array:
        maxEndingHere = max(num, maxEndingHere+num)
        maxSoFar = max(maxSoFar, maxEndingHere)
    return maxSoFar

print(kadane(array))