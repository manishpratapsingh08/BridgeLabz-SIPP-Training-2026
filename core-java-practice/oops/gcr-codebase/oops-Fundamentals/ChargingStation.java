class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 9.5;

    int stationId;
    double unitConsumed;
    private String units;

    ChargingStation(int stationId , double unitsConsumed){
        this.stationId = stationId;
        this.unitConsumed = unitsConsumed;
        totalStations++;
    }
    double CalculateBill(){
        return unitConsumed*electricityRate;
    }

    void displayStationDetails(){
        System.out.println("Station ID:" + StationId);
        System.out.println("units:" + unitsConsumed());
        System.out.println(" BILL :" + CalculateBill());

    }
}


