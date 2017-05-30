package muzinda.sharon.testresources.model;

import muzinda.sharon.testresources.R;

public class EmergencyContents {

    //this array contains all the different categories
        public static String[] names = new String[]{"Diarrhoea Alert",
            "Vomiting Alert",
            "Fractures Emergency",
            "Cuts Emergency",
            "Burns Emergency",
            "Bites Emergency"
        };

    //This array contains the icons for each of the categories
        public static int[] resourceIds = new int[]{R.drawable.diarrhoea,
            R.drawable.vomiting,
            R.drawable.fractures,
            R.drawable.cuts,
            R.drawable.burns,
            R.drawable.bites
        };

    //This an array containing all the diagnosis
        public static String[] diagnosis = new String[]{/*diarrhoea*/"1. Repeated passing of loose or watery stool.'2. Can include stomach ache, vomiting, headache and fever",
                /*Vomiting*/"1. Involuntary expulsion of stomach contents through mouth or nose.'2. Can include stomach ache and diarrhoea.",
                /*Fractures*/"1. You heard a snap or grinding sound.'2. Swelling, bruising, or tenderness around the injured part.'3. Painful to touch or move.",
                /*cuts*/"1. Wound begins bleeding again after 5 minutes of continuously applying pressure.'2. Cut is on the face or neck of the Child.'3. Injury was caused by an animal or human bite, a burn, electrical injury, or puncture wound.'4. The cut appears to be deep.",
                /*burns*/"1. First degree burns: redness, pain, and minor swelling. The skin is dry without blisters.'2. Second-degree burns: blisters, severe pain, and redness.'3. Third degree burns: surface appears dry, looks waxy white, leathery, brown, or charred. There may be little or no pain or the area may feel numb at first because of nerve damage.",
                /*Bites*/"1. Bug bites and stings are usually just annoying, causing temporary discomfort and pain."
        };

    //This is an array containing all responses or treatments
        public static String[] responses = new String[]{/*diarrhoea*/"1. Increase fluid intake.'2. Offer milk or oral re-hydration solution(ORS) to infants and young children.'3. Give small frequent meals.'4. Avoid fruit juice and fizzy drinks, as well as sugary foods.",
            /*vomiting*/"1. Increase fluid intake; give small sips at a time.'2. Offer popsicles (ice lollies) to avoid dehydration.'3. Avoid solid food for up to 6 hours or until vomiting subsides.'4. Avoid fruit juice and fizzy drinks.",
            /*fractures*/"Gently remove clothing from around injured area.'2. Apply a cold compress or ice pack wrapped in cloth. Do not put ice directly on the skin.'3. Keep limb in the position you find it.'4. Place soft padding around the injured part.'5.  Get medical assistance.",
            /*cuts*/"1. Rinse the wound thoroughly with water to clean out dirt and debris.'2. Wash the wound with an antiseptic solution and water; rinse well.'3. Cover the wound with a sterile adhesive bandage or sterile gauze and adhesive tape.'4. If blood soaks through the gauze, do not remove it. Apply another gauze pad on top and continue applying pressure.",
            /*burns*/"1. Remove child from heat source.'2. Run cool(not cold) water over the area, or hold clean cold compress for 3 - 5 minutes.'3. Give child something for the pain.'4. Seek immediate medical attention for second and third degree burns.",
            /*bites*/"1. Remove stinger if it is still visible.'2. Wash the area with an antiseptic solution and water.'3. Apply ice pack or cold compress for a few minutes.'4. Give child something for the pain.'5. Seek immediate medical attention if bite was caused by an animal or human."
        };

    //Alerts
        public static String[]alerts = new String[]{/*diarrhoea*/"Get medical attention if there is blood or you suspect poisoning ",
            /*vomiting*/"Get medical attention if you suspect poisoning",
            /*fractures*/"Do not move the child if bone is protruding or injury includes head or neck",
            /*cuts*/"Get medical attention immediately if you cannot stop the bleeding in 5 minutes",
            /*burns*/"Get immediate medical attention if burn is on the face, scalp, hands, joint surfaces, or genitals",
            /*bites*/"Get immediate medical attention if child has allergic reaction"
    };

}





