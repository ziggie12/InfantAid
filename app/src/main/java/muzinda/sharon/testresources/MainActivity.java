package muzinda.sharon.testresources;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import muzinda.sharon.testresources.model.AidPage;
import muzinda.sharon.testresources.model.EmergencyContent;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.alertView)TextView mAlert;
    @BindView(R.id.diagnosis_list)ListView mDiagnosisList;
    @BindView(R.id.response_list)ListView mResponseList ;

    private EmergencyContent mContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContent = new EmergencyContent(this);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                loadPage(0); //loading index 0 by default.  May need to set up global variable that determines index based on item clicked
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("LoadPage");
        thread.start();






    }

    private void loadPage(int index) {

        AidPage page = mContent.getPage(index);
        String aidAlert = page.getEmergencyAlert();
        mAlert.setText(aidAlert);
        String [] aidDiagnosis = page.getEmergencyDiagnosis();
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.list_item_layout,aidDiagnosis);
        mDiagnosisList.setAdapter(listAdapter);
        String [] aidResponse = page.getEmergencyResponse();
        ArrayAdapter<String> listAdapter2 = new ArrayAdapter<String>(this, R.layout.list_item_layout,aidResponse);
        mResponseList.setAdapter(listAdapter2);

    }
}





