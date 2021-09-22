package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquad_getSquad_char(){
        Squad newSquad= new Squad('4', "Titans", "Protect and serve");
        assertEquals(4, newSquad.getMaxSize());
    }

    @Test
    public void newSquad_getName_String(){
        Squad newSquad= new Squad('4', "Titans", "Protect and serve");
        assertEquals("Titans", newSquad.getName());
    }

    @Test
    public void newSquad_getSquad_String(){
        Squad newSquad= new Squad('4', "Titans", "Protect and serve");
        assertEquals("Protect and Serve", newSquad.getDuty());

    }



