package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor    // 컴포넌트 스캔의 대상
public class OrderServiceV0 {
    private final OrderRepositoryV0 orderRepository;

/*
    @RequiredArgsConstructor 는 자동으로 final, NonNull 필드의 자동생성자를 생성함
    이 생성자가 없으면 아래 코드를 추가해줘야됨

    @Autowired
    public OrderService(OrderRepositoryV0 orderRepository){
        this.orderRepository = orderRepository;
    }
*/

    public void orderItem(String itemId){
        orderRepository.save(itemId);
    }
}
