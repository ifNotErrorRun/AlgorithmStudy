# https://www.acmicpc.net/problem/2750
# feat: 그대로 출력하기 2 BOJ_11719.py

while True:
    try:
        a = input()
        print(a)
    except EOFError:
        break

# 파이썬은 원래 공백 다 그대로 받음
# EOFError란: python의 예외 처리 중에서 '사용자의 입력이 끝났을 때, 파일의 끝일 때, 더이상 들어올 값이 없을 때' 사용.
# + None과의 비교: None은 값이 아예 없다는 뜻. 입력이 끝났을 때는 EOF로 봐야 함. (ChatGPT, 기술블로그 참고. 제가 뭔가 잘못 이해한 부분이 있을지도 모르겠습니다...)