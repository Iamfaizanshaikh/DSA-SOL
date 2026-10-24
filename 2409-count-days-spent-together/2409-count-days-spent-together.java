class Solution {
    private int convert(String date, int[] days){

        String[] parts= date.split("-");
        int month=Integer.parseInt(parts[0]);
        int day=Integer.parseInt(parts[1]);

        for(int i=0; i<month-1; i++){
            day+=days[i];
        }
        return day;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int aStart= convert(arriveAlice, days);
        int aEnd= convert(leaveAlice, days);

        int bStart= convert(arriveBob, days);
        int bEnd= convert(leaveBob, days);

        int start=Math.max(aStart, bStart);
        int end= Math.min(aEnd, bEnd);


        return Math.max(0,end-start+1);

        
    }
}