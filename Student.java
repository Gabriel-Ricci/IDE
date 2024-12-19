public class Student {
    private int GPA;
    private int SAT;
    private int CommunityService;
    private boolean HonorRoll;

    public Student(int g, int c){
        GPA = g;
        CommunityService = c;
        if ((GPA > 90)&&(CommunityService > 50)) {
            HonorRoll = true;
        }
        HonorRoll = false;
    }
}
