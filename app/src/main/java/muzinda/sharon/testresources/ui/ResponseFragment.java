package muzinda.sharon.testresources.ui;

import muzinda.sharon.testresources.controller.CheckBoxesFragment;
import muzinda.sharon.testresources.model.EmergencyContents;

public class ResponseFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return EmergencyContents.responses[index].split("'");
    }
}
