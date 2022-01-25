public class Order {
    
    private String name;
    private OrderState state;

    public Order() {
        this.state = OrderSentState.getInstance();
    }
    
    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public String confirm() {
        return state.confirm(this);
    }
    
    public String cancel() {
        return state.cancel(this);
    }
    
    public String delivered() {
        return state.delivered(this);
    }
    
    public String payed() {
        return state.payed(this);
    }
    
    public String sent() {
        return state.sent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
