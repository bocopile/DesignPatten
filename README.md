# DesignPatten

## 참고 : 자바 디자인 패턴 이해 (이야기's G 님의 강의 참고 함)

    -  url : https://www.youtube.com/watch?v=VL9OAohbjzI&t=7s

### 1. 전략 패턴(Strategy Patten)

    1. interface
      -  기능에 대한 선언 및 구현 분리
      -  기능을 사용하는 통로

    2. delecate
     -  알고리즘을 여러 단계로 나눈다.
     
    3. 정의
     -  여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환이 가능하도록 하는 패턴
     -  행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀수 있게 해주는 패턴


### 2. 어뎁터 패턴(Adapter Patten)

      - 이미 주어진 알고리즘을 주어진 상황에 맞게 사용 가능(호환성)
      - 한 클래스의 인터페이스를 클라이언트에서 사용하고자하는 다른 인터페이스로 변환한다.

### 3. 템플릿 메소드 패턴(Template Method Patten)

    1. 알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴
      - 구현하려는 알고리즘이 일정한 프로세스가 있다 (일정한 단계로 구성)
      - 구현하려는 알고리즘이 변경 가능성이 있다.

    2. 진행 과정
     -  알고리즘을 여러 단계로 나눈다.
     -  나눠진 알고리즘의 단계를 메소드로 선언한다.
     -  알고리즘을 수행할 템플릿 메소드를 만든다.
     -  하위 클래스에서 나눠진 메소드들을 구현한다.
     
### 4. 팩토리 메소드 패턴 (Factory Method Patton)

    1. 정의
     - 객체를 생성하기 위해 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할지에 대한 결정은 서브클래스가 내리도록 합니다.
     - 객체 생성을 캡슐화 하는 패턴입니다.
     - Creator의 서브 클래스에 팩토리 메소드를 정의하여, 팩토리 메소드 호출로 적절한 ConcreteProduct 인스턴스를 반환하게 된다.
     
### 5. 싱글톤 메소드 패턴 (Singleton Method Patten)

    1. 앞서서
     - 객체 : 속성과 기능을 갖춘 것
     - 클래스 : 속성과 기능을 정의한 것
     - 인스턴스 : 속성과 기능을 가진것 중 실제하는 것
     
     2. 정의
     - 하나의 인스턴스만 구현해서 메모리 낭비를 방지
     
 ### 6. 프로토타입 패턴(Prototype Patten)

    1. 정의
        - 생산비용이 높은 인스턴스를 복사를 통해서 쉽게 생성할수 있도록 하는 패턴
        
    2. 사용 하는 경우
         - 종류가 너무 많아 클래스로 정의 되지 않는 경우
         - 클래스로부터 인스턴스 생성이 어러운경우
         - framework와 생성할 인스턴스를 분리하고 싶을때
         
         
### 7. 빌더 패턴(Builder Patten)
         
    1. 정의
        - 복잡한 객체를 생성하는 방법을 정의하는 클래스와 표현하는 방법을 정의하는 클래스를 별도로 분리하여, 
          서로 다른 표현이라도 이를 생성할 수 있는 동일한 절차를 제공하는 패턴
        
    2. 사용처
         - 생성자가 많거나  매개변수가 많은 경우
         
### 8. 추상 팩토리 패턴(Abstract Factory Patten)
          
     1. 정의
         - 구체적인 클래스에 의존하지 않고 서로 연관되거나 
         의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴
             
### 9. 브릿지 패턴(Bridge Patten)
           
      1. 정의
          - 구현으로부터 추상레이어를 분리시키고 이 둘이 서로 독립적으로 변화하는것
          - 두개의 다른 계층(하나는 추상, 하나는 구현인 서로다른 계층의 커플링을 약화시키며 협력은 가능하도록 하는 패턴
          
### 10. 컴포짓 패턴 (Composite Patten)
             
        1. 정의
            - 여러 개의 객체들로 구성된 복합객체와 단일객체를 클라이언트에서 구별없이 다루게 해주는 패턴
                -> 즉 전체-부분의 관계를 갖는 객체들 사이의 관계를 정의할때 유용
                -> 클라이언트는 전체와 부분을 구분하지 않고 동일한 인터페이스를 사용할수 있다. 
  
### 11. 데코레이터 패턴 (Decorator Patten)
              
         1. 정의
             - 객체의 결합을 통해 기능을 동적으로 유연하게 확장 할 수 있게 해주는 패턴.
                -> 즉 기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에 각 추가 기능을 Decorator 클래스로 정의한 후에
                   필요한 Decorater  객체를 정의함으롯서 추가 기능의 조합을 설계하는 방식 
                   
         2. 컴포넌트
             - Component : 실질적인 인스턴스를 컨트롤 하는 역할 (interface)
             - ConcreteComponent : Component의 실질적인 인스턴스의 부분이며, 책임의 주체의 역할
             - Decorator : Component 와 concrete Decorator 를 동일시 하도록 해주는 역할
             - Concrete Decorator : 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체 부분이다.
             
         3. 예제 - 커피 제조 방법   
         
### 12. 방문자 패턴 (Visitor Patten)
        
        1. 정의
            - 객체의 구조와 기능을 분리하는 패턴
            - 구조는 변하지 않으며 기능만을 따로 추가하거나 확장되어야 할 경우에 사용 되는 패턴
            - 컴포지트 패턴과 연동 되어 사용되는 경우가 많다.
             
### 13. 책임사슬 패턴 (Chain of Responsesibility Patten)    
  
        1. 정의
              - 결합을 느슨하게 하기 위해 고안된 패턴
              - 한 개의 요청에 대하여 여러 객체에게 처리할 수 있는 기회를 주도록 하는 디자인 패턴
              
 ### 14. 퍼사드 패턴 (Facade Patten)
   
         1. 정의
               - 어떤 소프트웨어의 다른 커다란 코드 부분에 대하여 간략화된 인터페이스를 제공해주는 디자인 패턴
               - 복잡한 소프트웨어 바깥쪽의 코드가 라이브러리의 안쪽 코드에 의존하는 일을 감소시켜 주고, 
                 복잡한 소프트웨를 사용할수 있게 간단하게 인터페이스를 제공해준다.

### 15. 옵저버 패턴 (Observer Patten)
   
         1. 정의
               - 객체 사이에 일 대 다의 의존 관계를 정의해 두어, 어떤 객체의 상태가 변할 떄 그 객체의 의존성을 가진 다른
                 객체들이 그 변화를 통지받고 자동으로 갱신될 수 있게 만듭니다.
                 
### 16. 중재자 패턴 (Mediator Patten)
    
          1. 정의
                - 모든 클래스 간의 복잡한 로직(상호작용)을 캡슐화 하여 하나의 클래스에 위임을 하는 패턴
                - M:N의 관계에서 M:1으로 복잡도를 떨어트려 유지보수 및 재사용의 확장성에 유리한 패턴이다.
                
### 17. 상태 패턴 (State Patten)
    
          1. 정의
                - 객체가 특정 상태에 따라서 행위를 달리하는 상황에서, 자신이 직접 상태를 체크하며 상태에 따라 행위를 호출
                  하지 않고 상태를 객체화 하여 상태가 행동을 할 수 있도록 위임하는 패턴
                - 객체의 특정 상태를 클래스로 선언하고, 클래스에서는 해당 상태에서 할 수 있는 행위들을 메소드로 정의함
                  그리고 이러한 각 생태 클래스들을 인터페이스로 캡슐화 하여, 클라이언트에서 인터페이스를 호출하는 방식
                  
                  
### 18. 메멘토 패턴(Memento Patten)
    
          1. 정의
                - 객체의 상태 정보를 저장하고 사용자의 필요에 의하여 원하는 시점의 데이터를 복원 할 수 있는 패턴
                
### 19. 플라이웨이트 패턴(Flyweight Patten)
    
          1. 정의
                - 데이터를 공유 사용하여 메모리를 절약할 수 있는 패턴
                - 일반적으로 공통으로 사용되는 객체는 서로 생성해서 사용하지 않고 공유를 통해 효율적으로 자원을 활용한다.
                - 한번 생성된 객체는 두번 생성되지 않고 풀(Pool)에 의해서 관리 및 사용된다.
                
### 20. 프록시 패턴(Proxy Patten)
      
            1. 정의
                  - 어떤 객체에 대한 접근을 제어하는 용도로 대리인이나 대변인에 해당하는 객체를 제공해주는 패턴.
                  - RealSubject 가 원격 시스템에서 돌아가거나, 그 객체의 생성 비용이 많이 들어 실제 사용 시점에서 객체를 생성 하거나,
                    실제 객체에 접근을 제한 및 제어를 해야 하는 경우에 사용됨        
                                                        
### 21. 커맨드 패턴(Command Patten)
      
            1. 정의
                  - 실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴
                  - 이벤트가 발생했을 때 실행될 기능이 다양하면서도 변경이 필요한 경우에 이벤트를 발생 시키는 클래스를 변경하지 않고
                    재사용 하고자 할때 유용하다.
                    
### 21. 이터레이터 패턴(Iterator Patten)
      
            1. 정의
                  - 컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체 안에 들어있는 모든 항목에 접근할 수 있는 방법을 제공한다.

### 22. 인터프리터 패턴(Interpreter Patten)
      
            1. 정의
                  - 법 규칙을 클래스화 한 구조로, 일련의 규칙으로 정의된 문법적 언어를 해석하는 패턴입니다.
                    인터프리터 패턴은 SQL과 같은 계층적 언어를 해석하기 위해 계층 구조를 표현할 수 있습니다.