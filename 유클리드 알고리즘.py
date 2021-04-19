# # 최대 공약수를 구하는 알고리즘
def euclid(x,y):
    t = x % y
    while (t != 0):
        x = y
        y = t
        t = x % y
    return y

euclid(12,8)
euclid(221,143)

# 재귀함수 사용
# def euclid(x,y):
#     t = x % y
#     x, y = y, t
#     if (t == 0):
#         return x
#     return euclid(x,y)

#재귀 함수 2
# def euclid(x,y):
    # if x%y == 0:
    #     return y
    # return euclid(x, x%y)


# euclid(12,8)
# euclid(221,143)