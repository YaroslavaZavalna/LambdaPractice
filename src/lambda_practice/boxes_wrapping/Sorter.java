package lambda_practice.boxes_wrapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Sorter {

    public void packFragileThings(){
        List<Box>boxes = buildListOfBoxes();
        System.out.println(boxes);

        List<Protector>fragileBoxes = boxes.stream()
                .flatMap(box -> box.getThings().stream())
                .filter(Thing::getFragileInfo)
                .map(thing -> new Protector(thing))
                .collect(Collectors.toList());

        System.out.println(fragileBoxes);
    }

    private static List<Box> buildListOfBoxes(){
        List<Box>listofBoxes = new ArrayList<>();
        listofBoxes.add(new Box(buildListOfThings1()));
        listofBoxes.add(new Box(buildListOfThings2()));
        return listofBoxes;
    }
    private static List<Thing>buildListOfThings1(){
        Random random = new Random();
        List<Thing>listOfThings = new ArrayList<>();
        listOfThings.add(new Thing(1,random.nextBoolean()));
        listOfThings.add(new Thing(2,random.nextBoolean()));
        listOfThings.add(new Thing(3,random.nextBoolean()));
        listOfThings.add(new Thing(4,random.nextBoolean()));
        listOfThings.add(new Thing(5,random.nextBoolean()));
        return listOfThings;
    }
    private static List<Thing>buildListOfThings2(){
        Random random = new Random();
        List<Thing>listOfThings = new ArrayList<>();
        listOfThings.add(new Thing(6,random.nextBoolean()));
        listOfThings.add(new Thing(7,random.nextBoolean()));
        listOfThings.add(new Thing(8,random.nextBoolean()));
        listOfThings.add(new Thing(9,random.nextBoolean()));
        listOfThings.add(new Thing(10,random.nextBoolean()));
        return listOfThings;
    }

}
