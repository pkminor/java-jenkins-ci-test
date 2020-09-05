import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void runPingPong_countUpToOne_ArrayList(){

        PingPong testPP = new PingPong();

        List<String> expList = new ArrayList<String>();
        List<Integer> inList = new ArrayList<Integer>();

        inList.add(1);
        expList.add("1");

        assertEquals(expList, PingPong.runPingPong(inList));
    }

    @Test
    public void name() {
    }
}