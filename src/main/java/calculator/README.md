## 문자열 덧셈 계산기
### 기능 요구사항
- [x] null 또는 빈 문자열 전달 시 0 반환 
- [x] 한자리 숫자 문자열 전달 시 해당 숫자 반환
- [x]  쉼표(,) or 콜론(:)을 구분자로 가지는 문자열 전달 시 구분자를 기준으로 분리한 각 숫자의 합을 반환
- [x] "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용 가능. ex) "//-\n1-2" -> 3 반환
- [x] 숫자 이외의 값 또는 음수 전달 시 RuntimeException throw