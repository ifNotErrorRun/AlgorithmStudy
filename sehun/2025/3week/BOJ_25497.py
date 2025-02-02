# n은 파이썬에서는 필요가 없을듯
# input으로 성능에 크게 영향을 끼칠 것 같진 않으니까 그냥 input()으로...
n = input()
line = input()
# 유효한 기술 수
count = 0
# LR과 SK을 나눠서 스택으로 구현해봄
lr = []
sk = []

# 사전기술과 본기술의 dict
SKILL_LIST = {"L": "R", "S": "K"}

for char in line:
    # 사전기술 L
    if char == "L":
        lr.append(char)
    # 사전기술 S
    elif char == "S":
        sk.append(char)
    # 노연계기술
    elif char.isdigit():
        count += 1
    # 연계기술(본기술) R
    elif lr and char == "R":
        lr.pop()
        count += 1
    # 연계기술(본기술) K
    elif sk and char == "K":
        sk.pop()
        count += 1
    # 콤보 실패
    else:
        break
print(count)
