package edu.android.airquality_api;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    /**
     * ※ 대기오염정보 조회 Open Api 주소 (개발, 운영 서버 같음)
     * - OpenApi 서비스명: ArpltnInforInqireSvc
     * - 실시간 정보 : 10분 (매 시간 시간자료 갱신은 20분 전후로 반영됨)
     * - 대기질 예보 정보 : 매 시간 22분, 57분
     */

    /**
     * ※ 서울특별시 지역구 리스트 (25개)
     **/
    public static final String[] seoul = {
            "종로구", "중구", "용산구", "성동구", "광진구",
            "동대문구", "중랑구", "성북구", "강북구", "도봉구",
            "노원구", "은평구", "서대문구", "마포구", "양천구",
            "강서구", "구로구", "금천구", "영등포구", "동작구",
            "관악구", "서초구", "강남구", "송파구", "강동구"};


    /**
     * Grade 값 의미
     * <p>
     * 1 - 좋음
     * 2 - 보통
     * 3 - 나쁨
     * 4 - 매우나쁨
     */

    private TextView textDataTime, textMang, textName, textKhaiValue, textKhaiGrade, textPm10Value, textPm25Value;
    private EditText editText;

    ArrayList<BasicData_All> basicData_alls;

    private String tag;

    private String inputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDataTime = findViewById(R.id.textDataTime);
        textMang = findViewById(R.id.textMang);
        textName = findViewById(R.id.textName);
        textKhaiValue = findViewById(R.id.textKhaiValue);
        textKhaiGrade = findViewById(R.id.textKhaiGrade);
        textPm10Value = findViewById(R.id.textPm10Value);
        textPm25Value = findViewById(R.id.textPm25Value);

        editText = findViewById(R.id.editText);

    } // end onCreate


    public void addSearch(View view) {

        new GetXmlDataAll().execute();

    } // end addSearch

    public ArrayList<BasicData_All> listBasicData_Alls() {

        ArrayList<BasicData_All> lists = new ArrayList<>();

        inputText = editText.getText().toString();

        // 주소 검색 ( 구, 지방의 경우 동으로 되어있음)
        String stationUrl =
                "http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty?stationName="
                        + inputText
                        + "&dataTerm=month&pageNo=1&numOfRows=1&ServiceKey=2WjM1G6ETI%2F3HKoHrAC9MhjgY3PufrijH35VWAgVnh3A5ZrEkBkXovDVizsiQoKm7FDHO2AmW4LG%2FA2oiF8new%3D%3D&ver=1.3";

        try {
            Thread.sleep(500);
            URL url = new URL(stationUrl);
            InputStream is = url.openStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is));
            String tag;
            xpp.next();

            int eventType = xpp.getEventType();
            BasicData_All basicData_all = new BasicData_All();

            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT: // 파싱시작
                        break;

                    case XmlPullParser.START_TAG:
                        tag = xpp.getName(); // 태그이름 얻어오기

                        if (tag.equals("item")) {

                        } else if (tag.equals("dataTime")) { // 측정일시
                            xpp.next();
                            basicData_all.setDataTime(xpp.getText());

                        } else if (tag.equals("mangName")) { // 측정망 정보
                            xpp.next();
                            basicData_all.setMangName(xpp.getText());

                        } else if (tag.equals("pm10Value")) { // 미세먼지 (단위:㎍/㎥)
                            xpp.next();
                            basicData_all.setPm10Value(Double.parseDouble(xpp.getText()));

                        } else if (tag.equals("pm25Value")) { // 초미세먼지 (단위:㎍/㎥)
                            xpp.next();
                            basicData_all.setPm25Value(Double.parseDouble(xpp.getText()));

                        } else if (tag.equals("khaiValue")) { // 통합대기환경 수치
                            xpp.next();
                            basicData_all.setKhaiValue(Float.parseFloat(xpp.getText()));

                        } else if (tag.equals("khaiGrade")) { // 통합대기환경 등급
                            xpp.next();
                            basicData_all.setKhaiGrade(Float.parseFloat(xpp.getText()));

                        }
                        break;
                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                        tag = xpp.getName(); // 태그 이름 얻어오기
                        if (tag.equals("item")) {
                            lists.add(basicData_all);
                            basicData_all = new BasicData_All();
                        }

                        break;
                }

                eventType = xpp.next();
            } // end while

        } catch (Exception e) {
            e.printStackTrace();

        } // end try-catch

        return lists;

    } // end ArrayList<BasicData_All>

    class GetXmlDataAll extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            basicData_alls = listBasicData_Alls();
            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            textDataTime.setText("날짜 및 시간 : ");
            textMang.setText("측정망 정보 : ");
            textName.setText("측정소 명: ");
            textKhaiValue.setText("통합대기환경 지수 : ");
            textKhaiGrade.setText("통합대기환경 등급 : ");
            textPm10Value.setText("미세먼지 : ");
            textPm25Value.setText("초미세먼지 : ");

            for (int i = 0; i < basicData_alls.size(); i++) {

                textDataTime.append(basicData_alls.get(i).getDataTime());
                textMang.append(basicData_alls.get(i).getMangName());
                textName.append(inputText);
                textKhaiValue.append(basicData_alls.get(i).getKhaiValue() + " ");
                textKhaiGrade.append(basicData_alls.get(i).getKhaiGrade() + " ");
                textPm10Value.append(basicData_alls.get(i).getPm10Value() + " " + "㎍/㎥");
                textPm25Value.append(basicData_alls.get(i).getPm25Value() + " " + "㎍/㎥");

            } // end for

        } // end onPostExecute

    } // end GetXmlDataAll

} // end class MainActivity
