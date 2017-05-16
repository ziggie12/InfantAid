package muzinda.sharon.testresources.model;
//This class groups together the content of each emergency:


import android.content.Context;

import muzinda.sharon.testresources.R;

public class EmergencyContent {
    private AidPage[] mAidPages;
    Context mContext;

    public EmergencyContent(Context context) {
         mContext = context;
        mAidPages = new AidPage[6];



        mAidPages[0] = new AidPage(mContext.getResources().getString(R.string.diarrhoea_alert),
                        mContext.getResources().getStringArray(R.array.diarrhoea_diagnosis),
                        mContext.getResources().getStringArray(R.array.diarrhoea_responses));
        mAidPages[1] = new AidPage(mContext.getResources().getString(R.string.vomiting_alert),
                        mContext.getResources().getStringArray(R.array.vomiting_diagnosis),
                        mContext.getResources().getStringArray(R.array.vomiting_responses));
        mAidPages[2] = new AidPage(mContext.getResources().getString(R.string.fractures_alert),
                        mContext.getResources().getStringArray(R.array.fractures_diagnosis),
                        mContext.getResources().getStringArray(R.array.fractures_responses));
        mAidPages[3] = new AidPage(mContext.getResources().getString(R.string.cuts_alert),
                        mContext.getResources().getStringArray(R.array.cuts_emergency),
                        mContext.getResources().getStringArray(R.array.cuts_responses));
        mAidPages[4] = new AidPage(mContext.getResources().getString(R.string.burns_alert),
                        mContext.getResources().getStringArray(R.array.burns_diagnosis),
                        mContext.getResources().getStringArray(R.array.burns_responses));
        mAidPages[5] = new AidPage(mContext.getResources().getString(R.string.bites_alert),
                        mContext.getResources().getStringArray(R.array.bites_diagnosis),
                        mContext.getResources().getStringArray(R.array.bites_responses));
    }

    public AidPage getPage(int index) {
        /*if (index >= mAidPages.length){
            //error message here; could set it to return to main menu
        }*/
        return mAidPages[index];
    }
}
