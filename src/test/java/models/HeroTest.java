package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void newHero_getName_String() {
        Hero newHero = new Hero("Vincent",14,"predict the future", "unfit");
        assertEquals("Vincent", newHero.getName());

    }

    @Test
    public void newAge_getAge_int(){
        Hero newHero = new Hero("Vincent",14,"predict the future", "unfit");
        assertEquals(14,newHero.getAge());
    }

    @Test
    public void newHero_getPower_String(){
        Hero newHero = new Hero("Vincent",14,"predict the future", "unfit");
        assertEquals("predict the future",newHero.getPower.String());
    }

    @Test
    public void newHero_getWeakness_String(){
        Hero newHero = new Hero("Vincent",14,"predict the future", "unfit");
        assertEquals("unfit",newHero.getWeakness.String());
    }
}
