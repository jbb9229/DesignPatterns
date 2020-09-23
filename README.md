# 📚&nbsp;Design Pattern?

## 🤔&nbsp;Design Patterns이란 무엇일까요?

>✍🏼&nbsp; 디자인 패턴의 정의는 소프트웨어 공학 소프트웨어 디자인의 특정 문맥에서 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;공통적으로 발생하는 문제에 대해 재사용 가능한 해결책입니다. <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;소스나 기계 코드로 바로 전환될 수 있는 완성된 디자인은 아니며, <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;다른 상황에 맞게 사용될 수 있는 문제들을 해결하는데에 쓰이는 서술이나 템플릿입니다. <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;디자인 패턴은 프로그래머가 어플리케이션이나 시스템을 디자인할 때 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;공통된 문제들을 해결하는데에 쓰이는 형식화 된 가장 좋은 관행입니다.<br/><br/>
😨&nbsp;정의를 읽어보면 사실 그 뜻이 정확하게 이해가 되지 않습니다.<br/><br/>
🔍&nbsp;좀 더 쉽게 풀어보자면, 우리가 개발을 하면서 접하는 문제들 중 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;대다수는 누군가 이미 같은 문제를 겪었을 확률이 높고, <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;디자인 패턴은 많은 이들이 접하는 문제를 뛰어난 많은 개발자들이 제시한 해결책이라고 볼 수 있습니다. <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;지금부터 여러가지 디자인 패턴과 해당 패턴의 예시 그리고 왜 해당 패턴을 사용하는지 알아봅시다.<br/>
<br/>

# 📚&nbsp;Strategy Pattern (전략 패턴)

우리가 처음 알아볼 패턴은 **Strategy Pattern(전략 패턴)** 입니다.
<br/>

- [Code Example](https://github.com/jbb9229/DesignPatterns/tree/master/src/strategy)

- [Blog](https://jbb9229.github.io/blog/202004/strategy-pattern)

## 🤔&nbsp;Strategy Pattern(전략 패턴)이란 무엇일까요?
>✍🏼&nbsp; 전략 패턴은 알고리즘을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만듭니다. <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;전략 패턴을 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있습니다.<br/><br/>
🔍&nbsp;어떤 객체의 행위를 각각 캡슐화하여 클라이언트가 각자의 전략에 따라 쉽게 행위를 바꿀 수 있도록 해줍니다.<br/>
<br/>

# 📚&nbsp;Observer Pattern (옵저버 패턴)

지난 시간 우리는 전략 패턴에 대해 알아보았습니다.<br/>
이번 시간엔 옵저버 패턴에 대해 알아볼 시간입니다.

- [Code Example](https://github.com/jbb9229/DesignPatterns/tree/master/src/observer)

- [Blog](https://jbb9229.github.io/blog/202005/observer-pattern-01)

## 🤔&nbsp;Observer Pattern(옵저버 패턴)이란 무엇일까요?

> 📑&nbsp;[위키백과](https://ko.wikipedia.org/wiki/%EC%98%B5%EC%84%9C%EB%B2%84_%ED%8C%A8%ED%84%B4)<br/><br/>
✍🏼&nbsp;옵저버 패턴은 객체의 상태 변화를 관찰하는 관찰자들,<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;즉 옵저버들의 목록을 객체에 등록하여 상태 변화가 있을 때마다 메서드 등을 통해<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;객체가 직접 목록의 각 옵저버들에게 통지하도록 하는 디자인 패턴입니다.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;주로 분산 이벤트 핸들링 시스템을 구현하는데 사용됩니다.<br/><br/>
🔍&nbsp;뭔가 중요한 일이 일어났을 때, 객체들한테 소식을 알려 줄 수 있는 패턴입니다.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;객체 쪽에서는 계속해서 정보를 받을지 여부를 실행중에 결졍할 수 있습니다.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;옵저버 패턴은 JDK에서 가장 많이 쓰이는 패턴 가운데 하나이기도 합니다.<br/>
