public class CheckOrder {
    String order;
    String[] correctOrder = {"rzuc pila", "destudo", "bronic orla", "walcz", "bronic dowodce"};
    public CheckOrder(String order){
        this.order = order;
    }
    public boolean correctOrd(){
        boolean corrOrd = false;
        for(int i = 0; i < correctOrder.length; i++){
            if(correctOrder[i].equals(order)){
                corrOrd = true;
                break;
            }
        }
        return corrOrd;
    }
}
