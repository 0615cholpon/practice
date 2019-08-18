package absTask;

import absTask.Aeron;
import absTask.Chair;

public class FurnitureStore {
    public static void main(String[] args) {
        Chair aeron = new Aeron(); // we can use Chair too, there is nothing to do with
                               // abstract when we talk about Poly!
        aeron.model = "XF 02";
        aeron.color = "Baby blue";
        aeron.sit(); // gets an implementation form the object side!

        Rollable r = (Rollable)aeron;
        Aeron a = (Aeron)aeron;
        r.rollBack();
        System.out.println(a.color);


        HumanScale h = new HumanScale();
        //Chair, Rollable, Collapsable, HumanScale & Object

        Collapsible c = h;
        Rollable rr = (Rollable)c;

    }
}
