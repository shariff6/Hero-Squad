import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("Marvel");
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    public void getName_squadInstantiatesWithName_Marvel() {
        Squad testSquad = new Squad("Marvel");
        assertEquals("Marvel", testSquad.getName());
    }

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("Marvel");
        Squad secondSquad = new Squad("Dc");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }

    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad testSquad = new Squad("Marvel");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }

    @Test
    public void getId_squadsInstantiateWithAnId_1() {
        Squad.clear();
        Squad testSquad = new Squad("Marvel");
        assertEquals(1, testSquad.getId());
    }

    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad firstSquad = new Squad("Marvel");
        Squad secondSquad = new Squad("Dc");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }

    @Test
    public void getHeros_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad("Marvel");
        assertEquals(0, testSquad.getHeros().size());
    }

    @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad("Marvel");
        Hero testHero = new Hero("Mow the lawn");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeros().contains(testHero));
    }

}
