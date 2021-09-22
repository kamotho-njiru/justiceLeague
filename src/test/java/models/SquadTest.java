package models;

import org.junit.Test;

public class SquadTest {
    @Test
    public void newSquad_getSquad_char(){
        Squad newSquad= Squad.insertNewSquad();
        assertEquals(4, newSquad.getMaxSize());
    }

    @Test
    public void newSquad_getName_String(){
        Squad newSquad= Squad.insertNewSquad();
        assertEquals("Titans", newSquad.getName());
    }

    @Test
    public void newSquad_getSquad_String(){
        Squad newSquad= Squad.insertNewSquad();
        assertEquals("Protect and Serve", newSquad.getDuty());

    }


}
