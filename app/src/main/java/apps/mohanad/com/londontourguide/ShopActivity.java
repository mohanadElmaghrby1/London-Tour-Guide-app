package apps.mohanad.com.londontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mohanad on 05/06/17.
 */

public class ShopActivity extends AppCompatActivity {
    /*the listView */
    private ListView list;

    /*the call image*/
    private ImageView callImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> shopList=new ArrayList<>();

        /*create a hotels objects*/
        shopList.add(new Location("Liberty" , "Regent St, Carnaby, London W1B 5AH, UK"
                , "442077341234" ,R.drawable.shop_liberty));
        shopList.add(new Location("The Shop at Bluebird" , "350 King's Rd, Chelsea, London SW3 5UU, UK"
                , "442073513873" ,R.drawable.shop_bluebird));
        shopList.add(new Location("Blitz" , "55-59 Hanbury St, London E1 5JP, UK"
                , "442073770730" ,R.drawable.shop_biltz));
        shopList.add(new Location("LN-CC" , " Late Night Chameleon Cafe, 18-24 Shacklewell Ln, London E8 2EZ, UK"
                , "442031740744" ,R.drawable.shop_llcc));

        //create adapter
        LocationAdapter locationAdapter = new LocationAdapter(this,shopList , R.color.shop_list_color);

        //get the list view
        list=(ListView)findViewById(R.id.location_list);
        //setting the listview adapter
        list.setAdapter(locationAdapter);

    }
}

