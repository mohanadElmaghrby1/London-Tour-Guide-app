package apps.mohanad.com.londontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mohanad on 05/06/17.
 */

public class HospitalActivity extends AppCompatActivity {
    /*the listView */
    private ListView list;

    /*the call image*/
    private ImageView callImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> hotelsList=new ArrayList<>();

        /*create a hotels objects*/
        hotelsList.add(new Location("University College Hospital" , "235 Euston Rd, Bloomsbury,uk"
                , "442034567890" ,R.drawable.hospital_collage));
        hotelsList.add(new Location("Royal London Hospital" , " Whitechapel Rd, Whitechapel, London E1 1BB, UK"
                , "442073777000" ,R.drawable.hospital_royal));
        hotelsList.add(new Location("King's College Hospital" , "Denmark Hill, Brixton, London SE5 9RS, UK"
                , "442032999000" ,R.drawable.hosiptal_kings));
        hotelsList.add(new Location("St Bartholomew's Hospital" , "W Smithfield, London EC1A 7BE, UK, Notting Hill"
                , "442034165000" ,R.drawable.hoisptal_st));

        //create adapter
        LocationAdapter locationAdapter = new LocationAdapter(this,hotelsList , R.color.hospital_list_color);

        //get the list view
        list=(ListView)findViewById(R.id.location_list);
        //setting the listview adapter
        list.setAdapter(locationAdapter);

    }
}

