package maxDataProject;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    //fromsido, tosido를 받아서 멤버변수에 넣음
    //mapping을 위해 this 추가
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido; //전출 지역
        this.toSido = toSido; //전입 지역
        this.setSidoMap();
        this.fromSidoKorean = this.sidoMap.get(fromSido);
        this.toSidoKorean = this.sidoMap.get(toSido);
    }

    //
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    //getter
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    //getter and setter
    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }


    //sidoMap 관련 변수, 메서드 초기화
    private String fromSidoKorean;
    private String toSidoKorean;
    private Map<Integer, String> sidoMap = new HashMap();

    private void setSidoMap() {
        sidoMap.put(11, "서울특별시");
        sidoMap.put(26, "부산광역시");
        sidoMap.put(27, "대구광역시");
        sidoMap.put(28, "인천광역시");
        sidoMap.put(29, "광주광역시");
        sidoMap.put(30, "대전광역시");
        sidoMap.put(31, "울산광역시");
        sidoMap.put(36, "세종특별자치시");
        sidoMap.put(41, "경기도");
        sidoMap.put(42, "강원도");
        sidoMap.put(43, "충청북도");
        sidoMap.put(44, "충청남도");
        sidoMap.put(45, "전라북도");
        sidoMap.put(46, "전라남도");
        sidoMap.put(47, "경상북도");
        sidoMap.put(48, "경상남도");
        sidoMap.put(50, "제주특별자치도");
    }

    //getter: 외부 엑세스 가능하게
    public String getFromSidoKorean() {
        return fromSidoKorean;
    }

    public String getToSidoKorean() {
        return toSidoKorean;
    }
}
