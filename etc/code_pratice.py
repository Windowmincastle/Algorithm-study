'''
톱니바퀴 A를 회전할 때, 그 옆에 있는 톱니바퀴 B와 서로 맞닿은 톱니의 극이 다르다면, B는 A가
회전한 방향과 반대방향으로 회전하게 된다.

N극은 0, S극은 1
12시 방향부터 시계방향 순서대로 주어진다.

3번 톱니바퀴를 반시계로 돌린다면? 3번이 회전을하는데
4번은 시계방향으로
2번은 같으니까 전달이 안된다.
즉,
명령을 받은 n번 톱니바퀴를 돌리고
오른쪽과 왼쪽으로 뻗어가면서 다른 극성이라면 돌려주고 같은 극성이라면 전파하지 않아도 된다.

구현으로본다면 12시가 기준이니까 12시를 기준으로 두고 회전한다는건? 기준이 바뀌는 것 이랑 똑같다.

회전을 어떻게 구현할거냐? top 값을 증가시키거나 감소
'''