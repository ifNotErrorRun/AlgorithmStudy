# 🖥 알고리즘 스터디

[![Moon.svg](https://dday-widget.minung.dev/widget?text=Study%20Start!&date=2024-08-22&startDate=2023-01-01&theme=theme3)](https://dday-widget.minung.dev)

| 목차 | 내용 |
| ------- | ----------------|
| 진행 기간   | 2024년 8월 22일 ~ |
| 스터디 장소 | 온라인 (디스코드) |
| 스터디 시간 | 매주 목요일 22:00 ~ 23:00 [1h] |
| 문제 플랫폼 | 백준 |

<br/>

## 🧑🏻‍🎓 스터디 멤버

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/ifNotErrorRun">
        <img src="https://avatars.githubusercontent.com/u/105318588?v=4" width="100px;" alt=""/>
        <br />
        <sub>김찬호</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/d0vetam3r">
        <img src="https://avatars.githubusercontent.com/u/99699005?v=4" width="100px;" alt=""/>
        <br />
        <sub>김세훈</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Park107">
        <img src="https://avatars.githubusercontent.com/u/178287847?v=4" width="100px;" alt=""/>
        <br />
        <sub>박상희</sub>
      </a>
    </td>

  </tr>
</table>

<br/>

<details>
  <summary><h4>이전 참여 멤버</h4></summary>

  <div>
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/saysuhyun">
        <img src="https://avatars.githubusercontent.com/u/172836819?v=4" width="100px;" alt=""/>
        <br />
        <sub>최수현</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/totoro1009">
        <img src="https://avatars.githubusercontent.com/u/176352066?v=4" width="100px;" alt=""/>
        <br />
        <sub>임정희</sub>
      </a>
    </td>
  </tr>
</table>
  </div>
</details>

<br/>

## 📌 스터디 규칙

- 스터디는 온라인으로 `1시간을 기본`으로 하고 문제 난이도에 따라 `30분을 추가 연장`한다.
    - 각 주차별 맡은 문제의 풀이과정을 발표 후 QnA진행
    - 각자 힘들었던 문제 혹은 풀지못한 문제가 있다면 같이 공유 후 토의
- 스터디 마지막 10분 정도는 다음 프로젝트를 위한 간단한 토론을 진행한다.
- `스터디 시작 전까지 PR`을 완료한다.
- 스터디장은 스터디가 끝난 후 PR들을 확인 후 문제가 없으면 MR한다.
- 스터디원은 총 3회 불참시 `강퇴`  ( 1달에 한 번 면제 가능 )

<br/>

## 🔍 참여 방법

1. 이 저장소를 `fork` 한다.
2. 생성된 저장소에 `각자 이름`으로 폴더를 생성한다.
3. 알고리즘 풀이 후 원본 저장소에 `PR`를 보낸다.

- 기타 : 모르거나 다 같이 풀이를 했으면 하는 문제에 대해서는 `Issue`를 등록한다
- 아래 나와있는`Repository 폴더 구조`와 `Convention 규칙`을 지키면서 참여한다.

<br/>

## 📁 Repository 폴더 구조

```
{각자 이름}/{주차}/BOJ_{문제번호}.{확장자}
```

- 💡 예시: `suhyun/1week/BOJ_1010.java`

<br/>

## ⚠Convention 규칙

> commit 컨벤션은 gitmoji 와 AngularJS Git Commit Message Conventions을 참고했습니다.

### **Issue**

```
 [해당 주차] {문제이름} - {작성자}  
```  

- 💡 예시: `[1주차] 다리놓기 - 최수현`

### **PR - 알고리즘 문제**

```
 [해당 주차] 제출 - {이름}  
```

- 💡 예시: `[1주차] 제출 - 최수현`

### **PR - 알고리즘 문제 외 파일**

```
 [해당 날짜] {간략한 수정 내역} - {이름}  
```

- 💡 예시: `[2024/08/14]  초기 문서 정리 - 최수현`

### **Commit - 알고리즘 문제**

```
 태그: {문제이름} {파일명}
``` 

- 💡 예시: `feat: 다리놓기 BOJ_1010.java`

### **Commit - 알고리즘 문제 외 파일**

```
 태그: {파일명} {작업 내용}
```

- 💡 예시: `docs: README.md  전반적인 항목 수정`

### **태그**

| 태그       | 설명                         |
|:---------|:---------------------------|
| feat     | 새로운 문제 추가                  |
| fix      | 버그 혹은 충돌 수정                |
| refactor | 코드 리팩토링                    |
| comment  | 주석 추가(코드 변경 X) 혹은 오타 수정    |
| docs     | README와 같은 문서 혹은 그 외 파일 수정 |
| rename   | 파일, 폴더명 수정 혹은 이동           |

<br/>
