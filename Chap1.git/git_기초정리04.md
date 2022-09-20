# Git 추가(add), 커밋(commit), 푸쉬(push) 취소 방법

&nbsp;

## 1. git add 취소하기

- git add를 통해 커밋할 준비를 하는것을 스테이징(stage)이라 하며, 취소를 통해 unstage 상태로 되돌린다.

	|사용 방법|설명|
	|:---:|:---|
	|git reset HEAD|add 모든 파일을 취소하고 unstage 상태로 되돌린다|
	|git reset HEAD [파일이름]|해당 파일의 add를 취소하고 unstage 상태로 되돌린다|

&nbsp;

## 2. git commit 취소하기

- git commit을 통해 파일의 변경사항을 반영할 수 있으며 옵션에 따른 여러 취소방법이 있다.

### 2.1 커밋 취소.. reset vs revert 어떤게 더 좋을까?

- reset : 현재까지의 commit 이력을 남기지 않고 원하는 시점으로 돌아간다.
  - 현재까지 커밋내용을 남기지않고 삭제하며 수정한다.

- revert : 현재까지의 commit 이력을 남기며 원하는 시점으로 돌아간다.
  - 이전 커밋시점으로 돌아가겠다는 이력을 남기며 수정한다.

- reset은 커밋내역들을 깔끔하게 정리할 수 있지만 협업시 코드가 충돌하거나 꼬일 위험이 있다. revert는 커밋내역들을 보존하고 돌아간 이유를 기록할 수 있는 있다. 되도록 revert를 쓰도록하자.

&nbsp;

### 2.2 commit 취소 사용법

- 옵션을 지정하지 않을 경우 기본적으로 mixed로 적용한다.

	&nbsp;

	|옵션 종류|설명|
	|:---:|:---|
	|soft|커밋 차제만 취소하는 옵션. add를 통한 staged 상태|
	|mixed|커밋과 add를 취소하는 옵션. (기본 옵션)|
	|hard|커밋과 add를 취소하고 파일내용도 삭제하는 옵션. 모두 취소하며 작업내용까지 사라지므로 가급적 사용을 자제하자|

	&nbsp;

	|사용 방법|설명|
	|:--:|:---|
	|git revert 또는 reset HEAD^|꺽쇠(^)의 수만큼 이전 커밋단계로 돌아간다|
	|git revert 또는 reset HEAD~(숫자)|업력한 수만큼 이전 커밋단계로 돌아간다|

	&nbsp;

- git revert 또는reset --[사용할옵션] HEAD[^또는(숫자)] 처럼 사용하자
  - git revert --soft HEAD^^
  - git reset --hard HEAD~2

&nbsp;

## 3. git push 취소하기

- 자신의 로컬 상태를 원격저장소에 강제로 덮어쓴다. 되돌아간 커밋 이후의 모든 커밋이 삭제되므로 주의해서 사용해야한다.

- 원하는 시점으로 커밋을 되돌린다.
- 다시 커밋을 진행한다.
- git push -f origin [브랜치이름]

&nbsp;
