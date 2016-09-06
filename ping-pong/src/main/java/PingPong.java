import java.util.ArrayList;
import java.util.List;

public class PingPong {

  public List<Object> runPingPong(int countUpTo){
    List<Object> outPut = new ArrayList<Object>();
    for (int i = 1; i <= countUpTo; i++){
      if (i % 3 == 0 && i % 5 == 0){
        outPut.add("pingpong");
      } else if (i % 3 == 0){
        outPut.add("ping");
      } else if (i % 5 == 0){
        outPut.add("pong");
      } else {
        outPut.add(i);
      }
    }
    return outPut;
  }

}
