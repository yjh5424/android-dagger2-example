# android-dagger2-example


## Inject
의존성 주입을 하기위한 어노테이션   

<p>

        @Inject   
        lateinit var presenter: MainContract.Presenter 
</p>
  
Inject 어노테이션으로 주입을 요청하면 연결된 Component가 Module로부터 생성된 외부객체를 사용하게 해준다.  

## Component
연결된 모듈에서 외부 객체를 생성하고 inject을 요청한 인스턴스에 
객체를 주입해준다. 
## Module
Component에 연결되어 의존성 객체를 생성합니다.
## Scope
