## 0. 객체지향 프로그래밍

----

1. Generic

2. Collection Framework

3. 예외처리

4. 입출력

5. (부록) JSON

## 1. Generics

----

1. Generics
   
   * 다양한 타입의 객체를 다루는 메서드, 컬렉션 클래스에서 컴파일 시에 타입 체크
     
     * 미리 사용할 타입을 명시해서 형 변환을 하지 않아도 되게 함
     
     * 객체의 타입에 대한 안전성 향상 및 형 변환의 번거로움 감소
   
   * 표현
     
     * 클래스 또는 인터페이스 선언 시 <>에 타입 파라미터 표시
       
       * ClassName: Raw Type
       
       * ClassName<T>: Generic Type
     
     * 타입 파라미터: 특별한 의미의 알파벳 보다는 단순히 임의의 참조형 타입을 말함
       
       * T : reference Type
       
       * E : Element
       
       * K : Key
       
       * V : Value
   
   * 객체 생성
     
     * 변수 쪽과 생성 쪽의 타입은 반드시 같아야 함
   
   * 사용
     
     * 컴파일 시 타입 파라미터들이 대입된 타입으로 대체됨
   
   * Type parameter의 제한
     
     * 필요에 따라 구체적인 타입 제한 필요
     
     * 계산기 프로그램 구현 시 => Number이하의 타입(Byte, Short, Inter...)로 제한
     
     * type parameter 선언 뒤 extends와 함께 상위 타입 명시
     
     * 인터페이스로 제한할 경우도 extends로 사용
     
     * 클래스와 함께 인터페이스 제약 조건을 이용할 경우 &로 연결
   
   * Generic Type 객체를 할당 받을 때 와일드 카드 이용
     
     * generic type에서 구체적인 타입 대신 사용
   
   * Generic Method
     
     * 파라미터와 리턴타입으로 type parameter를 갖는 메서드
     
     * 메서드 리턴 타입 앞에 타입 파라미터 변수 선언

## 2. Collection Framework

---

1. Collection Framework
   
   * 객체들을 한곳에 모아 놓고 편리하게 사용할 수 있는 환경 제공
   * 정적 자료구조 (Static structure)
     * 고정된 크기의 자료구조
     * 배열이 대표적인 정적 자료구조
     * 선언 시 크기를 명시하면 바꿀 수 없음
   * 동적 자료구조 (Dynamic structure)
     * 요소 개수에 따라 자료구조 크기 동적으로 증가 or 감소
     * 리스트, 스택, 큐 등
   * 자료구조들의 종류 -> 어떤 구조에서 얼마나 빨리 원하는 데이터를 찾는가에 따라 결정됨
     * 순서 유지?
     * 중복 허용?
     * 다른 자료구조들에 비해서 어떤 장단점?
