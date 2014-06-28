package com.example.menuitemexample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

	RelativeLayout relativeLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		relativeLayout = (RelativeLayout)findViewById(R.id.fondo);
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(Menu.NONE, 3, Menu.NONE, "Opcion1");
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		  switch (item.getItemId()) {
		    case R.id.background:
		      changeBackground();
		      return true;
		    case R.id.toast:
		      Toast.makeText(getBaseContext(), "Este mensaje proviene del menú del archivo XML.", 
		                     Toast.LENGTH_LONG).show();
		      return true;
		    case 3:
			      Toast.makeText(getBaseContext(), "Este mensaje proviene del menú del archivo Java.", 
			                     Toast.LENGTH_LONG).show();
			      return true;
		    default:
		      return super.onOptionsItemSelected(item);
		  }
		}
		    
		private void changeBackground() {
			relativeLayout.setBackgroundColor(Color.GREEN);
		}
}
