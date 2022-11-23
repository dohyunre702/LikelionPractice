package HospitalProject;

public interface Parser<T> {//어떤 타입을 넣을 지 아직 정하지 못함
    T parse(String str); //String을 넣어주면 T 타입 반환 요구
}
