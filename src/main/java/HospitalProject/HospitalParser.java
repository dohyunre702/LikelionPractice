package HospitalProject;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"","");

        String[] splitted = str.split(",");
        String name = splitted[10];
        String subdivision = parseSubDivision(name);
        int emergency = Integer.parseInt(splitted[6]);

        return new Hospital(splitted[0], splitted[1], splitted[2], emergency, splitted[10], subdivision);
    }

    private String parseSubDivision(String name) {
        String[] subdivisions = {"내과", "외과", "소아과", "피부과", "성형외과", "정형외과", "산부인과", "관절", "안과", "가정의학과", "비뇨기과", "치과"};
        for(String subdivision: subdivisions) {
            if(name.contains(subdivision)) {
                return subdivision;
            }
        }
        return "";
    }

    @Override
    public String formatString(Hospital content) {
        return String.valueOf(content);
    }

}
