package androgeek.ui.partialslidingdrawer;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androgeek.ui.partialslidingdrawer.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 50; i++) {
			strings.add(""+i);
		}
		SlidingDrawer drawer = (SlidingDrawer) findViewById(R.id.drawer);
		ListView listView = (ListView) drawer.getContent().findViewById(R.id.talk_list_content);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, strings);
		listView.setAdapter(adapter);
	} 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
