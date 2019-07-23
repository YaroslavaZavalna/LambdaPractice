package lambda_practice.boxes_wrapping;

import java.util.List;

public class Box {
    private List<Thing> things;
    public Box(List<Thing>list){
        this.things = list;
    }

    public List<Thing> getThings() {
        return things;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }

    @Override
    public String toString() {
        return "Box " +
                "list: \n" + things +
                " \n";
    }
}
