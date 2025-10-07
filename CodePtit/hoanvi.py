def hoanvi(a, n):
    for i in range(n - 1, 0, -1):
        if (a[i] < a[i + 1]): 
            break
        if i == 0: return False
        for j in range (n, i + 1, -1):
            if a[j] > a[i]:
                a[i], a[j] = a[j], a[i]
                l = i + 1, r = n
                while l < r:
                    a[l], a[r] = a[r], a[l]
                    l++, r--
    return True

a = [1, 2, 3, 4]
n = 4
while hoanvi(a, n):
    print(a)