package com.example.mycollection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class AboutActivity extends Activity implements OnClickListener {


	//declaring variables
	ImageView imageview;
	ScrollView scrollview;
	Button btnfb,btnIn,btngogle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);


		imageview=(ImageView)findViewById(R.id.imageView1);
		scrollview=(ScrollView)findViewById(R.id.sv);
		
		btnfb=(Button)findViewById(R.id.btnfb);
		btnfb.setOnClickListener(this);
		
		btnIn=(Button)findViewById(R.id.btnIn);
		btnIn.setOnClickListener(this);
		
		btngogle=(Button)findViewById(R.id.btngogle);
		btngogle.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnfb:
			break;
         case R.id.btnIn:
			
			break;
      case R.id.btngogle:
	
	break;

		default:
			break;
		}
	}

}
