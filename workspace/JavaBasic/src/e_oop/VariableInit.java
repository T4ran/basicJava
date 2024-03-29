package e_oop;

public class VariableInit {
	
	//명시적 초기화
	int var = 10;
	
	//초기화 블럭
	{
		var = 10;
		//복잡한 로직을 사용한 초기화가 필요할 때 사용한다.
	}
	
	//생성자			//클래스 이름과 동일한 메서드를 만든다.
	VariableInit(int var)	//생성자는 리턴타입이 없음. new가 리턴.
	{
		/*var = 10;*/
		//파라미터를 받아 초기화 할 때 사용한다.
		//인스턴스를 생성하면서 하고싶은 작업이 있을 때 사용한다.
		this.var = var;
		//this : 클래스의 인스턴스 자신을 가리키는 변수
		//인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해
		//인스턴스 변수 앞에 붙여서 사용한다.
	}
	
	//오버로딩 : 같은 이름의 메서드를 정의하는 것
	//파라미터의 갯수나 타입이 달라야 한다.
	VariableInit()
	{
		//var = 100;
		//VariableInit(100);	//에러
		this(100);
		//this() : 생성자에서 다른 생성자를 호출할 떄 사용한다.
		//this()는 생성자의 첫줄에서만 사용할 수 있다.
		
		//생성자를 선언해주지 않으면 컴파일러가 자동으로
		//기본 생성자를 만들어준다. <= 기본생성자의 이름은 "클래스명()"이다. 예를들어 이 클래스의 기본 생성자는 VariableInit()이다.
		
		//객체 생성의 경우로 설명하면 (클래스명 변수이름 = new 생성자;) 이고, 이전에 객체 생성할 때 생성자와 클래스명이 같은 것은
		//생성자를 선언해주지 않았기 때문이다.
	}
}
