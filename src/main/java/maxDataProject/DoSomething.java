package maxDataProject;

import java.util.List;

public interface DoSomething<T> {
    //List<T>를 리턴하는 인터페이스
    List<T> work(String str);
}
