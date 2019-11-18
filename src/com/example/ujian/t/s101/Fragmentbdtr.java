package com.example.ujian.t.s101;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi") public class Fragmentbdtr extends Fragment{
	protected static final TextView eseq1 = null;
	EditText etbangundatar;
	Button btnbangundatar;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_bdtr, container, false);
		
		etbangundatar = (EditText)rootView.findViewById(R.id.etbdtr);
		btnbangundatar = (Button)rootView.findViewById(R.id.btnbdtr);
		
		btnbangundatar.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ans1 = etbangundatar.getText().toString();
				int ans11 = Integer.parseInt(etbangundatar.getText().toString());
				if(ans11 == 25){
					Toast.makeText(getActivity(), "benar", Toast.LENGTH_LONG).show();
				}
				else{
					Toast.makeText(getActivity(), "salah", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
		
		return rootView;
	}
}

