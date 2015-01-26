package training.luizgustavoquinelato.myapp_02;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.GridView; import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private String message;
    private ArrayList<String> data;
    private ArrayAdapter<String> adapter;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.data = new ArrayList<String>(); this.data.add("Item 1"); this.data.add("Item 2");
        this.data.add("Item 3"); this.count = 3;
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                data.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
        gridView.setAdapter(adapter);
    }
    public void addItem(View view) { count++;
        String newItem = String.format("Item %d", count);
        this.data.add(newItem);
        ((BaseAdapter) ((GridView)findViewById(R.id.gridView)).getAdapter()).notifyDataSetChanged();
    }

}
