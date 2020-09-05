import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PingPong {
    public static void main(String[] args) {
        List<Integer> rs = new ArrayList<Integer>();

        rs.add(1);
        System.out.println(runPingPong(rs));
    }

    public static List<String> runPingPong(List<Integer> inList){

        //return ping pong
        return inList.stream().map(
                i->
                    (i % 3 == 0 && i % 5 == 0) ?
                            "Ping##Pong" : (i % 3 == 0) ?
                            "Ping" : (i % 5 == 0) ?
                            "Pong" : String.valueOf(i)

        ).collect(Collectors.toList());
    }
}
