import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        setNames.add(new Student("Владислав", 21, "vladanalshokolad@gmail.com", 88005553555l));
        setNames.add(new Student("Михаил", 20, "shershen2281337@gmail.com", 88121488777l));
        setNames.add(new Student("Андрей питух", 19, "warfaceprokopovterrariacsgostandoffundertalepornoyapidoras1488@gmail.com", 89525252812l));
        setNames.add(new Student("Георгий", 18, "gayorgy@gmail.com", 89117771488l));
        setNames.add(new Student("Руслан", 17, "ruslanebetbanan@gmail.com", +77777777777l));
        for (Student currentName : setNames){
            System.out.println(currentName);
        }
    }
}