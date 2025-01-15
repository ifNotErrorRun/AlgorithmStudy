import sys

# 테스트 케이스 수
n, m = map(int, sys.stdin.readline().split())

# 노래 저장 딕셔너리(辞書タイプ)
songs = {}


# 노래 입력
for _ in range(n):
    # 입력받은 문자열을 배열로 변환
    input = sys.stdin.readline().split()

    # 곡제목
    key = input[1]

    # 첫 3개의 음을 slice를 이용하여 저장함
    # https://docs.python.org/ko/3.13/library/stdtypes.html#common-sequence-operations
    # input이 ['11', 'TwinkleStar', 'C', 'C', 'G', 'G', 'A', 'A', 'G']인 경우
    # input[2:5]은 2번부터 5번까지의 슬라이스이므로 결과값은 ['C', 'C', 'G']가 됨
    value = input[2:5]

    # 딕셔너리로 저장함
    songs[key] = value

# 계이름 입력, 곡 검색
for _ in range(m):
    # 검색할 계이름 입력
    input_pitches = list(map(str, sys.stdin.readline().split()))
    # 일치하는 노래 카운트 변수
    matched_count = 0
    # 일치하는 곡 제목
    song_name = ""

    # 저장된 곡을 순회
    # dict변수.items()는 key와 value쌍을 출력 가능
    # for song in songs:의 경우에는 key만 순회함
    for song, pitches in songs.items():
        if input_pitches == pitches:
            matched_count += 1
            song_name = song
    if matched_count == 0:
        print("!")
    elif matched_count == 1:
        print(song_name)
    else:
        print("?")
