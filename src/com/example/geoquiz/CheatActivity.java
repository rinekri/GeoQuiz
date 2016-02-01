package com.example.geoquiz;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class CheatActivity extends ActionBarActivity {
	public static final String EXTRA_TRUE_ANSWER_IS = "com.example.geoquiz.true_answer_is";
	
	private boolean true_answer_is;
	private Button mShowButton;
	private TextView mTextAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cheat);
		
		true_answer_is = getIntent().getBooleanExtra(EXTRA_TRUE_ANSWER_IS, false);
		mTextAnswer = (TextView) findViewById(R.id.text_answer);
		
		mShowButton = (Button) findViewById(R.id.show_answer_button);
		mShowButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (true_answer_is) {
					mTextAnswer.setText(R.string.true_button);
				} else {
					mTextAnswer.setText(R.string.false_button);
				}
				
			}
		});
		
		
	}
	
}