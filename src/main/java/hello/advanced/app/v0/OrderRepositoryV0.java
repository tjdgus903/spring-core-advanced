package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static java.lang.Thread.sleep;

// 컴포넌트 스캔의 대상이 되는데 컴포넌트 스캔이랑 스프링 컨테이너가 자동으로 Bean을 찾아서 등록하는 기능
@Repository
@RequiredArgsConstructor    // 컴포넌트 스캔의 대상, 필요한 생성자를 자동으로 만들어주는 기능
public class OrderRepositoryV0 {

    public void save(String itemId){
        // 저장 로직
        if(itemId.equals("ex")){
            throw new IllegalStateException("예외 발생!");
        }
        sleep(1000);
    }

    private void sleep(int millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
