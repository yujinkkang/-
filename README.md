# Algorithm-study
algorithm_study

<자료구조 - 우선순위 큐와 힙>
<p>
 ● 일반적인 큐 (Queue): First In First Out<br/>
   &nbsp;&nbsp;▶어떤 부가적인 조건없이 먼저 들어온 데이터가 먼저 나가는 구조<br/>
 ● 우선순위 큐 (Priority Queue): "힙" 자료구조를 가지고 구현<br/>
   &nbsp;&nbsp;▶들어간 순서와 상관없이 우선순위가 높은 데이터가 먼저 나오는 것<br/>
</p>
<p>
   <br/>
   [※주의] 왜 우선순위 큐는 배열이나 연결리스트로 구현하지 않을까?<br/>
   ● 배열: 우선순위가 중간인 것이 들어가야하는 삽입과정에서는 뒤에 데이터까지 인덱스를 모두 한칸씩 밀어야하는 단점 존재<br/>
     &nbsp;&nbsp; ✔ 삭제: O(1) / 삽입: O(n)<br/>
   ● 연결리스트: 삽입의 과정이 배열과 마찬가지로 위치를 찾아야 한다. 최악의 경우 맨끝까지 가게 된다.<br/>
     &nbsp;&nbsp; ✔ 삭제: O(1) / 삽입: O(n)<br/>
 </p>
 <p>
    ★그렇다면 힙!(Heap)<br/>
    &nbsp;&nbsp; - 힙의 경우, 삭제나 삽입과정에서 모두 부모와 자식의 비교만 계속 이루어진다.<br/>
    &nbsp;&nbsp; - 이진트리의 높이가 하나씩 증가할 때마다 저장가능한 자료의 개수는 2배 증가, 비교연산횟수는 1회 증가<br/>
    &nbsp;&nbsp; ✔ 삭제: O(log2n) / 삽입: O(log2n) --> 🛑 월등히 우위에 있다! <br/>
 </p>
 <p>
  ● 힙(Heap)<br/>
  <a><img src ="https://www.cdn.geeksforgeeks.org/wp-content/uploads/Leaf-starting-point-in-a-Binary-Heap-data-structure.png"></img></a><br/>
   &nbsp;&nbsp; ① 힙은 "완전이진트리"이다. "Complete Binary Tree"<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 완전이진트리란? 트리의 한종류 <br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'완전'-> 부모는 자식을 왼쪽부터 추가하는 모양을 유지한다는 뜻<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'이진' -> 부모가 가질 수 있는 자식의 개수는 최대 2개라는 의미<br/>
   &nbsp;&nbsp; ② 모든 노드에 저장된 값(우선순위)들은 자식노드들의 것보다 우선순위가 크거나 같다.<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 직접연결된 자식 - 부모 노드간의 크기만 비교<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* 힙으로 우선순위 큐를 구현할 때는 노드에 저장된 값을 우선순위로 본다.<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;따라서 힙은 루트노드에 우선순위가 높은 데이터를 위치시키는 자료구조가 된다.<br/><br/>
 </p>
 <p>
 <최대힙과 최소힙><br/><br/>
 <a><img src ="https://api.ahribori.com/image/XgqyLSwQwvUL8-2QXmDVYLJQ.png"></img></a><br/><br/>
 &nbsp;&nbsp; ·  루트노드에는 우선순위가 가장 높은 것이 자리잡게 된다.<br/>
 &nbsp;&nbsp; ·  마지막노드에는 우선순위가 가장 낮은 것이 자리잡게 된다.<br/>
 &nbsp;&nbsp; ·  최소힙에 저장할 때<br/> 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 아래서 위로 비교 : 새 노드를 '우선순위가 가장 낮다는 과정을 하고' '맨끝 위치'에 저장<br/>
 &nbsp;&nbsp; ·  최소힙에서 삭제할 때<br/> 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 위에서 아래로 비교 : 우선 순위 큐에서의 데이터 삭제는 곧, 가장 우선순위가 높은 데이터('루트 노드)를 빼낸다는 의미가 된다. <br/>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp;루트노드를 삭제하면서 힙의 구조를 그대로 유지하는 게 삭제의 관건<br/>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ▶ 삭제 과정<br/>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(1)루트 노드를 반환(삭제)하고 마지막 노드를 루트 노드 자리에 옮긴다.<br/>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(2)비교진행<br/>
 </p>
