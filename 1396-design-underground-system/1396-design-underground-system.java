class UndergroundSystem {
Map<Integer,ArrivalInfo>arrivals;
    Map<String,double[]> total;
    public UndergroundSystem() {
        arrivals=new HashMap<>();
        total=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        arrivals.put(id,new ArrivalInfo(id,stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        ArrivalInfo arrival = arrivals.get(id);
        String key=arrival.stationName+"_"+stationName;
        double[] pair=total.getOrDefault(key,new double[2]);
        int time=t-arrival.time;
        pair[0]+=time;
        pair[1]++;
        total.put(key,pair);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key=startStation+"_"+endStation;
        double[]pair=total.get(key);
        return pair[0]/pair[1];
        
        
    }
    class ArrivalInfo
    {
        int id;
        String stationName;
        int time;
        
    
    ArrivalInfo(int id,String stationName,int time)
    {
        this.id=id;
        this.stationName=stationName;
        this.time=time;
    }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */