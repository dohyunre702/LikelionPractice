package maxDataProject;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    //fromsido, tosido를 받아서 멤버변수에 넣음
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido; //전출 지역
        this.toSido = toSido; //전입 지역
    }

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
}
