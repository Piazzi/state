import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    Order order;

    @BeforeEach
    public void setUp() {
        order = new Order();
    }

    // Canceled Order

    @Test
    public void shouldntConfirmCanceledOrder() {
        order.setState(OrderCanceledState.getInstance());
        assertEquals("Order not confirmed", order.confirm());
    }

    @Test
    public void shouldntCancelCanceledOrder() {
        order.setState(OrderCanceledState.getInstance());
        assertEquals("Order not canceled", order.cancel());
    }

    @Test
    public void shouldntDeliverCanceledOrder() {
        order.setState(OrderCanceledState.getInstance());
        assertEquals("Order cant be delivered", order.delivered());
    }

    @Test
    public void shouldntPayCanceledOrder() {
        order.setState(OrderCanceledState.getInstance());
        assertEquals("Order cant be payed", order.payed());
    }

    @Test
    public void shouldntSentCanceledOrder() {
        order.setState(OrderCanceledState.getInstance());
        assertEquals("Order cant be sent", order.sent());
    }

    // Order Confirmed

    @Test
    public void shouldntConfirmConfirmedOrder() {
        order.setState(OrderConfirmedState.getInstance());
        assertEquals("Order already confirmed", order.confirm());
    }

    @Test
    public void shouldCancelConfirmedOrder() {
        order.setState(OrderConfirmedState.getInstance());
        assertEquals("Order Canceled", order.cancel());
    }

    @Test
    public void shouldntDeliverConfirmedOrder() {
        order.setState(OrderConfirmedState.getInstance());
        assertEquals("Order need to be sent first", order.delivered());
    }

    @Test
    public void shouldntPayConfirmedOrder() {
        order.setState(OrderConfirmedState.getInstance());
        assertEquals("Order Was Already Payed", order.payed());
    }

    @Test
    public void shouldSentConfirmedOrder() {
        order.setState(OrderConfirmedState.getInstance());
        assertEquals("Order Sent", order.sent());
    }
}