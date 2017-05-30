package muzinda.sharon.testresources.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import muzinda.sharon.testresources.R;
import muzinda.sharon.testresources.model.EmergencyContents;

public class DualPaneFragment extends Fragment {
    private static final String DIAGNOSIS_FRAGMENT = "diagnosis_fragment";
    private static final String RESPONSE_FRAGMENT = "response_fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int index = getArguments().getInt(ViewPagerFragment.KEY_EMERGENCY_INDEX);
        getActivity().setTitle(EmergencyContents.names[index]);
        View view = inflater.inflate(R.layout.fragment_dualpane, container, false);

        FragmentManager fragmentManager = getChildFragmentManager();
        
        DiagnosisFragment savedDiagnosisFragment = (DiagnosisFragment) fragmentManager
                .findFragmentByTag(DIAGNOSIS_FRAGMENT);
        if (savedDiagnosisFragment == null) {
            DiagnosisFragment diagnosisFragment = new DiagnosisFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(ViewPagerFragment.KEY_EMERGENCY_INDEX, index);
            diagnosisFragment.setArguments(bundle);
            fragmentManager.beginTransaction()
                    .add(R.id.leftPlaceholder, diagnosisFragment, DIAGNOSIS_FRAGMENT)
                    .commit();
        }

        ResponseFragment savedResponseFragment = (ResponseFragment) fragmentManager
                .findFragmentByTag(RESPONSE_FRAGMENT);
        if (savedResponseFragment == null) {
            ResponseFragment responseFragment = new ResponseFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(ViewPagerFragment.KEY_EMERGENCY_INDEX, index);
            responseFragment.setArguments(bundle);
            fragmentManager.beginTransaction()
                    .add(R.id.rightPlaceholder, responseFragment, RESPONSE_FRAGMENT)
                    .commit();
        }
        
        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        getActivity().setTitle(getResources().getString(R.string.app_name));
    }
}
