package muzinda.sharon.testresources.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import muzinda.sharon.testresources.R;
import muzinda.sharon.testresources.model.EmergencyContents;
import muzinda.sharon.testresources.ui.DiagnosisFragment;
import muzinda.sharon.testresources.ui.ResponseFragment;

public class ViewPagerFragment extends Fragment {
    public static final String KEY_EMERGENCY_INDEX = "emergency_index";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int index = getArguments().getInt(KEY_EMERGENCY_INDEX);
        getActivity().setTitle(EmergencyContents.names[index]);
        View view = inflater.inflate(R.layout.fragment_viewpager, container, false);

        final DiagnosisFragment diagnosisFragment = new DiagnosisFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_EMERGENCY_INDEX, index);
        diagnosisFragment.setArguments(bundle);
        final ResponseFragment responseFragment = new ResponseFragment();
        bundle = new Bundle();
        bundle.putInt(KEY_EMERGENCY_INDEX, index);
        responseFragment.setArguments(bundle);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return position == 0 ? diagnosisFragment : responseFragment;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return position == 0 ? "Diagnosis" : "Response";
            }

            @Override
            public int getCount() {
                return 2;
            }
        });

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        getActivity().setTitle(getResources().getString(R.string.app_name));
    }
}
