package HospitalProject;

public class Hospital {
    //원하는 정보: id, 주소, 행정구, 카테고리, 응급실여부, 병원이름, subdivision
    private String id;
    private String address; //주소
    private String district; //구
    private String category; //카테고리
    private int emergencyRoom; //응급 운영 현황
    private String name; //병원명
    private String subdivision;//세부 분과


    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public Hospital(String id) {
        this.id = id.replaceAll("\"","");
    }

    public Hospital(String id, String address, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", category='" + category + '\'' +
                ", emergency_room=" + emergencyRoom +
                ", name='" + name + '\'' +
                ", subdivision='" + subdivision + '\'' +
                '}';
    }
}

