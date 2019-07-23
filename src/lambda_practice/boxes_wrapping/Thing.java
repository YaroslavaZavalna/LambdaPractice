package lambda_practice.boxes_wrapping;

public class Thing {
    private int thingId;
    private boolean isFragile;

    public Thing(int thingId, boolean isFragile) {
        this.thingId = thingId;
        this.isFragile = isFragile;
    }

    public boolean getFragileInfo(){
        return isFragile;
    }

    @Override
    public String toString() {
        return "Thing " +
                "thingId=" + thingId +
                ", isFragile=" + isFragile +
                " \n";
    }
}
