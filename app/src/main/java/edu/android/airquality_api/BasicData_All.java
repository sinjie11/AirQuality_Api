package edu.android.airquality_api;

public class BasicData_All {

    private int resultCode;         // 결과 코드
    private String resultMsg;       // 결과 메시지
    private int numOfRows;          // 한 페이지 결과수
    private int pageNo;             // 페이지 번호
    private int totalCount;         // 전체 결과 수
    private String stationName;     // 측정소 명
    private String mangName;        // 측정망
    private String sidoName;        // 주소(시,도)
    private String sggName;         // 주소(시,군,구 명)
    private String umdName;         // 주소(읍,면,동 명)
    private String dataTime;        // 측정일
    private double tmX;             // TM_X 좌표
    private double tmY;             // TM_Y 좌표
    private double so2Value;        // 아황산 가스 농도 (단위 ppm)
    private double coValue;         // 일산화 탄소 농도 (단위 ppm)
    private double o3Value;         // 오존 농도 (단위 ppm)
    private double no2Value;        // 이산화 질소 농도 (단위 ppm)
    private double pm10Value;       // 미세먼지 농도 (단위 ㎍/㎥)
    private double pm10Value24;     // 미세먼지 24시간 예측 농도 (단위 : ㎍/㎥)
    private double pm25Value;       // 미세먼지 농도 (PM2.5) (단위 : ㎍/㎥)
    private double pm25Value24;     // 미세먼지 PM25 24 시간 예측 이동 농도 (단위 : ㎍/㎥)
    private float khaiValue;       // 통합대기환경 수치
    private float khaiGrade;       // 통합대기환경 지수
    private double so2Grade;        // 아황산 가스 지수
    private double coGrade;         // 일산화 탄소 지수
    private double o3Grade;         // 오존 지수
    private double no2Grade;        // 이산화 질소 지수
    private double pm10Grade;       // 미세먼지 PM10 24시간 등급
    private double pm25Grade;       // 미세먼지 PM2.5 24시간 등급
    private double pm10Grade1h;     // 미세먼지 PM10 1시간 등급
    private double pm25Grade1h;     // 미세먼지 PM2.5 1시간 등급


    /**
     * @ getter / setter
     */
    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getMangName() {
        return mangName;
    }

    public void setMangName(String mangName) {
        this.mangName = mangName;
    }

    public String getSidoName() {
        return sidoName;
    }

    public void setSidoName(String sidoName) {
        this.sidoName = sidoName;
    }

    public String getSggName() {
        return sggName;
    }

    public void setSggName(String sggName) {
        this.sggName = sggName;
    }

    public String getUmdName() {
        return umdName;
    }

    public void setUmdName(String umdName) {
        this.umdName = umdName;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public double getTmX() {
        return tmX;
    }

    public void setTmX(double tmX) {
        this.tmX = tmX;
    }

    public double getTmY() {
        return tmY;
    }

    public void setTmY(double tmY) {
        this.tmY = tmY;
    }

    public double getSo2Value() {
        return so2Value;
    }

    public void setSo2Value(double so2Value) {
        this.so2Value = so2Value;
    }

    public double getCoValue() {
        return coValue;
    }

    public void setCoValue(double coValue) {
        this.coValue = coValue;
    }

    public double getO3Value() {
        return o3Value;
    }

    public void setO3Value(double o3Value) {
        this.o3Value = o3Value;
    }

    public double getNo2Value() {
        return no2Value;
    }

    public void setNo2Value(double no2Value) {
        this.no2Value = no2Value;
    }

    public double getPm10Value() {
        return pm10Value;
    }

    public void setPm10Value(double pm10Value) {
        this.pm10Value = pm10Value;
    }

    public double getPm10Value24() {
        return pm10Value24;
    }

    public void setPm10Value24(double pm10Value24) {
        this.pm10Value24 = pm10Value24;
    }

    public double getPm25Value() {
        return pm25Value;
    }

    public void setPm25Value(double pm25Value) {
        this.pm25Value = pm25Value;
    }

    public double getPm25Value24() {
        return pm25Value24;
    }

    public void setPm25Value24(double pm25Value24) {
        this.pm25Value24 = pm25Value24;
    }

    public float getKhaiValue() {
        return khaiValue;
    }

    public void setKhaiValue(float khaiValue) {
        this.khaiValue = khaiValue;
    }

    public float getKhaiGrade() {
        return khaiGrade;
    }

    public void setKhaiGrade(float khaiGrade) {
        this.khaiGrade = khaiGrade;
    }

    public double getSo2Grade() {
        return so2Grade;
    }

    public void setSo2Grade(double so2Grade) {
        this.so2Grade = so2Grade;
    }

    public double getCoGrade() {
        return coGrade;
    }

    public void setCoGrade(double coGrade) {
        this.coGrade = coGrade;
    }

    public double getO3Grade() {
        return o3Grade;
    }

    public void setO3Grade(double o3Grade) {
        this.o3Grade = o3Grade;
    }

    public double getNo2Grade() {
        return no2Grade;
    }

    public void setNo2Grade(double no2Grade) {
        this.no2Grade = no2Grade;
    }

    public double getPm10Grade() {
        return pm10Grade;
    }

    public void setPm10Grade(double pm10Grade) {
        this.pm10Grade = pm10Grade;
    }

    public double getPm25Grade() {
        return pm25Grade;
    }

    public void setPm25Grade(double pm25Grade) {
        this.pm25Grade = pm25Grade;
    }

    public double getPm10Grade1h() {
        return pm10Grade1h;
    }

    public void setPm10Grade1h(double pm10Grade1h) {
        this.pm10Grade1h = pm10Grade1h;
    }

    public double getPm25Grade1h() {
        return pm25Grade1h;
    }

    public void setPm25Grade1h(double pm25Grade1h) {
        this.pm25Grade1h = pm25Grade1h;
    }

    @Override
    public String toString() {
        return "BasicData_All{" +
                "resultCode=" + resultCode +
                ", resultMsg='" + resultMsg + '\'' +
                ", numOfRows=" + numOfRows +
                ", pageNo=" + pageNo +
                ", totalCount=" + totalCount +
                ", stationName='" + stationName + '\'' +
                ", mangName='" + mangName + '\'' +
                ", sidoName='" + sidoName + '\'' +
                ", sggName='" + sggName + '\'' +
                ", umdName='" + umdName + '\'' +
                ", dataTime='" + dataTime + '\'' +
                ", tmX=" + tmX +
                ", tmY=" + tmY +
                ", so2Value=" + so2Value +
                ", coValue=" + coValue +
                ", o3Value=" + o3Value +
                ", no2Value=" + no2Value +
                ", pm10Value=" + pm10Value +
                ", pm10Value24=" + pm10Value24 +
                ", pm25Value=" + pm25Value +
                ", pm25Value24=" + pm25Value24 +
                ", khaiValue=" + khaiValue +
                ", khaiGrade=" + khaiGrade +
                ", so2Grade=" + so2Grade +
                ", coGrade=" + coGrade +
                ", o3Grade=" + o3Grade +
                ", no2Grade=" + no2Grade +
                ", pm10Grade=" + pm10Grade +
                ", pm25Grade=" + pm25Grade +
                ", pm10Grade1h=" + pm10Grade1h +
                ", pm25Grade1h=" + pm25Grade1h +
                '}';
    }
} // end class BasicData_All