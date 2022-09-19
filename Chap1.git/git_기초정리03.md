# Git-flow 방법론, Git 더 쉽게 사용하기

&nbsp;

## 1. Git-flow 방법론

- Git-flow 방법론은 git을 사용할때의 관례적인 표준개발방법론이다.
- branch를 5가지의 브랜치(hotfix, main, develop, feature, release)를 통해 운영하는 것으로 용어만 몰랐을 뿐이지 이미 경험했을 수도 있다.

&nbsp;

### 1.1 Git-flow 더 쉽게 사용하자
- 프로젝트 시작시 5가지의 브랜치를 생성하고, 병합하거나 릴리즈할때마다 브랜치를 옮기고 병합하고 이 모든것을 명령어로 하나하나씩 입력하며 사용하는 작업을 효율적으로 할 수 있게 도와주는 유틸이 있다.

 - [사이트 주소] https://danielkummer.github.io/git-flow-cheatsheet/index.ko_KR.html

&nbsp;

 - ![git-flow-commands](https://user-images.githubusercontent.com/46203866/190970029-1692842a-3b5c-423e-a190-1a92abdb6b38.png)
   - [그림] git-flow 명령어 조합방법 

&nbsp;

|명령어|설명|
|:---:|:---|
|git flow init|git-flow를 사용하기 위한 초기화, develop 브랜치까지 자동생성함|
|git flow feature start [브랜치 이름]|입력한 브랜치 이름을 생성하고 해당 브랜치로 이동|
|git flow feature finish [브랜치 이름]|입력한 브랜치를 develop 브랜치에 병합하고 해당 브랜치를 삭제|
|git flow release start [브랜치 이름]|feature start 과정과 동일|
|git flow release finish [브랜치 이름]|feature finish 과정과 동일<br> 단, commit시 태그 입력후 git push --tags 명령어로 태그도 저장하자|
