## Step2 (2단계 - 자동차 경주 리팩터링)
* 프로그래밍 요구 사항
* 핵심 비즈니스 로직을 가지는 객체를 domain 패키지, UI 관련한 객체를 view 패키지에 구현한다.
* MVC 패턴 기반으로 리팩터링해 view 패키지의 객체가 domain 패키지 객체에 의존할 수 있지만, domain 패키지의 객체는 view 패키지 객체에 의존하지 않도록 구현한다.
- [x] MVC 패턴 기반으로 리팩터링
- [x] domain 패키지 분리&구현하기
- [x] view 패키지 분리&구현하기
- [x] domain 패키지는 view 패키지 객체에 의존하지 않도록 구성하기
- [x] 상수값화 하기 constant
- [x] 분리후 성능검토 및 더 리팩토링 할수있는 부분 찾기
  next-step/nextstep-docs/tree/master/codereview)